/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author HP
 */
public class login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String email1 = request.getParameter("email");
        String password = request.getParameter("pass");
        String usertype1=request.getParameter("usertype");
        
        PrintWriter out = response.getWriter();
       
        
        try {
            loginDAO l = new loginDAO();
            String result = l.checkInfo(email1, password,usertype1);
            if(result.equals("admin")){
            response.sendRedirect("template3.html");
            }
            else if(result.equals("student")){
            response.sendRedirect("template.html");
            }
            else if(result.equals("teacher")){
            response.sendRedirect("teacher.html");
            }
            else{
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response);
            }
            out.println(result);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }




}
