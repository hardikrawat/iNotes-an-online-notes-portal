package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>iNotes</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">-->\n");
      out.write("        <style>\n");
      out.write("            #frame {\n");
      out.write("                margin-top: -25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                /* background-color: #e4e4e4; */\n");
      out.write("                /* background: linear-gradient(#2196f3 , #e91e63); */\n");
      out.write("                background: url(https://images.pexels.com/photos/5797904/pexels-photo-5797904.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940);\n");
      out.write("                margin: 5px;\n");
      out.write("                border-color: #4C4A48;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #lemail,\n");
      out.write("            #lpass,\n");
      out.write("            #email,\n");
      out.write("            #pass{\n");
      out.write("                opacity: 1;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #4C4A48;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: -10px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 14px;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                opacity: 0.8;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            legend {\n");
      out.write("                color: #4C4A48;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #form {\n");
      out.write("                padding-top: 200px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("                width: 500px;\n");
      out.write("                height: 410px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 58%;\n");
      out.write("                right: 0;\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btn_back {\n");
      out.write("                display: block;\n");
      out.write("                font-size: 18px;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: -2%;\n");
      out.write("                margin-left: -36%;\n");
      out.write("                color: #4C4A48;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btn_signup {\n");
      out.write("                text-align: center;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 24px;\n");
      out.write("                background: #29CF3A;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                border: 0px;\n");
      out.write("                padding-bottom: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btn_signup:hover {\n");
      out.write("                background: #34c2ff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #developer_name {\n");
      out.write("                position: absolute;\n");
      out.write("                margin: auto;\n");
      out.write("                bottom: 8px;\n");
      out.write("                right: 12px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: #4C4A48;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #heading {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 35%;\n");
      out.write("                width: 64%;\n");
      out.write("                font-size: 48px;\n");
      out.write("                color: #4C4A48;\n");
      out.write("            }\n");
      out.write("            #snackbar {\n");
      out.write("                visibility: hidden;\n");
      out.write("                min-width: 250px;\n");
      out.write("                min-height: 25px;\n");
      out.write("                margin-left: -125px;\n");
      out.write("                background-color: #333;\n");
      out.write("                color: #fff;\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 50%;\n");
      out.write("                bottom: 30px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #snackbar.show {\n");
      out.write("                visibility: visible;\n");
      out.write("                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;\n");
      out.write("                animation: fadein 0.5s, fadeout 0.5s 2.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes fadein {\n");
      out.write("                from {bottom: 0; opacity: 0;} \n");
      out.write("                to {bottom: 30px; opacity: 1;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes fadein {\n");
      out.write("                from {bottom: 0; opacity: 0;}\n");
      out.write("                to {bottom: 30px; opacity: 1;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes fadeout {\n");
      out.write("                from {bottom: 30px; opacity: 1;} \n");
      out.write("                to {bottom: 0; opacity: 0;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes fadeout {\n");
      out.write("                from {bottom: 30px; opacity: 1;}\n");
      out.write("                to {bottom: 0; opacity: 0;}\n");
      out.write("            }\n");
      out.write("            #a1{\n");
      out.write("                color: blue;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-align: right;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function showToast() {\n");
      out.write("                var x = document.getElementById(\"snackbar\");\n");
      out.write("                x.className = \"show\";\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                }, 3000);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("<script>\n");
      out.write("    function update(){\n");
      out.write("    alert('Coming Soon\\nThis feature is presently under development but will be available soon.');\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"a1\">\n");
      out.write("            Admin?, <a href=\"\" onclick=\"update()\">Control Center</a>\n");
      out.write("        </div>\n");
      out.write("        <form method=\"post\" action=\"login.jsp\">\n");
      out.write("\n");
      out.write("            <div id=\"Frame\">\n");
      out.write("                <h1 id=\"heading\">iNotes</h1>\n");
      out.write("                <div id=\"form\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Login Form</legend>\n");
      out.write("                        <table cellspacing=\"10\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td id=\"lemail\">\n");
      out.write("                                    EMail ID:\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input id=\"email\" name=\"email\" type=\"email\" name=\"email\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td id=\"lpass\">\n");
      out.write("                                    Password:\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input id=\"pass\" name=\"pass\" type=\"password\" name=\"password\" min=\"8\" max=\"15\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <input type=\"submit\" value=\"Login\" id=\"btn_signup\" />\n");
      out.write("                    </fieldset>\n");
      out.write("                </div>\n");
      out.write("                <a id=\"btn_back\" href=\"register.jsp\" target=\"_self\">New User, <U>Register?</U></a>\n");
      out.write("                <h1 id=\"developer_name\">a product by <a href=\"about.html\">Hardik Rawat</a></h1>\n");
      out.write("            </div>\n");
      out.write("            ");

                HttpSession sess = request.getSession();
                if (request.getParameter("isAccepted") != null) {
                    if (request.getParameter("isAccepted").equals("0")) {
            
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                Invalid Name detected, Please register with a valid Name!\n");
      out.write("                <script>\n");
      out.write("                    var x = document.getElementById(\"snackbar\");\n");
      out.write("                    x.className = \"show\";\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                    }, 3000);\n");
      out.write("                </script>\n");
      out.write("            </div>");

                    } else if(request.getParameter("isAccepted").equals("2")){
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                unauthorized Attempt Detected, Request Refused Successfully\n");
      out.write("                <script>\n");
      out.write("                    var x = document.getElementById(\"snackbar\");\n");
      out.write("                    x.className = \"show\";\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                    }, 3000);\n");
      out.write("                </script>\n");
      out.write("            </div>");

                    }
                }

if (request.getParameter("isLogout") != null) {
                    if (request.getParameter("isLogout").equals("1")) {
                    sess.invalidate();
            
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                You are logged out successfully.\n");
      out.write("                <script>\n");
      out.write("                    var x = document.getElementById(\"snackbar\");\n");
      out.write("                    x.className = \"show\";\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                    }, 3000);\n");
      out.write("                </script>\n");
      out.write("            </div>");

                    }
                }


                String email = request.getParameter("email");
                String password = request.getParameter("pass");
                String connectionURL = "jdbc:mysql://localhost:3306/inotes";
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(connectionURL, "root", "hardik");
                Statement statement = connection.createStatement();
                String getNotesQry = "select name, password from athentication where email = '" + email + "';";
                ResultSet rs = statement.executeQuery(getNotesQry);
                String OriginalPassword = "";
                String nameR = "";
                while (rs.next()) {
                    OriginalPassword = rs.getString("password");
                    nameR = rs.getString("name");
                }
                connection.close();
                if (OriginalPassword.equals(password)) {
                    
                    sess.setAttribute("email", email);
                    response.sendRedirect("addNotes.jsp?name=" + nameR);
                } else {

                    if (request.getParameter("isCorrect") != null) {
                        if (request.getParameter("isCorrect").equals("0")) {
            
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                Wrong Email or Password Detected!\n");
      out.write("                <script>\n");
      out.write("                    var x = document.getElementById(\"snackbar\");\n");
      out.write("                    x.className = \"show\";\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                    }, 3000);\n");
      out.write("                </script>\n");
      out.write("            </div>");

                        }
                    }

                    if (password != null) {
                        response.sendRedirect("login.jsp?isCorrect=0");
                    }
                }
            
      out.write("\n");
      out.write("        </form>\n");
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
