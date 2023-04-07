package com.example.project;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {
    private String Username = null;
    private String Password = null;
    private int Height = 0;
    private int Weight = 0;
    private int BMI = 0;
    private int CalorieTracker = 0;
    private int WaterTracker = 0;
    private String WorkoutKeys = null;
    private String MedicineKeys = null;
    private String Gender = null;
    private int Age = 0;
    private String ActivityFactorLabel = null;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String username = "hey";
        int height = this.getHeight();
        int weight = this.getWeight();
        int BMI = this.getBMI();

        request.setAttribute("username", username);
        request.setAttribute("height", height);
        request.setAttribute("weight", weight);
        request.setAttribute("BMI", BMI);




    }




    public void UserSetData(String[] Data){
        Username = Data[0];
        Password = Data[1];
        Height = Integer.parseInt(Data[2]);
        Weight = Integer.parseInt(Data[3]);
        BMI = Integer.parseInt(Data[4]);
        CalorieTracker = Integer.parseInt(Data[5]);
        WaterTracker = Integer.parseInt(Data[6]);
        WorkoutKeys = Data[7];
        MedicineKeys = Data[8];
        Gender = Data[9];
        Age = Integer.parseInt(Data[10]);
        ActivityFactorLabel = Data[11];
    }

//mutator methods

    public void setUsername(String newName){
        Username = newName;
    }

    public void setPassword(String newPass){
        Password = newPass;
    }

    public void setHeight(int newHeight){
        Height = newHeight;
    }

    public void setWeight(int newWeight){
        Weight = newWeight;
    }

    public void setBMI(int newBMI){
        BMI = newBMI;
    }

    public void setCalories(int newCal){
        CalorieTracker = newCal;
    }

    public void setWater(int waterIntake){
        WaterTracker = waterIntake;
    }

    public void setWorkoutKeys(String newWorkKeys){
        WorkoutKeys = newWorkKeys;
    }

    public void setMedKeys(String newMedKeys){
        MedicineKeys = newMedKeys;
    }

    public void setGender(String newGender){
        Gender = newGender;
    }

    public void setAge(int newAge){
        Age = newAge;
    }

    public void setActivityFactor(String newActLabel){
        ActivityFactorLabel = newActLabel;
    }


    //accessor methods
    public String getUsername(){
        return Username;
    }

    public String getPassword(){
        return Password;
    }

    public int getHeight(){
        return Height;
    }

    public int getWeight(){
        return Weight;
    }

    public int getBMI(){
        return BMI;
    }

    public int getCalories(){
        return CalorieTracker;
    }

    public int getWater(){
        return WaterTracker;
    }

    public String getWorkoutKeys(){
        return WorkoutKeys;
    }

    public String getMedKeys(){
        return MedicineKeys;
    }

    public String getGender(){
        return Gender;
    }

    public int getAge(){
        return Age;
    }

    public String getActivityLabel(){
        return ActivityFactorLabel;
    }







}
