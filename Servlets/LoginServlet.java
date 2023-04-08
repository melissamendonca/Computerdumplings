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
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException, ServletException {

        response.setContentType("text/html");
        String UserData = "";
        String textDoc = "/WEB-INF/UserInfo.txt";
        ServletContext context = getServletContext();
        String pathname = context.getRealPath(textDoc);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String UserInputString = username + " " + password;

        String[] split = UserInputString.split("\\s+");

        FileReader fileReader = new FileReader(pathname);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        boolean loginSuccess = false;
            if (split.length == 2) {
                int lineCount = 0;
                while ((line = br.readLine()) != null) {
                    lineCount++;

                    if (line.contains(UserInputString)) {

                        UserData = extractUserData(lineCount);

                        String[] UserDataSplit = UserData.split("\\s+");
                        UserServlet User = new UserServlet();
                        User.UserSetData(UserDataSplit);

                        loginSuccess = true;

                        //initialize user
                        int BMI = User.getBMI();
                        int height = User.getHeight();
                        int weight = User.getWeight();
                        int calories = User.getCalories();
                        String gender = User.getGender();
                        int age = User.getAge();
                        String activityFactor = User.getActivityLabel();
                        int water = User.getWater();

                        String WorkoutKeys = User.getWorkoutKeys();
                        String MedKeys = User.getMedKeys();

                        HttpSession session = request.getSession(true);

                        //for front page
                        session.setAttribute("username", username);
                        session.setAttribute("BMI", BMI);
                        session.setAttribute("height", height);
                        session.setAttribute("weight", weight);

                        //for cal page
                        session.setAttribute("calories",calories );
                        session.setAttribute("cal_consumed",0);

                        //for water page
                        WaterServlet wasser = new WaterServlet();
                        wasser.waterIntakeCalc(weight);
                        User.setWater(wasser.getWaterIntake());

                        session.setAttribute("water", water);
                        session.setAttribute("water_consumed", 0);
                        session.setAttribute("exercise", 0);

                        //for cal page
                        session.setAttribute("activityFactor", activityFactor);
                        session.setAttribute("gender",gender);
                        session.setAttribute("age", age);
                        session.setAttribute("targetweight", weight);

                        CalorieServlet cal = new CalorieServlet();
                        cal.calorieIntakeCalc(gender,height,weight,age);
                        User.setCalories(cal.getCalorieIntake());
                        session.setAttribute("calories", calories);


                        //for workout page
                        session.setAttribute("workout",WorkoutKeys);

                        //for med page
                        MedicationServlet Meds = new MedicationServlet();
                        String meds = MedKeys;
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

        String textDoc = "/WEB-INF/UserInfo.txt";
        ServletContext context = getServletContext();
        String pathname = context.getRealPath(textDoc);
        String Data = "";
        Scanner inFile = new Scanner(new FileReader(pathname));
        for(int i=0;i<line;i++){
            Data = inFile.nextLine();
        }

        return Data;
    }


    public void destroy() {
    }
}