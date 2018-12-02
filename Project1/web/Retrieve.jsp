<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%
    int id = 0;
    if (request.getParameter("id") != null && request.getParameter("id") != "")
    {
        id = Integer.parseInt(request.getParameter("id").toString());
    }

    
    
    String Content = new String("");
    Statement stmt = null;
    Connection con = null;
ResultSet rst = null;
    try
    {
        String filename = "data" + id + ".pdf";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        stmt = con.createStatement();
        rst = stmt.executeQuery("select * from assignment ");
        if (rst.next())
        {
            Content = rst.getString("photo");
        }
       
        byte requestBytes[] = Content.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(requestBytes);
        response.reset();
        response.setContentType("application/pdf");
        response.setHeader("cache-control", "no-cache");
        response.setHeader("Content-disposition", "attachment; filename=" + filename);

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) > 0)
        {
            response.getOutputStream().write(buf, 0, len);
        }
        bis.close();
        response.getOutputStream().flush();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
%>