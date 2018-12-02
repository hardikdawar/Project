package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emailClient_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("        body{\n");
      out.write("            background-image: url('verify.jpeg');\n");
      out.write("            background-size: 1400px 700px;  \n");
      out.write("        }\n");
      out.write(".loginbox{\n");
      out.write("    width: 320px;\n");
      out.write("    height: 300px;\n");
      out.write("    background:linear-gradient(75deg,white,black);\n");
      out.write("    border-style: solid;\n");
      out.write("    border-width:medium;\n");
      out.write("    color: black;\n");
      out.write("    left: 10%;\n");
      out.write("    top: 10%;\n");
      out.write("    position: absolute;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 70px 30px;\n");
      out.write("    opacity: 0.7;\n");
      out.write("    border-radius:30px;\n");
      out.write("        \n");
      out.write("        \n");
      out.write("}\n");
      out.write("\n");
      out.write(".avatar{\n");
      out.write("    width: 100px;\n");
      out.write("    height: 100px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    top: -50px;\n");
      out.write("    left: calc(50% - 50px);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0 0 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 22px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox p{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox input{\n");
      out.write("    width: 100%;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox input[type=\"text\"], input[type=\"password\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: 1px solid #fff;\n");
      out.write("    background: transparent;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write(".loginbox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    height: 40px;\n");
      out.write("    background: #fb2525;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 18px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("}\n");
      out.write(".loginbox input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("    cursor: pointer;\n");
      out.write("    background: #ffc107;\n");
      out.write("    color: #000;\n");
      out.write("}\n");
      out.write(".loginbox a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 12px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    color: darkgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loginbox a:hover\n");
      out.write("{\n");
      out.write("    color: #ffc107;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class = \"loginbox\" style=\"margin-top: 250px; margin-left: 500px\">\n");
      out.write("            <form action = \"MailDispatcherServlet\" method = \"Post\">\n");
      out.write("               <table>\n");
      out.write("                <tr>\n");
      out.write("                    <font>Email</font><br>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <input type = \"email\" name = \"email\" placeholder = \"Enter the email\">\n");
      out.write("                 </tr>  \n");
      out.write("                 <tr>\n");
      out.write("                     <input type = \"submit\" value = \"submit\">\n");
      out.write("                 </tr>\n");
      out.write("               </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
