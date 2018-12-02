package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class AdminMarksView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title> Marks</title>\n");
      out.write("\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"edit_student/css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("th:nth-child(even) {background-color: lightgoldenrodyellow;}\n");
      out.write("th:nth-child(odd) {background-color: darkgrey;}\n");
      out.write("tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("tr:nth-child(odd) {background-color: white;}\n");
      out.write("p{\n");
      out.write("    text-align:center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("    <div class=\"page-wrapper bg-gra-01 p-t-180 p-t-100 p-b-50\">\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\n");
      out.write("            <div class=\"card card-6\">\n");
      out.write("                <div class=\"card-heading\">\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <h2 class=\"title\"><h1><p>Marks</p></h1></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"value\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    \n");
      out.write("   \n");
      out.write("  <table>\n");
      out.write("  \n");
      out.write("   <tr>\n");
      out.write("    <th>id</th>\n");
      out.write("    <th>name</th>\n");
      out.write("    <th>Subject</th>\n");
      out.write("    <th>marks</th>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("   </tr>\n");
      out.write("   \n");
      out.write("  ");

  String Id=request.getParameter("Id");
            String pass=request.getParameter("pass");
  try
  { 
   Class.forName("com.mysql.jdbc.Driver");  //load driver 
   
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  //creat connection 

   PreparedStatement pstmt=null; //create statement
   
  
   pstmt=con.prepareStatement("select * from marks "); //sql select query 
   
   ResultSet rs=pstmt.executeQuery(); //execute query and set in resultset object rs.  
  
   while(rs.next())
   { 
  
      out.write("\n");
      out.write("    <tr>\n");
      out.write("     <td> ");
      out.print(rs.getInt(1));
      out.write(" </td>   \n");
      out.write("     <td> ");
      out.print(rs.getString(2));
      out.write(" </td>\n");
      out.write("     <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("     <td> ");
      out.print(rs.getInt(4));
      out.write(" </td>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("  ");

   }
   
  }
  catch(Exception e)
  {
   out.println(e);
  }
  
  
      out.write("\n");
      out.write("  \n");
      out.write("  </table>\n");
      out.write("  \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  <script src=\"edit_student/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"edit_student/js/global.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
