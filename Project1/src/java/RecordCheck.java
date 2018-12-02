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
    
    public void insert(String uname,String email,String password,String password1,String signup1) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 
        if(signup1.equals("admin")){
        PreparedStatement ps = con.prepareStatement("insert into data values(?,?,?,?,?)");
        
        
        ps.setString(1, uname);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4,password1);
        ps.setString(5,signup1);
        int rs=ps.executeUpdate();
       
        }
        else if(signup1.equals("student")){
        PreparedStatement p = con.prepareStatement("insert into data1 values(?,?,?,?,?)");
         p.setString(1, uname);
        p.setString(2, email);
        p.setString(3, password);
        p.setString(4,password1);
        p.setString(5,signup1);
        
        int r=p.executeUpdate();
        }
        else{
        PreparedStatement t = con.prepareStatement("insert into data2 values(?,?,?,?,?)");
         t.setString(1, uname);
        t.setString(2, email);
        t.setString(3, password);
        t.setString(4,password1);
        t.setString(5,signup1);
        int s=t.executeUpdate();
        }
    }
    public void insert1(String uname,String email,String password,String password1,String signup1,String fmovie,String fbook) throws ClassNotFoundException, SQLException, IOException
    {Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 
        
        PreparedStatement ps = con.prepareStatement("insert into data1 values(?,?,?,?,?,?,?)");
        
        
        ps.setString(1, uname);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4,password1);
        ps.setString(5,signup1);
        ps.setString(6,fmovie);
        ps.setString(7,fbook);
        int rs=ps.executeUpdate();
        
    }
        
         public int updatePass(String email,String npass,String cpass) throws ClassNotFoundException, SQLException, IOException
    { 
       
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  
        PreparedStatement ps = con.prepareStatement("update data1 set password='"+npass+"', password1='"+cpass+"' where email='"+email +"'");
        int rs=ps.executeUpdate();
        return rs;
    }
          public String forpass(String email,String sque,String ans) throws ClassNotFoundException, SQLException, IOException
    { 
         
        Class.forName("com.mysql.jdbc.Driver");   
        System.out.print(email+" "+sque+" "+ans);
        Statement stmt = null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 
        stmt = con.createStatement();
        if(sque.equals("which is your favourite movie")){
          ResultSet rs = stmt.executeQuery("select * from data1 where email='"+email +"'");
          while(rs.next()){

            String answer = rs.getString("favmovie");
         if(answer.equals(ans)){
            return "done";
         
         }
        }
        }
        else if(sque.equals("which is your favourite book")){
          ResultSet rs = stmt.executeQuery("select * from data1 where email='"+email +"'");
          while(rs.next()){

         String answer = rs.getString("favbook");
          if (answer.equals(ans))
         {
            return "done";
         }
         
        }
        }
        
        
      return "error";
    } 
       

}
