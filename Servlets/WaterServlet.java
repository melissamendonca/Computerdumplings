package com.example.project;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "waterServlet", value = "/water-servlet")
public class WaterServlet extends HttpServlet{
    private int recWaterIntake = 0;

    public int getWaterIntake(){


        return recWaterIntake;
    }
    public void waterIntakeCalc(int weight){
        recWaterIntake = weight / 2;
    }

    public void waterIntakeCalcExercise(int weight, int exercise){
        recWaterIntake = (weight / 2) + (( exercise / 30 ) * 12);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int exercise = Integer.parseInt(request.getParameter("exercise"));
        int weight = (int) request.getAttribute("weight");

        waterIntakeCalcExercise(weight, exercise);
        response.getWriter().println(recWaterIntake);

    }
}
