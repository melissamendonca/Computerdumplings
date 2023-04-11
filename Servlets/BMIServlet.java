package com.example.project;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "BMIServlet", value = "/BMI-servlet")
public class BMIServlet extends HttpServlet {
    private int BMI = 0;

    public void setBMI(int h, int w){
    int bmi = Math.round((float)(w / (h*h)) * 703);
    BMI = bmi;

    }
    public int getBMI(){
        return BMI;

    }

}


