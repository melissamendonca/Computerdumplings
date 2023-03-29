/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ethan Judice, Cathleen Foret
 */
public class Login {
    
    public static String LoginPrompt() throws FileNotFoundException, IOException{
        
        
        String UserData = "";
        String TextDoc = "UserInfo.txt";
        Scanner UserImput = new Scanner(System.in);
        Boolean isNewUser = null;
        while(1 == 1){
            System.out.println("Are you a new user? Type Yes or No");
            String UserImputString = UserImput.nextLine();
            if(UserImputString.equalsIgnoreCase("Yes")){
                isNewUser = true;
                break;
            }
            if(UserImputString.equalsIgnoreCase("No")){
                isNewUser = false;
                break;
            }
            else{
                System.out.println("Command not recognized, please try again.");
            }
        }
        
        
        if(isNewUser == false){
            while(UserData == ""){
                Scanner inFile = new Scanner(new FileReader(TextDoc));
                System.out.println("Please enter Username and Password, "
                                 + "seperated by a space: ");
                String UserImputString = UserImput.nextLine();
                String[] splitted = UserImputString.split("\\s+");
                if(splitted.length == 2){
                    int line = 0;
                    while(inFile.hasNextLine()){
                        line++;
                        if(inFile.nextLine().contains(UserImputString)){
                            UserData = getUserData(line);
                            return UserData;
                        }
                    }
                    System.out.println("Username or Password not recognized.");
                }
                else{
                    System.out.println("Format not recognized, try again.");
                }
            
            }
        return "ERROR";
    }
    if(isNewUser == true){
       return newUser();
    }    
        
        return "ERROR";
    }
    
    public static String getUserData(int line) throws FileNotFoundException{
        
        String TextDoc = "UserInfo.txt";
        String Data = "";
        Scanner inFile = new Scanner(new FileReader(TextDoc));
        for(int i=0;i<line;i++){
            Data = inFile.nextLine();
        }
        
        return Data;
    }
    
    public static String newUser() throws FileNotFoundException, IOException{
        String TextDoc = "UserInfo.txt";
        Scanner inFile = new Scanner(new FileReader(TextDoc));
        String UserData = "SampleName SamplePass 0 0 0 0 0 x,x,x x,0, Male 0 inactive";
        BufferedReader Reader = new BufferedReader(new FileReader(TextDoc));
        FileWriter writer = new FileWriter(TextDoc, true);
        writer.write("\n");
        writer.write(UserData);
        writer.close();
        return UserData;
    }
    
    
}
