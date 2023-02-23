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
        
        String UserDataString = Login();
        String OldData = UserDataString;
        System.out.println("UserData is: " + UserDataString);
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
        
        
    }
    
    public static String Login() throws FileNotFoundException{
        
        String UserData = "";
        String TextDoc = "UserInfo.txt";
        Scanner UserImput = new Scanner(System.in);
        while(UserData == ""){
            Scanner inFile = new Scanner(new FileReader(TextDoc));
            System.out.println("Please enter Username and Password, seperated "
                             + "by a space: ");
            String UserImputString = UserImput.nextLine();
            String[] splitted = UserImputString.split("\\s+");
            if(splitted.length == 2){
                int line = 0;
                while(inFile.hasNextLine()){
                    line++;
                    if(inFile.nextLine().contains(UserImputString)){
                        UserData = getData(line);
                        return UserData;
                    }
                }
                System.out.println("Username or Password not recognized.");
            }
            else{
                System.out.println("Format not recognized, try again.");
            }
            
        }
        
        return null;
        
    }
    
    public static String getData(int line) throws FileNotFoundException{
        
        String TextDoc = "UserInfo.txt";
        String Data = "";
        System.out.println(line);
        Scanner inFile = new Scanner(new FileReader(TextDoc));
        for(int i=0;i<line;i++){
            Data = inFile.nextLine();
        }
        
        return Data;
    }
    
}
