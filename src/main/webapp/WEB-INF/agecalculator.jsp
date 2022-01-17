<%-- 
    Document   : agecalculator
    Created on : Jan 13, 2022, 3:10:51 PM
    Author     : ivanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label for="age">Enter your age:</label>
            <input type="number" name="age" id="age"> <br>
            <input type="submit" value="Age next birthday"> <br>
            ${message} <br>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
        
    </body>
</html>
