package com.example.project;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(name = "registerServlet", value = "/register-servlet")

public class RegisterServlet extends HttpServlet{
    private String userData = "";
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");

        String filename = "/WEB-INF/UserInfo.txt"; //does not work

        ServletContext context = getServletContext();
        String pathname = context.getRealPath(filename);

        String UserData = username + " " + password + " " + height + " " + weight + " 0  0  0  x,x,x x,0, " + gender + " " + age + " inactive";

        Scanner inFile = new Scanner(new FileReader(pathname));
        BufferedReader Reader = new BufferedReader(new FileReader(pathname));
        FileWriter writer = new FileWriter(pathname, true);
        writer.write("\n");
        writer.write(UserData);
        writer.close();

        userData = UserData;
        response.getWriter().print(userData);

        response.sendRedirect("src/main/UserInfo.txt"); //does not work
    }
}
