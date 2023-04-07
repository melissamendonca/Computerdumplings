package com.example.project;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mainServlet", value = "/main-servlet")
public class MainServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //int water = (int) request.getAttribute("water");
        //System.out.println(water);

        //request.setAttribute("water", water);
        //RequestDispatcher waterRD = request.getRequestDispatcher("water.jsp");
        //waterRD.forward(request, response);

    }

}
