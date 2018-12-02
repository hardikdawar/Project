<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    <title>Chitkara University</title>
    </head>
    <body>
      <div class="limiter">
		<div class="container-login100" style="background-color:black;">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-15 p-b-43">
				
        <div>
            <center> <img src="loginlogo1.png"  width="250" height="230" style="padding:40px 50px"></center>
    </div>
        
        <div style="padding:10px 50px;">
            <form action="password.jsp" method="post" autocomplete="off">
                                   <div class="p-t-10 p-b-9">
						<span class="txt1">
							Username
						</span>
					</div>
                
                <div class="wrap-input100 validate-input" data-validate = "Username is required">
						<input class="input100" type="email" name="email" >
						<span class="focus-input100"></span>
					</div>
                
                <div class="p-t-10 p-b-9">
						<span class="txt1">
							Login
						</span>
					</div>
                
                <center> <button type="submit" onclick="myFunction()" class="login100-form-btn">Submit</button></center>
                
          </form>
            
        </div>
    </div>
                </div>
      </div>
      


    </body>
</html>
