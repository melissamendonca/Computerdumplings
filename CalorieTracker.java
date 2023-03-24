/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

/**
 *
 * @author Ethan Judice, Cathleen Foret
 */
public class CalorieTracker {
    private int recCalIntake = 0;
    
    public int getCalorieIntake(){
        
        return recCalIntake;
    }
    
    //uses the Harris-Benedict formula, which takes height and weight in centimeters and kilograms.
    public void calorieIntakeCalc(String Gender, int height, int weight, int age){ 
        int h = toCentimeters(height);
        int w = toKilos(weight);
        int calCalc = 0;
        double activeFactor = 1.3;
        
        if (Gender.equals("Male")){
           calCalc = (int) ((66.5 + (13.8 * w) + (5 * h)) - (6.8 * age));
           calCalc = (int) (calCalc * activeFactor);
        }
        
        if (Gender.equals("Female")){
           calCalc = (int) ((655.1 + (9.6 * w) + (1.9 * h)) - (4.7 * age));
           calCalc = (int) (calCalc * activeFactor);
        }
        
        recCalIntake = calCalc;
    }
    
     public int toKilos(int weight){
        int metricWeight = (int) (weight * 0.4535924);
        return metricWeight;
    }
    
    public int toCentimeters(int height){
        int metricHeight = (int) (height * 2.54);
        return metricHeight;
    }
    
}
