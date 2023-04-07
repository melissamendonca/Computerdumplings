<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="main.js"></script>

<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="register-servlet" method="get">
<div id="register">
    <h3 class="text-center text-white pt-5">Registration Information</h3>
    <div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div id="login-box" class="col-md-12">
                    <form id="login-form" class="form" action="/login" method="post">
                        <h3 class="text-center text-info">Registration Information</h3>
                        <div class="form-group">
                            <label for="username" class="text-info">Username:</label><br>
                            <input type="text" name="username" id="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="password" class="text-info">Password:</label><br>
                            <input type="password" name="password" id="password" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="gender" class="text-info">Gender:</label><br>
                            <input type="text" name="gender" id="gender" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="age" class="text-info">Age:</label><br>
                            <input type="number" min="1" max="110" name="age" id="age" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="weight" class="text-info">Weight (lbs):</label><br>
                            <input type="number" min="1" name="weight" id="weight" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="height" class="text-info">Height (inches):</label><br>
                            <input type="text" name="height" id="height" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            <a href="href="login.jsp" class="text-info">Back to Login</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</form>
</body>
</html>
