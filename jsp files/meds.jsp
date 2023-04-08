
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style><%@include file="/WEB-INF/pages.css"%></style>
<head>
    <title>Meds</title>
</head>
<body>

<h1 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >
    <span style = "font-size: 24px; "> <u>Daily Medications</u></span> <br> <br> <br>
</h1>

<h2 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >


    You have taken <span style = "color:#284fc2;" > ${taken} </span> doses of  <span style = "color:#284fc2;" >${meds} </span>
    and have <span style = "color:#284fc2;" > ${dosage-taken} </span> remaining <br>


<form action = "meds-servlet" method = "get">
    <span style ="font-size: 16px; color:#284fc2;">Enter amount consumed: </span><input type="text" name="taken">
    <button type="submit">Enter</button>

</form>

    <div>
        <a style ="font-size: 12px;" href="main.jsp">Back to main</a>
    </div>
</h2>


</body>
</html>
