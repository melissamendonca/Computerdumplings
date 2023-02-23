/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package healthappsc;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author Ethan Judice
 */
public class HealthAppSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
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
        */
        User UserData = new User();
        UserData.UserSetData(UserDataSplited);
        
        
    }
    
    
}
