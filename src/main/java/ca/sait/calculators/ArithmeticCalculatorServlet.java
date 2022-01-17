/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculators;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivanl
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        
        try {
            String firstValue = request.getParameter("fvalue");
            String secValue = request.getParameter("svalue");

            int fvalue = Integer.parseInt(firstValue);
            int svalue = Integer.parseInt(secValue);

            String compute = request.getParameter("calculate");        

            if(firstValue != null && secValue != null){

                if(compute.equals("add")){
                    request.setAttribute("message", fvalue + svalue);
                }
                else if(compute.equals("subtract")){
                    request.setAttribute("message", fvalue - svalue);
                }
                else if(compute.equals("multiply")){
                    request.setAttribute("message", fvalue * svalue);
                }
                else if(compute.equals("divide")){
                    request.setAttribute("message", fvalue / svalue);
                }                      
            } else {
                request.setAttribute("message", "---");
            }
        } catch (Exception ex){
            request.setAttribute("message", "Invalid");
        }

        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
}
