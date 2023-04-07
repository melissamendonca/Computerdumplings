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
                        request.setAttribute("username", username);

                        int BMI = User.getBMI();
                        int height = User.getHeight();
                        int weight = User.getWeight();

                        int water = User.getWater();

                        request.setAttribute("BMI", BMI);
                        request.setAttribute("height", height);
                        request.setAttribute("weight", weight);
                        request.setAttribute("water", water);

                        RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
                        rd.forward(request, response);



                        request.setAttribute("weight", weight);
                        RequestDispatcher rd2 = request.getRequestDispatcher("water-servlet");

                        rd2.forward(request, response);
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