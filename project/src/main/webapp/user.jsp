<%@ page import="com.example.project.OverwriteData" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/workout.css"%></style>
<html>
<head>
    <title>HealthDump Userpage</title>
</head>
<body>

<h1 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >
    <span style = "font-size: 24px; "> <u>User Info</u></span> <br> <br> <br>
</h1>

<h2 style="text-align: left; font-family: Verdana; font-weight: normal">
Username : ${username}
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newName">
    <button type="submit">change</button>
</form>
    <br>
Gender : ${gender} <br>
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newGen">
    <button type="submit">change</button>
</form>
    <br>
Age : ${age} <br>
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newAge">
    <button type="submit">change</button>
</form>
    <br>

Height : ${height} in <br>
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newH">
    <button type="submit">change</button>
</form>
    <br>
Weight : ${weight} lbs <br>
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newW">
    <button type="submit">change</button>
</form>
    <br>
Medication : ${meds}
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newMeds">
    <button type="submit">change</button>
</form>
Dosage : ${dosage}
<form action = "user-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;"> </span><input type="text" name="newD">
    <button type="submit">change</button>
</form>

</h2>

<h4>
    <div>
        <form action = "overwrite-servlet" method = "get">
            <span style ="font-size: 14px; color:#284fc2;">
            <button type="submit">logout</button>
            </span> <br> <br>
            </form>
        <a style ="font-size: 12px; font-family: Verdana; font-weight: normal" href="main.jsp">Back to main</a>
    </div>
</h4>

</body>
</html>
