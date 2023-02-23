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
        System.out.println(UserDataSplited.length);
        User Username = new User();
        
        
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

class User {
    
    public String username(){
        //TODO
        return null;
    }
    
    public int height(){
        //TODO
        return 0;
    }
    
    public int weight(){
        //TODO
        return 0;
    }
    
    public int BMI(){
        //TODO
        return 0;
    }
    
    public int CalorieTracker(){
        //TODO
        return 0;
    }
    
    public int WaterTracker(){
        //TODO
        return 0;
    }
    
    public String[] workoutGen(){
        //TODO
        String[] workoutList = {"none"};
        return workoutList;
    }
}