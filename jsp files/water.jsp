
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style><%@include file="/WEB-INF/pages.css"%></style>


<head>
    <title>Daily Water Intake</title>
</head>
<body>

<h1 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal "  >
    <span style = "font-size: 24px; "> <u>Daily Water</u></span> <br> <br> <br>
</h1>

<h2 style ="color:#000000; font-size: 20px; font-family: Verdana; font-weight: normal " >
<form action = "water-servlet" method = "get">
    You should drink at least <span style = "color:#284fc2;" > ${water} </span> oz of water today <br> <br>
    You have consumed <span style = "color:#284fc2;" >${water_consumed} </span> oz <br> <br> <br>
    <span style ="font-size: 16px; color:#284fc2;"> Enter total workout length in minutes to recalculate amount </span><input type="text" name="exercise"><button type="submit">Enter</button>

</form>

    <form action = "water-servlet" method = "get">
        <span style ="font-size: 16px; color:#284fc2;"> Enter amount of water consumed (in oz):</span> <input type="text" name="newConsumedVal">
        <button type="submit">Enter</button>

    </form>
    <div>
        <a style ="font-size: 12px;" href="main.jsp">Back to main</a>
    </div>
</h2>

</body>
</html>
