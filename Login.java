/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ethan Judice
 */
public class Login {
    
    public static String LoginPrompt() throws FileNotFoundException{
        
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
    
    public static String getUserData(int line) throws FileNotFoundException{
        
        String TextDoc = "UserInfo.txt";
        String Data = "";
        Scanner inFile = new Scanner(new FileReader(TextDoc));
        for(int i=0;i<line;i++){
            Data = inFile.nextLine();
        }
        
        return Data;
    }
    
    
}
