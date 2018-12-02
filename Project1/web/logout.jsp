<%-- 
    Document   : logout
    Created on : Dec 2, 2018, 9:39:40 PM
    Author     : Hardik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
session.invalidate();
response.sendRedirect("index.html");
%>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
