/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package healthappsc;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Ethan Judice, Cathleen Foret
 */
public class HealthAppSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        String UserDataString = Login.LoginPrompt();
        String OldData = UserDataString;
        //in text document, NewData will replace OldData
        String[] UserDataSplited = UserDataString.split("\\s+");
        /*
        UserDataSplited[0] is Username
        UserDataSplited[1] is Password
        UserDataSplited[2] is Height (inches)
        UserDataSplited[3] is weight (pounds)
        UserDataSplited[4] is BMI
        UserDataSplited[5] is CalorieTracker (daily intake)
        UserDataSplited[6] is WaterTracker (daily intake in ounces)
        UserDataSplited[7] is WorkoutKeys (keys seperated by only commas)
        UserDataSplited[8] is medKeys (keys seperated by only commas)
        ^also is in format (medName,weeklyDose)
        UserDataSplited[9] is Gender (male/female)
        UserDataSplited[10] is Age
        UserDataSplited[11] is ActiveFactorLabel (inactive, lightly, moderately, very, or extremely)
        */
        User UserData = new User();
        UserData.UserSetData(UserDataSplited);
        
        BMICalc BMIData = new BMICalc();
        
        CalorieTracker CalData = new CalorieTracker();
        CalData.calorieIntakeCalc(UserData.getGender(), UserData.getHeight(),UserData.getWeight(), UserData.getAge());
        UserData.setCalories(CalData.getCalorieIntake());
        
        MedicationTracker MedData = new MedicationTracker();
        
        WaterTracker WaterData = new WaterTracker();
        WaterData.waterIntakeCalc(UserData.getWeight());
        UserData.setWater(WaterData.getWaterIntake());
        
        WorkoutGen WorkoutGenData = new WorkoutGen();
        
        String NewData = UserData.getUsername() + " " + UserData.getPassword() + " " +  
                  UserData.getHeight() + " " + UserData.getWeight() + " " +
                  UserData.getBMI() + " " + UserData.getCalories() + " " +
                  UserData.getWater() + " " + UserData.getWorkoutKeys() + " " +
                  UserData.getMedKeys() + " " + UserData.getGender() + " " +
                  UserData.getAge() + " " + UserData.getActivityLabel() + " ";
                
         String path = "UserInfo.txt";
         Scanner inFile = new Scanner(new FileReader(path));
         StringBuffer buff = new StringBuffer();
         while(inFile.hasNextLine()){
               buff.append(inFile.nextLine() + System.lineSeparator());
         }
         String fileCont = buff.toString();
         inFile.close();
         fileCont = fileCont.replaceAll(OldData, NewData);
         FileWriter writer = new FileWriter(path);
         writer.append(fileCont);
         writer.flush();
        
    }
    
    
}
