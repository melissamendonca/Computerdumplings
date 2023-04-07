
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Daily Water Intake</title>
</head>
<body>


Your Current Water Goal is: ${water} oz
<br>
<br>
<form action = "water-servlet" method = "get">
To change your water goal, enter the amount you exercise or plan to exercise today:
    <input type="text" name="exercise">
    <button type="submit">Enter</button>
</form>

</body>
</html>
