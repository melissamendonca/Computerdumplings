package com.example.project;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "workoutServlet", value = "/workout-servlet")
public class WorkoutServlet extends HttpServlet {
    private String message = "";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
    HttpSession session = request.getSession(true);
    String[] s = (String[]) request.getParameterValues("workoutSelect");
    String w = concatWorkout(s);
    workoutGenerator(w);
    session.setAttribute("workoutGen", message);
    session.setAttribute("workout", w);
    response.sendRedirect("/workouts.jsp");
    }
    public String getMessage(){
        return message;
    }
    public String concatWorkout(String[] array){
        String workoutString = array[0];
        for (int i = 1; i <= array.length-2; i++ ){
        workoutString = workoutString + ", " + array[i];
        }
        if (array.length > 1) {
            workoutString = workoutString + ", and " + array[array.length - 1];
        }
        return workoutString;
    }
    public String initializeWorkout(String s){
        String[] workArray = s.split("\\s*,\\s*");
        String init = concatWorkout(workArray);
        return init;
    }
    public void workoutGenerator(String s){
        message = "";
        //categorical workouts
        String Abs = "Sit-ups: 3 sets of 10 reps" + "<br>" + "Planks: 3 sets of 45 seconds" + "<br>";
        String Back = "Pull-ups: 4 sets of 8 reps" + "<br>" + "Deadlifts: 4 sets of 6 reps" + "<br>";
        String Biceps = "Dumbbell Curls to the point of failure" + "<br>" ;
        String Calves = "Squats: 4 sets of 15" + "<br>" + "Jump Rope: 15 Minutes" + "<br>" + "Dumbbell Jump Squats: 4 sets of 10 reps" + "<br>";
        String Cardio = "Do exercises such as walking, running, climbing stairs, jumprope, etc. for at least 90 min a week, with at least 30 min on 3 days" + "<br>";
        String Chest = "Dips: 3 sets of 10 reps" + "<br>" + "Overhead Press: 3 sets of 8 reps" + "<br>";
        String Forearms = "Wrist Curls to the point of failure" + "<br>";
        String Glutes = "Romanian Deadlifts: 3 sets of 12 reps" + "<br>" + "Dumbbell Jump Squats: 4 sets of 10 reps" + "<br>" + "Deadlifts: 4 sets of 6 reps" + "<br>" ;
        String Hamstrings = "Squats: 4 sets of 15" + "<br>" + "Romanian Dead Lifts: 3 sets of 12 reps" + "<br>";
        String Shoulders = "Overhead Press: 3 sets of 8 reps" + "<br>" + "Dumbbell Lateral Press: 3 sets of 10 reps" + "<br>";
        String Triceps = "Dips: 3 sets of 10 reps" + "<br>" + "Bench Press: 4 sets of 5 reps" + "<br>";

        //individual workout
        String Squats = "Squats: 4 sets of 15" + "<br>";
        String RDLs = "Romanian Deadlifts: 3 sets of 12 reps" + "<br>";
        String JumpRope = "Jump Rope: 15 Minutes" + "<br>";
        String BenchPress = "Bench Press: 4 sets of 5 reps" + "<br>";
        String Dips = "Dips: 3 sets of 10 reps";
        String DumbbellJumpSquat = "Dumbbell Jump Squats: 4 sets of 10 reps";
        String Pullups = "Pull-ups: 4 sets of 8 reps";
        String OverheadPress = "Overhead Press: 3 sets of 8 reps";
        String DumbbellCurl = "Dumbbell Jump Squats: 4 sets of 10 reps";
        String WristCurls = "Wrist Curls: 3 sets of 15 reps";
        String Situps = "Sit-ups: 3 sets of 10 reps";
        String Deadlifts = "Deadlifts: 4 sets of 6 reps";
        String Walking = "Walking: At least 2.5 hours a week";
        String Planks = "Planks: 3 sets of 45 seconds";
        String DLP = "Dumbbell Lateral Press: 3 sets of 10 reps";

        if(s.contains("Abs")){
            message = message + "<br>" + Abs;
        }
        if(s.contains("Back")){
            message = message + "<br>" + Back;
        }
        if(s.contains("Biceps")){
            message = message + "<br>" + Biceps;
        }
        if(s.contains("Calves")){
            message = message + "<br>" + Calves;
        }
        if(s.contains("Cardio")){
            message = message + "<br>" + Cardio;
        }
        if(s.contains("Chest")){
            message = message + "<br>" + Chest;
        }
        if(s.contains("Forearms")){
            message = message + "<br>" + Forearms;
        }
        if(s.contains("Glutes")){
            message = message + "<br>" + Glutes;
        }
        if(s.contains("Hamstrings")){
            message = message + "<br>" + Hamstrings;
        }
        if(s.contains("Shoulders")){
            message = message + "<br>" + Shoulders;
        }
        if(s.contains("Triceps")){
            message = message + "<br>" + Triceps;
        }

        if(s.contains("Squats")){
            message = message + "<br>" + Squats;
        }
        if(s.contains("RDLs")){
            message = message + "<br>" + RDLs;
        }
        if(s.contains("Jump Rope")){
            message = message + "<br>" + JumpRope;
        }
        if(s.contains("Bench Press")){
            message = message + "<br>" + BenchPress;
        }
        if(s.contains("Dips")){
            message = message + "<br>" + Dips;
        }
        if(s.contains("Dumbbell Jump Squat")){
            message = message + "<br>" + DumbbellJumpSquat;
        }
        if(s.contains("Pull-ups")){
            message = message + "<br>" + Pullups;
        }
        if(s.contains("Overhead Press")){
            message = message + "<br>" + OverheadPress;
        }
        if(s.contains("Dumbbell Curls")){
            message = message + "<br>" + DumbbellCurl;
        }
        if(s.contains("Wrist Curls")){
            message = message + "<br>" + WristCurls;
        }
        if(s.contains("Sit-ups")){
            message = message + "<br>" + Situps;
        }
        if(s.contains("Deadlifts")){
            message = message + "<br>" + Deadlifts;
        }
        if(s.contains("Walking")){
            message = message + "<br>" + Walking;
        }
        if(s.contains("Planks")){
            message = message + "<br>" + Planks;
        }
        if(s.contains("Dumbbell Lateral Press")){
            message = message + "<br>" + DLP;
        }

    }


}
