package com.example.project;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "medsServlet", value = "/meds-servlet")
public class MedicationServlet extends HttpServlet {

    private int numTaken = 0;
    private int dosage = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(true);

        dosage = Integer.parseInt((String) session.getAttribute("dosage"));
        numTaken = Integer.parseInt(request.getParameter("taken")) + (int) session.getAttribute("taken");

        session.setAttribute("taken", numTaken);
        response.sendRedirect("/meds.jsp");

        String meds_page_message;
        String main_page_message;
        if(numTaken == dosage){
            meds_page_message = "You've taken the recommended dosage for your medication.";
            main_page_message = "Daily Medication Dose Reached!";
        }
        else if(numTaken > dosage){
            meds_page_message = "Warning! You've gone over the recommended dosage for your medication!";
            main_page_message = meds_page_message;
        }
        else{
            meds_page_message = "";
            main_page_message = "";
        }
        session.setAttribute("meds_done", meds_page_message);
        session.setAttribute("meds_done_main", main_page_message);


    }

public List<String> splitMeds(String unsplit){

        String[] splitArray = unsplit.split("\\s*,\\s*");
        List<String> medsList = new ArrayList<String>(Arrays.asList(splitArray));

        return medsList;
}








}
