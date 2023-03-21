/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;

/**
 *
 * @author Ethan Judice, Cathleen Foret
 */
public class WaterTracker {
    private int recWaterIntake = 0;
    
    public int getWaterIntake(){
        
        return recWaterIntake;
    }
    
    public void waterIntakeCalc(int weight){
        recWaterIntake = weight / 2;
    }
    
    
}
