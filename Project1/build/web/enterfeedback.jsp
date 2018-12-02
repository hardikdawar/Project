<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String message=request.getParameter("message");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into feedback(firstname,lastname,email,phone,message)values('"+fname+"','"+lname+"','"+email+"','"+phone+"','"+message+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>


<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Enter marks of Students</title>

    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Main CSS-->
    <link href="edit_student/css/main.css" rel="stylesheet" media="all">
    
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}
th:nth-child(even) {background-color: #9c33ff;}
th:nth-child(odd) {background-color: #9c33ff;}
tr:nth-child(even) {background-color: #f2f2f2;}
tr:nth-child(odd) {background-color: #f2f2f2;}
p{
    text-align:center;
}
</style>
    
</head>
<body bgcolor="white">
    
  <script src="edit_student/vendor/jquery/jquery.min.js"></script>


    <!-- Main JS-->
    <script src="edit_student/js/global.js"></script>

</body>
</html>
