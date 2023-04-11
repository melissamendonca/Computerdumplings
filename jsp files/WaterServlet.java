package com.example.project;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "waterServlet", value = "/water-servlet")
public class WaterServlet extends HttpServlet{
    private int recWaterIntake = 0;
    private int exercise;
    private int weight;
    private int waterCount;

    public int getWaterIntake(){
        return recWaterIntake;
    }


    public void waterIntakeCalc(int weight){
        recWaterIntake = weight / 2;
    }

    public void waterIntakeCalcExercise(int weight, int exercise){
        recWaterIntake = ((weight / 2) + (( exercise / 30 ) * 12));

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(true);

        if(request.getParameter("exercise") != null) {
            exercise = (int) session.getAttribute("exercise") + Integer.parseInt(request.getParameter("exercise"));
            weight = (int) session.getAttribute("weight");

            waterIntakeCalcExercise(weight, exercise);
            session.setAttribute("water", recWaterIntake);
            session.setAttribute("exercise", exercise);
        }

        if(request.getParameter("newConsumedVal") != null){
            waterCount = (int) session.getAttribute("water_consumed") + Integer.parseInt(request.getParameter("newConsumedVal"));
            session.setAttribute("water_consumed", waterCount);

        }


        String water_page_message;
        String main_page_message;
        if(waterCount >= recWaterIntake){
            water_page_message = "You've reached your water goal!";
            main_page_message = "Daily Water Goal Reached!";
        }
        else{
            water_page_message = "";
            main_page_message = "";
        }
        session.setAttribute("water_done", water_page_message);
        session.setAttribute("water_done_main",main_page_message);


        response.sendRedirect("/water.jsp");

    }
}
