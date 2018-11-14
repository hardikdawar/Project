/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class RecordCheck {
    
    public void insert(String uname,String email,String password,String password1) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  
        PreparedStatement ps = con.prepareStatement("insert into data values(?,?,?,?)");
        ps.setString(1, uname);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4,password1);
        int rs=ps.executeUpdate();
    }    

}
