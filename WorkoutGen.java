/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthappsc;
import java.util.Scanner;
/**
 *
 * @author Ethan Judice
 */
public class WorkoutGen {
    
    public String[] workoutList(String Keys){
        
        Boolean bool = true;
        Scanner UserImput = new Scanner(System.in);
        while(bool == true){
            System.out.println("Please select an option, type 1, 2, or 3:");
            System.out.println("1: Set Workout Keys");
            System.out.println("2: Generate recommended workout from keys");
            System.out.println("3: Exit");
            int option = UserImput.nextInt();
            switch (option) {
                case 1:
                        Keys = setNewKeys(Keys);
                        break;
                case 2:
                        genKeyWorkout(Keys);
                        break;
                case 3:
                        bool = false;
                        break;
                default: 
                        System.out.println("Command not recognised");
                        break;
            }
        }
        String[] workoutKeys = Keys.split(",");
        return workoutKeys;
    }
    
    public static String setNewKeys(String Keys){
        
        Boolean bool = true;
        String oldKeys = Keys;
        Keys = "";
        Scanner UserImput = new Scanner(System.in);
        while(bool == true){
            System.out.println("Please select what keys you would like.");
            System.out.println("For a list of valid keys, please type: List");
            System.out.println("To save keys, please type: Save ");
            System.out.println("To cancel changing keys, please type: Cancel");
            System.out.println("Current Selected Keys: ");
            String[] workoutKeys = Keys.split(",");
            for(int i=0; i<workoutKeys.length;i++){
                System.out.print(workoutKeys[i]);
                if(i+1 != workoutKeys.length){
                    System.out.print(", ");
                }
            }
            String Option = UserImput.nextLine();
            switch (Option) {
                case "List":
                        System.out.println("List of all valid workout keys:");
                        System.out.println("Hamstrings, Squats, RomDeadlifts");
                        System.out.println("Calves, JumpRope, Cardio");
                        System.out.println("Chest, BenchPress, Dips");
                        System.out.println("Back, DumbellJumpSquat, Pullups");
                        System.out.println("Shoulders, OverheadPress, Triceps");
                        System.out.println("Biceps, DumbellCurl, Forearms");
                        System.out.println("WristCurls, Abs, Situps");
                        System.out.println("Deadlifts, Walking, Planks");
                        System.out.println("DumbellLateralPress");
                        break;
                case "Hamstrings":
                        Keys = Keys + "Hamstrings";
                        break;
                case "Squats":
                        Keys = Keys + "Squats";
                        break;
                case "RomDeadlifts":
                        Keys = Keys + "RomDeadlifts";
                        break;
                case "Calves":
                        Keys = Keys + "Calves";
                        break;
                case "JumpRope":
                        Keys = Keys + "JumpRope";
                        break;
                case "Cardio":
                        Keys = Keys + "Cardio";
                        break;
                case "Chest":
                        Keys = Keys + "Chest";
                        break;
                case "BenchPress":
                        Keys = Keys + "BenchPress";
                        break;
                case "Dips":
                        Keys = Keys + "Dips";
                        break;
                case "Back":
                        Keys = Keys + "Back";
                        break;
                case "DumbellJumpSquat":
                        Keys = Keys + "DumbellJumpSquat";
                        break;
                case "Pullups":
                        Keys = Keys + "Pullups";
                        break;
                case "Shoulders":
                        Keys = Keys + "Shoulders";
                        break;
                case "OverheadPress":
                        Keys = Keys + "OverheadPress";
                        break;
                case "Triceps":
                        Keys = Keys + "Triceps";
                        break;
                case "Biceps":
                        Keys = Keys + "Biceps";
                        break;
                case "DumbellCurl":
                        Keys = Keys + "DumbellCurl";
                        break;
                case "Forearms":
                        Keys = Keys + "Forearms";
                        break;
                case "WristCurls":
                        Keys = Keys + "WristCurls";
                        break;
                case "Abs":
                        Keys = Keys + "Abs";
                        break;
                case "Situps":
                        Keys = Keys + "Situps";
                        break;
                case "Deadlifts":
                        Keys = Keys + "Deadlifts";
                        break;
                case "Walking":
                        Keys = Keys + "Walking";
                        break;
                case "DumbellLateralPress":
                        Keys = Keys + "DumbellLateralPress";
                        break;
                case "Planks":
                        Keys = Keys + "Planks";
                        break;
                
                case "Save":
                        bool = false;
                        Option = "End";
                        break;
                case "Cancel":
                        Keys = oldKeys;
                        bool = false;
                        Option = "End";
                        break;
                default: 
                        System.out.println("Command not recognised");
                        Option = "End";
                        break;
            }
        if(Option != "End"){
            Keys = Keys + ",";
        }
        
    }
        return Keys;
    }
    
