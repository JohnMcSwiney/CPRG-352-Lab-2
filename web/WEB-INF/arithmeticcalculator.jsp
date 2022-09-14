<%-- 
    Document   : arithmeticcalculator
    Created on : 14-Sep-2022, 11:04:56 AM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <table>
                <tr>
                    <td>
                        First:
                    </td>
                    <td>
                        <input type ="number" name ="first" id="first" value="">
                    </td>
                </tr>
                <tr>
                    <td>
                        Second:
                    </td>
                    <td>
                        <input type ="number" name ="second" id="second" value="">
                    </td>
                </tr>
                
            </table>
            <p></p>
            <table>
                <tr>
                    <td>
                        <button type="submit" name="operation" value="+">+</button>
                    </td>
                    <td>
                        <button type="submit" name="operation" value="-">-</button>
                    </td>
                    <td>
                        <button type="submit" name="operation" value="*">*</button>
                    </td>
                    <td>
                        <button type="submit" name="operation" value="%">%</button>
                    </td>  
                </tr>
            </table>

            <table>
                <tr>
                    <td>Result: </td>
                    <td><%= request.getAttribute("message") %></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="http://localhost:8080/Lab2" target="target">Next Birthday Wizard</a></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
