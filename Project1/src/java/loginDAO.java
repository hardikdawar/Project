/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Avleen Kaur
 */
public class loginDAO {
    String user;
    String url;
    String password;
    Connection con;
    Statement st;
    loginDAO() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.user="root";
        this.url="jdbc:mysql://localhost:3306/project";
        this.password="";
    
        this.con=DriverManager.getConnection(url, user, password);
        this.st=con.createStatement();
    }
   
    public String checkInfo(String email1,String password,String usertype1) throws SQLException
    {
         
        
        if(usertype1.equals("admin")){
            String query="Select * from data where email='"+email1+"' and password ='"+password+"'";
            ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "admin";
        }
    }
        else if(usertype1.equals("student")){
            String query="Select * from data1 where email='"+email1+"' and password ='"+password+"'";
            ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "student";
        }
        }
        else if(usertype1.equals("teacher")){
            String query="Select * from data2 where email='"+email1+"' and password ='"+password+"'";
            ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "teacher";
        }
        }
        return "invalid login details";
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

    }
    
}