    public static void genKeyWorkout(String Keys){
        
        String[] workoutKeys = Keys.split(",");
        int Squats = 0;
        int RomDeadlifts = 0;
        int JumpRope = 0;
        int BenchPress = 0;
        int Dips = 0;
        int DumbellJumpSquat = 0;
        int Pullups = 0;
        int OverheadPress = 0;
        int DumbellCurl = 0;
        int WristCurls = 0;
        int Situps = 0;
        int Deadlifts = 0;
        int Walking = 0;
        int DumbellLateralPress = 0;
        int Planks = 0;
        
        for(int i=0; i<workoutKeys.length; i++){
            String currentKey = workoutKeys[i];
            switch (currentKey) {
                case "Hamstrings":
                    if(RomDeadlifts == 0 && Squats == 0){
                        System.out.println("Hamstrings: A group of 3 muscles along the back of the thigh");
                        System.out.println("Excersises that target hamstrings: Romanian deadlifts and squats");
                        System.out.println("Squats: 4 sets of 15");
                        System.out.println("Romanian Deadlifts: 3 sets of 12 reps");
                        RomDeadlifts++;
                        Squats++;
                    }
                    else if(RomDeadlifts != 0){
                        System.out.println("For further hamstring training, incorperate squats into this routine");
                        System.out.println("Squats: 4 sets of 15");
                        Squats++;
                    }
                    else if(Squats != 0){
                        System.out.println("For further hamstring training, incorperate RDLs into this routine");
                        System.out.println("Romanian Dead Lifts: 3 sets of 12 reps");
                        RomDeadlifts++;
                    }
                    break;
                case "Squats":
                    if(Squats == 0){
                        System.out.println("Squats: 4 sets of 15");
                        System.out.println("Used to target calves, hamstrings, and hips");
                        System.out.println("Usually done from bodyweight, increasing weight should decrease reps per set to ~12");
                    }
                    Squats++;
                    break;
                case "RomDeadlifts":
                    if(RomDeadlifts == 0){
                        System.out.println("Romanian Deadlifts: 3 sets of 12 reps");
                        System.out.println("Used to target glutes, hamstrings, and abductors");
                        System.out.println("Needs to be weighted using dumbells or barbell");
                    }
                    RomDeadlifts++;
                    break;
                case "Calves":
                    if(JumpRope == 0 && DumbellJumpSquat == 0){
                        System.out.println("Calves: A muscle on the back part of your lower legs");
                        System.out.println("Excersises that target calves: Jump rope and dumbell jump squats");
                        System.out.println("Jump Rope: 15 Minutes");
                        System.out.println("Dumbell Jump Squats: 4 sets of 10 reps");
                        RomDeadlifts++;
                        Squats++;
                    }
                    else if(JumpRope != 0){
                        System.out.println("For further calve training, incorperate dumbell jump squats into this routine");
                        System.out.println("Dumbell Jump Squats: 4 sets of 10 reps");
                        DumbellJumpSquat++;
                    }
                    else if(DumbellJumpSquat != 0){
                        System.out.println("For further calve training, incorperate jump rope into this routine");
                        System.out.println("Jump Rope: 15 Minutes");
                        JumpRope++;
                    }
                    break;
                case "JumpRope":
                    if(JumpRope == 0){
                        System.out.println("Jump Rope: 15 Minutes (at least)");
                        System.out.println("While a type of cardio, will slightly work out your calves as well");
                        System.out.println("Alternate between going fast or slow every 60 seconds");
                        System.out.println("Obviously requires a jump rope to do");
                    }
                    JumpRope++;    
                    break;
                case "Cardio":
                    if(JumpRope == 0 && Walking == 0){
                        System.out.println("The purpose of doing cardio is to either burn calories or get your heart rate up");
                        System.out.println("Cardio excersises include walking, running, climing staris, jump rope, etc.");
                        System.out.println("Recommended cardio is 90 minutes a week, with 30 minutes of cardio on 3 days");
                        JumpRope++;
                        Walking++;
                    }
                    break;
                case "Chest":
                    if(Dips == 0 && OverheadPress == 0){
                        System.out.println("Upper chest workouts primarilly focus your pectoral muscles");
                        System.out.println("Excersises that target chest: Dips and overhead press");
                        System.out.println("Dips: 3 sets of 10 reps");
                        System.out.println("Overhead Press: 3 sets of 8 reps");
                        OverheadPress++;
                        Dips++;
                    }
                    else if(Dips != 0){
                        System.out.println("For further chest training, incorperate overhead presses into this routine");
                        System.out.println("Overhead Press: 3 sets of 8 reps");
                        OverheadPress++;
                    }
                    else if(OverheadPress != 0){
                        System.out.println("For further chest training, incorperate dips into this routine");
                        System.out.println("Dips: 3 sets of 10 reps");
                        Dips++;
                    }
                    break;
                case "BenchPress":
                    if(BenchPress == 0){
                        System.out.println("Bench Press: 4 sets of 5 reps");
                        System.out.println("Targets most of the upper body muscles");
                        System.out.println("Needs to be weighted using dumbells or barbell");
                        System.out.println("This is a strength training excersise, so these 5 reps should be pretty dificult/heavy");
                    }
                    BenchPress++;
                    break;
                case "Dips":
                    if(Dips == 0){
                        System.out.println("Dips: 3 sets of 10 reps");
                        System.out.println("Used to target triceps and chest muscles");
                        System.out.println("Requires you to be hanging on some king of ledge, such as a chair or bed");
                    }
                    Dips++;
                    break;
                case "Back":
                    if(Pullups == 0 && Deadlifts == 0){
                        System.out.println("Your back has many different kinds of muscles, all of which work together when excersising");
                        System.out.println("Excersises that target your back: Pullups and deadlifts");
                        System.out.println("Pullups: 4 sets of 8 reps");
                        System.out.println("Deadlifts: 4 sets of 6 reps");
                        Pullups++;
                        Deadlifts++;
                    }
                    else if(Pullups != 0){
                        System.out.println("For further back training, incorperate deadlifts into this routine");
                        System.out.println("Deadlifts: 4 sets of 6 reps");
                        Deadlifts++;
                    }
                    else if(Deadlifts != 0){
                        System.out.println("For further chest training, incorperate pullups into this routine");
                        System.out.println("Pullups: 4 sets of 8 reps");
                        Pullups++;
                    }
                    break;
                case "DumbellJumpSquat":
                    if(DumbellJumpSquat == 0){
                        System.out.println("Dumbell Jump Squats: 4 sets of 10 reps");
                        System.out.println("Used to work glutes, quads, hips, and calves");
                        System.out.println("Can require dumbells, but bodyweight technically works as well");
                    }
                    DumbellJumpSquat++;
                    break;
                case "Pullups":
                    if(Pullups == 0){
                        System.out.println("Pullups: 4 sets of 8 reps");
                        System.out.println("Used to work upper back muscles");
                        System.out.println("Requires a pullup bar, difficult unless muscles have been trained already");
                    }
                    Pullups++;
                    break;
                case "Shoulders":
                    if(OverheadPress == 0 && DumbellLateralPress == 0){
                        System.out.println("Your shoulder muscles help you be able to push rather than pull");
                        System.out.println("Excersises that target your shoulders: Overhead presses and dumbell lateral presses");
                        System.out.println("Overhead Press: 3 sets of 8 reps");
                        System.out.println("Dumbell Lateral Press: 3 sets of 10 reps");
                        OverheadPress++;
                        DumbellLateralPress++;
                    }
                    else if(OverheadPress != 0){
                        System.out.println("For further shoulder training, incorperate dumbell lateral presses into this routine");
                        System.out.println("Dumbell Lateral Press: 3 sets of 10 reps");
                        DumbellLateralPress++;
                    }
                    else if(DumbellLateralPress != 0){
                        System.out.println("For further shoudler training, incorperate overhead presses into this routine");
                        System.out.println("Overhead Press: 3 sets of 8 reps");
                        OverheadPress++;
                    }
                    break;
                case "OverheadPress":
                    if(OverheadPress == 0){
                        System.out.println("Overhead Press: 3 sets of 8 reps");
                        System.out.println("Used to work chest, shoulder, and triceps");
                        System.out.println("Needs to be weighted using dumbells or barbell");
                    }
                    OverheadPress++;
                    break;
                case "Triceps":
                    if(Dips == 0 && BenchPress == 0){
                        System.out.println("Your triceps generally refer to your back arm muscles");
                        System.out.println("Excersises that target your triceps: Dips and bench presses");
                        System.out.println("Dips: 3 sets of 10 reps");
                        System.out.println("Bench Press: 4 sets of 5 reps");
                        Dips++;
                        BenchPress++;
                    }
                    else if(Dips != 0){
                        System.out.println("For further tricep training, incorperate bench presses into this routine");
                        System.out.println("Bench Press: 4 sets of 5 reps");
                        BenchPress++;
                    }
                    else if(BenchPress != 0){
                        System.out.println("For further tricep training, incorperate dips into this routine");
                        System.out.println("Dips: 3 sets of 10 reps");
                        Dips++;
                    }
                    break;
                case "Biceps":
                    if(DumbellCurl == 0){
                        System.out.println("Bicep workouts are mainly just variations of dumbell curls.");
                        System.out.println("Dumbell Curls: 4 sets of 12 reps");
                        System.out.println("Because it's only one workout, be sure to go to point of failure");
                    }
                    DumbellCurl++;
                    break;
                case "DumbellCurl":
                    if(DumbellCurl == 0){
                        System.out.println("Dumbell Curls: 4 sets of 12 reps");
                        System.out.println("Used to target biceps");
                        System.out.println("Needs to be weighted using dumbells");
                    }
                    DumbellCurl++;
                    break;
                case "Forearms":
                    if(WristCurls == 0){
                        System.out.println("There arn't many propor ways to work out your forarms, though wrist curls are the most effective.");
                        System.out.println("Wrist Curls: 3 sets of 15 reps");
                        System.out.println("Because it's only one workout, be sure to go to point of failure");
                    }
                    WristCurls++;
                    break;
                case "WristCurls":
                    if(WristCurls == 0){
                        System.out.println("Wrist Curls: 3 sets of 15 reps");
                        System.out.println("Used to target wrist extensor and flexor muscles");
                        System.out.println("Needs to be weighted using dumbells");
                    }
                    WristCurls++;
                    break;
                case "Abs":
                    if(Situps == 0 && Planks == 0){
                        System.out.println("Your abs are your abdominal muscles, they give you a stronger core");
                        System.out.println("Excersises that target your abs: Situps and planks");
                        System.out.println("Situps: 3 sets of 10 reps");
                        System.out.println("Planks: 3 sets of 45 seconds");
                        Situps++;
                        Planks++;
                    }
                    else if(Situps != 0){
                        System.out.println("For further abs training, incorperate planks into this routine");
                        System.out.println("Planks: 3 sets of 45 seconds");
                        Planks++;
                    }
                    else if(Planks != 0){
                        System.out.println("For further abs training, incorperate situps into this routine");
                        System.out.println("Situps: 3 sets of 10 reps");
                        Situps++;
                    }
                    break;
                case "Situps":
                    if(Situps == 0){
                        System.out.println("Situps: 3 sets of 10 reps");
                        System.out.println("Used to target abs and hip flexor muscles");
                        System.out.println("Completely uses bodyweight");
                    }
                    Situps++;
                    break;
                case "Deadlifts":
                    if(Deadlifts == 0){
                        System.out.println("Deadlifts: 4 sets of 6 reps");
                        System.out.println("Works glutes, hamstring, core, and back");
                        System.out.println("Requires a barbell to do");
                    }
                    Deadlifts++;
                    break;
                case "Walking":
                    if(Walking == 0){
                        System.out.println("Walking/Running: 15 minutes (at least)");
                        System.out.println("This is a cardio excersise, meant to get heart rate up");
                        System.out.println("Can walk, run, climb stairs, use an eliptical, etc.");
                    }
                    Walking++;
                    break;
                case "DumbellLateralPress":
                    if(DumbellLateralPress == 0){
                        System.out.println("Dumbell Lateral Press: 3 sets of 10 reps");
                        System.out.println("Used to target shoulder muscles");
                        System.out.println("Requires 2 dumbells, one in each hand");
                    }
                    DumbellLateralPress++;
                    break;
                case "Planks":
                    if(Planks == 0){
                        System.out.println("Planks: 3 sets of 45 seconds");
                        System.out.println("Used to target abs");
                        System.out.println("Requires no workout equipment");
                    }
                    Planks++;
                    break;
                case "NULL":
                    System.out.println("No workout keys detected.");
                    break;
                
                default: 
                        System.out.println("Key: " + currentKey + " not recognised");
                        break;
            }
        }
    }
    
}
