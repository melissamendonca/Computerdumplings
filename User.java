/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

/**
 *
 * @author Ethan Judice, Cathleen Foret
 */
public class User {
    
    private String Username = null;
    private String Password = null;
    private int Height = 0;
    private int Weight = 0;
    private int BMI = 0;
    private int CalorieTracker = 0;
    private int WaterTracker = 0;
    private String WorkoutKeys = null;
    private String MedicineKeys = null;
    
    
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
    
}
