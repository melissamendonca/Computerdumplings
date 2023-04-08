
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style><%@include file="/WEB-INF/pages.css"%></style>
<head>
    <title>Calories</title>
</head>
<body>


<h1 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >
    <span style = "font-size: 24px; "> <u>Daily Calories</u></span> <br> <br> <br>
</h1>

<h2 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >
    You should consume around <span style = "color:#284fc2;"  >${calories} </span> calories a day to maintain a weight of
    <span style = "color:#284fc2;"  >${targetweight} </span> lbs if you are
    <span style = "color:#284fc2;"  >${activityFactor} </span> active
     <br> <br>

    <span style ="font-size: 18px; color:#000000;">You have consumed:
            <span style ="color:#284fc2"> ${cal_consumed} </span> calories</span> <br> <br>

    <span style = "font-size: 18px; color:#284fc2;"> select activity level and target weight to recalculate </span>
<form action="cal-servlet">
    <select name="label">
        <option value="not">not</option>

        <option value="lightly" >lightly</option>

        <option value="moderately" >moderately</option>

        <option value="very">very</option>

        <option value="extremely">extremely</option>

        <input type ="text" name="targetweight">

        <input type="submit" value="recalculate">

    </select>

</form>

<br>

    <form action = "cal-servlet" method = "get">
        <span style ="font-size: 16px; color:#284fc2;">Enter amount consumed: </span><input type="text" name="amount"><button type="submit">Enter</button>
    </form>

    <br>

    <div>
        <a style ="font-size: 12px; font-family: Verdana;" href="main.jsp">Back to main</a>
    </div>
</h2>







</body>
</html>
