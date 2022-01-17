<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 15, 2022, 4:32:24 PM
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
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label>First:</label>
            <input type="text" name="fvalue" id="arithmetic"> <br>
            <label>Second:</label>
            <input type="text" name="svalue" id="arithmetic"> <br>
            
            <button type="submit" name="calculate" value="add">+</button>
            <button type="submit" name="calculate" value="subtract">-</button>
            <button type="submit" name="calculate" value="multiply">*</button>
            <button type="submit" name="calculate" value="divide">%</button>
            
            <br>
            <p> </p>
            
            <br>
            <label>Result:</label>
            ${message} <br>
            
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
