/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johnn
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        request.setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstStr = request.getParameter("first");
        String secondStr = request.getParameter("second");
        String operation = request.getParameter("operation");
        String message = "---";
        
        
        try{
        double first = Double.parseDouble(firstStr);
        double second = Double.parseDouble(secondStr);
        double result;
        System.out.println(first + " " + second);
        
        switch(operation){
           case "+": {
                result = first + second;
                break;
            }
           case "-": {
               result = first - second;
               // i thought it was weird the way you showed in class
               break;
            }
           case "*": {
               result = first * second;
               break;
            }
           case "%": {
               result = first % second;
               break;
            }
           default: {
               result = Double.NaN; //Not a number 
               break;
           }          
        }
        //result = Double.NaN doesn't work!
        if(Double.isNaN(result)){
            message = "Result is not a number";
        } else {
            //message = Double.toString(result);
            message = String.format("%.4f", result);
            // shows 4 decimals
        }
        
        
        } 
        catch (Exception ex){
            message = "invalid";
        }
        
        request.setAttribute("message", message);
//        request.setAttribute("first", firstStr);
//        request.setAttribute("second", secondStr);
       
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
