package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class password_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    <title>Chitkara University</title>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            ");
  String email=(String)request.getParameter("email");
            
            session.setAttribute("email", email);
        Connection conn = null;
        Statement stmt = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from data1 where email='"+email+"' " ;
        ResultSet rs = stmt.executeQuery(sql);
        
          while(rs.next()){
        
      out.write("    \n");
      out.write("        ");

            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("     <div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\" style=\"background-color:black;\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-110 p-r-110 p-t-15 p-b-43\">\n");
      out.write("\t\t\t\t\n");
      out.write("        <div>\n");
      out.write("            <center> <img src=\"loginlogo1.png\"  width=\"250\" height=\"230\" style=\"padding:40px 50px\"></center>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <div style=\"padding:10px 50px;\">\n");
      out.write("            <form action=\"changePass\" method=\"post\" autocomplete=\"off\">\n");
      out.write("                                   <div class=\"p-t-10 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\tUsername\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"wrap-input100 validate-input\" data-validate = \"Username is required\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"email\" name=\"email\"  >\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("              <label for=\"ques\"><span class=\"focus-input100\"></span>Security question</label>\n");
      out.write("              <select name=\"sque\" class=\"input100\">\n");
      out.write("        \n");
      out.write("         <option value=\"which is your favourite movie\">which is your favourite movie</option>\n");
      out.write("         <option value=\"which is your favourite book\">which is your favourite book</option>\n");
      out.write("         \n");
      out.write("              </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("              <label for=\"ans\">Answer</label>\n");
      out.write("              <input type=\"text\" class=\"input100\" id=\"ans\" name =\"ans\" >\n");
      out.write("              <span class=\"focus-input100\"></span>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"p-t-10 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                \n");
      out.write("                <center> <button type=\"submit\" onclick=\"myFunction()\" class=\"login100-form-btn\">Submit</button></center>\n");
      out.write("                \n");
      out.write("          </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                </div>\n");
      out.write("      </div>\n");

}
catch(Exception e)
{
    out.print(e);
}

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
