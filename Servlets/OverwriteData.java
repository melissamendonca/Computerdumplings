package com.example.project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Scanner;

@WebServlet(name = "overwriteServlet", value = "/overwrite-servlet")
public class OverwriteData extends HttpServlet {
    private String newData = "";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(true);


        String user = (String) session.getAttribute("username");
        String pass = (String) session.getAttribute("password");
        int height = (int) session.getAttribute("height");
        int weight = (int) session.getAttribute("weight");
        int BMI = (int) session.getAttribute("BMI");
        int cal = (int) session.getAttribute("calories");
        int water = (int) session.getAttribute("water");
        String workouts = (String) session.getAttribute("workout");
        workouts = workouts.replaceAll("\\s+","");
        workouts = workouts.replaceAll("and","");
        String meds = (String) session.getAttribute("meds");
        String dose = (String) session.getAttribute("dosage");
        String gen = (String) session.getAttribute("gender");
        int age = (int) session.getAttribute("age");
        String aF = (String) session.getAttribute("activityFactor");

        newData = user + " " + pass + " " + height + " " + weight + " " + BMI + " " + cal + " " + water + " " + workouts + " " + meds + "," + dose + ", " + gen + " " + age + " " + aF;

        String userHome = System.getProperty("user.home");
        String fl = userHome + "\\Desktop\\UserInfo.txt";

        String oldData = (String) session.getAttribute("oldData");
        System.out.println(oldData);

        File f = new File(fl);
        BufferedReader b = new BufferedReader(new FileReader(f));
        StringBuilder s = new StringBuilder();
        String st;
        while( (st = b.readLine()) != null){
             st = st.replace(oldData, newData);
             s.append(st);
             s.append(System.getProperty("line.separator"));
        }
        b.close();
        BufferedWriter w = new BufferedWriter(new FileWriter(f));
        w.write(s.toString());
        w.close();








        response.sendRedirect("/index.jsp");

    }
}
