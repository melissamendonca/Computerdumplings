
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style><%@include file="/WEB-INF/workout.css"%></style>
<head>
    <title>Workout Generator</title>
</head>
<body>

<h1 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal "  >
    <span style = "font-size: 24px; "> <u>Workout Generator</u></span> <br> <br> <br>
</h1>

<h2 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal "  >

    Selection: <br>

    <form style= "font-size: 18px"; action="workout-servlet">
            Add Categorical Workouts: <br>
            <input type ="checkbox" name="workoutSelect" value="Abs" >Abs
            <input type ="checkbox" name="workoutSelect" value="Back">Back
            <input type ="checkbox" name="workoutSelect" value="Biceps">Biceps
            <input type ="checkbox" name="workoutSelect" value="Calves">Calves
            <input type ="checkbox" name="workoutSelect" value="Cardio">Cardio
            <input type ="checkbox" name="workoutSelect" value="Chest" >Chest
            <input type ="checkbox" name="workoutSelect" value="Forearms">Forearms
            <input type ="checkbox" name="workoutSelect" value="Glutes" >Glutes
            <input type ="checkbox" name="workoutSelect" value="Hamstrings">Hamstrings
            <input type ="checkbox" name="workoutSelect" value="Shoulders">Shoulders
            <input type ="checkbox" name="workoutSelect" value="Triceps" >Triceps <br> <br>
            Add Individual Workouts: <br>
            <input type ="checkbox" name="workoutSelect" value="Squats" >Squats
            <input type ="checkbox" name="workoutSelect" value="RDLs" >Romanian Deadlifts
            <input type ="checkbox" name="workoutSelect" value="Jump Rope">Jump Rope
            <input type ="checkbox" name="workoutSelect" value="Bench Press" >Bench Press
            <input type ="checkbox" name="workoutSelect" value="Dips">Dips
            <input type ="checkbox" name="workoutSelect" value="Dumbbell Jump Squat">Dumbbell Jump Squat
            <input type ="checkbox" name="workoutSelect" value="Pull-ups">Pull-ups
            <input type ="checkbox" name="workoutSelect" value="Overhead Press">Overhead Press
            <input type ="checkbox" name="workoutSelect" value="Dumbbell Curl">Dumbbell Curl
            <input type ="checkbox" name="workoutSelect" value="Wrist Curls" >Wrist Curls
            <input type ="checkbox" name="workoutSelect" value="Sit-ups">Sit-ups
            <input type ="checkbox" name="workoutSelect" value="Deadlifts">Deadlifts
            <input type ="checkbox" name="workoutSelect" value="Walking">Walking
            <input type ="checkbox" name="workoutSelect" value="Planks">Planks
            <input type ="checkbox" name="workoutSelect" value="Dumbbell Lateral Press">Dumbbell Lateral Press <br> <br>

            <input type="submit" value="Generate Workout">
        </select>
    </form>

</h2>

<h3 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal" >
    Generated Workout for: <span style = "color:#284fc2;"  >${workout} </span> <br>
    ${workoutGen}
</h3>

<h4>
    <div>
        <a style ="font-size: 12px; font-family: Verdana; font-weight: normal" href="main.jsp">Back to main</a>
    </div>
</h4>


</body>
</html>
