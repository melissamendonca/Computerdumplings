/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

/**
 *
 * @author Ethan Judice
 */
public class User {
    
    String Username = null;
    String Password = null;
    int Height = 0;
    int Weight = 0;
    int BMI = 0;
    int CalorieTracker = 0;
    int WaterTracker = 0;
    String WorkoutKeys = null;
    
    
    public void UserSetData(String[] Data){
        Username = Data[0];
        Password = Data[1];
        Height = Integer.parseInt(Data[2]);
        Weight = Integer.parseInt(Data[3]);
        BMI = Integer.parseInt(Data[4]);
        CalorieTracker = Integer.parseInt(Data[5]);
        WaterTracker = Integer.parseInt(Data[6]);
        WorkoutKeys = Data[7];
    }
    
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
    
}
