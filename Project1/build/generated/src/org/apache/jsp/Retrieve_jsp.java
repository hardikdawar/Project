package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class Retrieve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

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

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
