package com.example.project;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CalorieServlet", value = "/cal-servlet")
public class CalorieServlet extends HttpServlet {
    private int recCalIntake = 0;
    private double activeFactor = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(true);

        if (request.getParameter("label") != null){
            String s = request.getParameter("label");
            int w = Integer.parseInt(request.getParameter("targetweight"));
            session.setAttribute("targetweight", w);


        String g = (String) session.getAttribute("gender");
        int h = (int) session.getAttribute("height");
        int a = (int) session.getAttribute("age");

        setActiveFactor(s);
        calorieIntakeCalc(g, h, w, a);

        session.setAttribute("calories", recCalIntake);
        session.setAttribute("activityFactor", s);

        response.sendRedirect("/calories.jsp");
    }

        if (request.getParameter("amount") != null) {

            int calIntake = (int) session.getAttribute("cal_consumed") + Integer.parseInt(request.getParameter("amount"));
            session.setAttribute("cal_consumed", calIntake);
            response.sendRedirect("/calories.jsp");
        }




    }

    public int getCalorieIntake(){
        return recCalIntake;
    }
    public void calorieIntakeCalc(String Gender, int height, int weight, int age){
        int h = toCentimeters(height);
        int w = toKilos(weight);
        int calCalc = 0;

        if (Gender.equals("Male")){
            calCalc = (int) ((66.5 + (13.8 * w) + (5 * h)) - (6.8 * age));
            calCalc = (int) (calCalc * activeFactor);
        }

        if (Gender.equals("Female")){
            calCalc = (int) ((655.1 + (9.6 * w) + (1.9 * h)) - (4.7 * age));
            calCalc = (int) (calCalc * activeFactor);
        }

        recCalIntake = calCalc;
    }
    public void setActiveFactor(String activityLvl){
        switch(activityLvl){
            case "not":
                activeFactor = 1.2;//sedentary; little or no exercise
                break;
            case "lightly":
                activeFactor = 1.375; //light exercise or sports 1-3 days a week
                break;
            case "moderately":
                activeFactor = 1.550; //moderate exercise or sports 3-5 days a week
                break;
            case "very":
                activeFactor = 1.725; //hard exercise or sports 6-7 days a week
                break;
            case "extremely":
                activeFactor = 1.9; //very hard exercise or sports AND physical job or training
                break;
        }
    }

    public int toKilos(int weight){
        int metricWeight = (int) (weight * 0.4535924);
        return metricWeight;
    }

    public int toCentimeters(int height){
        int metricHeight = (int) (height * 2.54);
        return metricHeight;
    }




}
