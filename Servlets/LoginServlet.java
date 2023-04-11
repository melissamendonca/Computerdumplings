package com.example.project;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException, ServletException {

        response.setContentType("text/html");
        String UserData = "";

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String UserInputString = username + " " + password;

        String[] split = UserInputString.split("\\s+");

        String userHome = System.getProperty("user.home");
        String file= userHome + "\\Desktop\\UserInfo.txt";
        File f = new File(file);

        Scanner scanner = new Scanner(f);
        String line;
        boolean loginSuccess = false;
            if (split.length == 2) {
                int lineCount = 0;
                while ((line = scanner.nextLine()) != null) {
                    lineCount++;

                    if (line.contains(UserInputString)) {

                        UserData = extractUserData(lineCount);

                        HttpSession session = request.getSession(true);
                        session.setAttribute("oldData", UserData);

                        String[] UserDataSplit = UserData.split("\\s+");
                        UserServlet User = new UserServlet();
                        User.UserSetData(UserDataSplit);

                        loginSuccess = true;

                        //initialize user
                        String name = User.getUsername();
                        int height = User.getHeight();
                        int weight = User.getWeight();
                        User.setBMI(height, weight);


                        int BMI = Math.round(((float) weight / (height*height)) * 703) ;

                        int calories = User.getCalories();
                        String gender = User.getGender();
                        int age = User.getAge();
                        String activityFactor = User.getActivityLabel();
                        int water = User.getWater();

                        String WorkoutKeys = User.getWorkoutKeys();
                        String MedKeys = User.getMedKeys();

                        session.setAttribute("password", password);

                        //for front page
                        session.setAttribute("username", name);
                        session.setAttribute("BMI", BMI);
                        session.setAttribute("height", height);
                        session.setAttribute("weight", weight);

                        //for user page
                        session.setAttribute("age", age);

                        //for water page
                        WaterServlet wasser = new WaterServlet();
                        wasser.waterIntakeCalc(weight);
                        User.setWater(wasser.getWaterIntake());

                        session.setAttribute("water", water);
                        session.setAttribute("water_consumed", 0);
                        session.setAttribute("exercise", 0);

                        //for cal page
                        session.setAttribute("calories",calories );
                        session.setAttribute("cal_consumed",0);
                        session.setAttribute("activityFactor", activityFactor);
                        session.setAttribute("age", age);
                        session.setAttribute("targetweight", weight);
                        session.setAttribute("gender", gender);

                        CalorieServlet cal = new CalorieServlet();
                        cal.calorieIntakeCalc(gender,height,weight,age);
                        User.setCalories(cal.getCalorieIntake());
                        session.setAttribute("calories", calories);


                        //for workout page
                        WorkoutServlet ws = new WorkoutServlet();
                        String st  = ws.initializeWorkout(WorkoutKeys);
                        ws.workoutGenerator(st);
                        String m = ws.getMessage();
                        session.setAttribute("workout", st);
                        session.setAttribute("workoutGen", m);

                        //for med page
                        MedicationServlet Meds = new MedicationServlet();
                        List<String> medsList = Meds.splitMeds(MedKeys);
                        session.setAttribute("meds", medsList.get(0));
                        session.setAttribute("dosage", medsList.get(1));
                        session.setAttribute("taken",0);

                        //send to main after login
                        RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
                        rd.forward(request, response);

                    }

                }
                if (!loginSuccess) {
                    response.getWriter().println("Incorrect Username and/or Password");
                }
            }

            else response.getWriter().println("Format Not Supported");
    }
    public String extractUserData(int line) throws FileNotFoundException{
        String userHome = System.getProperty("user.home");
        String file= userHome + "\\Desktop\\UserInfo.txt";
        File f = new File(file);

        String Data = "";
        Scanner scanner = new Scanner(f);
        for(int i=0;i<line;i++){
            Data = scanner.nextLine();
        }

        return Data;
    }


    public void destroy() {
    }
}