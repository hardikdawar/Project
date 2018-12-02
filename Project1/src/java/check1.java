/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class check1 extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String uname = req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("pass");
        String password1 = req.getParameter("pass1");
        String signup1 = req.getParameter("signup");
        String fmovie=req.getParameter("favmovie");
        String fbook=req.getParameter("favbook");
        
        
      RecordCheck rs = new RecordCheck();
      out.println("data entered successfully");
        try {
            rs.insert1(uname , email, password, password1,signup1,fmovie,fbook);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
