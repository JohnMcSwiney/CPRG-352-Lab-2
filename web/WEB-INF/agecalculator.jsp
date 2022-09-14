<%-- 
    Document   : agecalculator
    Created on : 12-Sep-2022, 12:31:17 PM
    Author     : johnn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Next Birthday Wizard</h1>
        <form action="age" method="POST">
            
            <table>
                <tr>
                    <td>Enter your age:</td>
                    <td><input type="number" id="age" name="age" value=" " min="0"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Age of Next Birthday"></td>
                </tr>
            </table>
                
            <%= request.getAttribute("message") %>
            
             <p> <a href="http://localhost:8080/Lab2/arithmetic" target="target">Arithmetic Calculator</a> </p>
                
            
        </form>
        
    </body>
</html>
