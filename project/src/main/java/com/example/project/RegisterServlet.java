package com.example.project;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(name = "registerServlet", value = "/register-servlet")

public class RegisterServlet extends HttpServlet{
   private String userData;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");

        String userHome = System.getProperty("user.home");
        String filelocation = userHome + "\\Desktop\\UserInfo.txt";

        File f = new File(filelocation);

        if (!f.exists()) {
            f.createNewFile();
        }

        userData = username + " " + password + " " + height + " " + weight + " 0  0  0  x,x,x x,0, "
                + gender + " " + age + " inactive";

        FileWriter writer = new FileWriter(filelocation, true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.newLine();
        bw.write(userData);
        bw.flush();
        bw.close();

        response.sendRedirect("login.jsp");
    }
}
