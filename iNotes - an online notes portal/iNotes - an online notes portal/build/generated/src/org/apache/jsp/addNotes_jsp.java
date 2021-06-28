package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.HashMap;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class addNotes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <title>iNotes</title>\n");
      out.write("        ");
HttpSession sess = request.getSession();
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #efefef;\n");
      out.write("                margin: 10px;\n");
      out.write("                border-color: #4C4A48;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #noteParent {\n");
      out.write("                margin-left: 6px;\n");
      out.write("                margin-right: -6px;\n");
      out.write("                width: 70%;\n");
      out.write("                float: left;\n");
      out.write("                background-color: #efefef;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card0{\n");
      out.write("                float: left;\n");
      out.write("                width: 28%;\n");
      out.write("                margin-left: 24px;\n");
      out.write("                margin-right: -6px;\n");
      out.write("                background-color: #efefef;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h5{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #ffffff;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-size: 14px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                background-color: #3299d4;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            textarea, input{\n");
      out.write("                font-size: 24px!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #a1, #a2, #a3{\n");
      out.write("                margin-right: 8%;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 150px;\n");
      out.write("                margin-left: 83%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.absolute {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 97%;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                margin-right: -80px;\n");
      out.write("                margin-top: 42%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                background-color: #e9e9e9;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-color: blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #E34724;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #E34724;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            table.table thead {\n");
      out.write("                background-color: #efefef;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            table.table tbody {\n");
      out.write("                color: #000000;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background-color: #efefef;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #3299d4;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                background-color: #efefef;\n");
      out.write("                margin-top: -10px;\n");
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
      out.write("            #bc{\n");
      out.write("                background: #3299d4;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #bca{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            #div0{\n");
      out.write("                position:absolute;\n");
      out.write("                top:11px;\n");
      out.write("                padding-top: 4px;\n");
      out.write("                padding-right: 4px;\n");
      out.write("                right: 10px;\n");
      out.write("                background: #3299d4;\n");
      out.write("                margin-top: 2px;\n");
      out.write("                margin-right: 4px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            #div00{\n");
      out.write("                position:absolute;\n");
      out.write("                top:11px;\n");
      out.write("                padding-top: 4px;\n");
      out.write("                background: #3299d4;\n");
      out.write("                margin-top: 2px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-style: bold;\n");
      out.write("                right: 50%;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function AlertIt() {\n");
      out.write("                var answer = confirm(\"Please click on OK to continue.\");\n");
      out.write("                if (answer)\n");
      out.write("                    window.location = \"http://www.continue.com\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"addNotes.jsp\">\n");
      out.write("\n");
      out.write("            <div id=\"div00\">iNotes</div>\n");
      out.write("\n");
      out.write("            <div id=\"div0\">\n");
      out.write("                <a href=\"login.jsp?isLogout=1\"><i class=\"material-icons md-18\" style=\"font-size:22px;color:white\">logout</i>&nbsp; &nbsp;</a>\n");
      out.write("\n");
      out.write("                <a href=\"emailTo: hardik.education963@gmail.com\"><i class=\"material-icons md-18\" style=\"font-size:22px;color:white\">feedback</i>&nbsp; &nbsp;</a>\n");
      out.write("\n");
      out.write("                <a href=\"javascript:AlertIt();\"><i class=\"material-icons md-18\" style=\"font-size:22px;color:white\">info</i>&nbsp; &nbsp;</a>\n");
      out.write("\n");
      out.write("                <a hred=\"\"><i class=\"material-icons md-18\" style=\"font-size:22px;color:white\">dark_mode</i>&nbsp; &nbsp;</a>\n");
      out.write("\n");
      out.write("                <a href=\"\"><i class=\"material-icons md-18\" style=\"font-size:22px;color:white\">account_circle</i></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <nav aria-label=\"breadcrumb\" >\n");
      out.write("                <ol class=\"breadcrumb\" id=\"bc\">\n");
      out.write("                    <li class=\"breadcrumb-item\"><a id=\"bca\" href=\"addNotes.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"breadcrumb-item active\" id=\"bca\" aria-current=\"page\">Create Notes</li>\n");
      out.write("                </ol>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"baseFrame\">\n");
      out.write("                <div id=\"noteParent\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Note Title: </label>\n");
      out.write("                        <input required type=\"text\" class=\"form-control\" id=\"noteTitle\" name=\"noteTitle\" placeholder=\"Write your note title here\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleFormControlTextarea1\">Note Description: </label>\n");
      out.write("                        <textarea required class=\"form-control\" id=\"noteDesc\" placeholder=\"Write your note description here\"\n");
      out.write("                                  rows=\"11\" name=\"noteDesc\" id=\"noteDesc\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Save Note</button>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("            <div class=\"card0\">\n");
      out.write("                <h5>Saved Notes</h5>\n");
      out.write("                <!-- java code -->\n");
      out.write("                <table class=\"table table-hover table-bordered\" id=\"t1\">\n");
      out.write("                    <thead>\n");
      out.write("                    <th>No.</th>          \n");
      out.write("                    <th>Title</th>\n");
      out.write("                    <td>Edit</td>\n");
      out.write("                    <td>Delete</td>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        ");


                            String user0 = "";
                            if (sess.getAttribute("email") != null) {
                                user0 = (String) sess.getAttribute("email");
                            }
                            if (user0.length() == 0) {
                                response.sendRedirect("login.jsp?isAccepted=2");
                            }
                            String rTitle = "", rDesc = "";
                            if (request.getParameter("title") != null) {

                                String connectionURL = "jdbc:mysql://localhost:3306/inotes";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection connection = DriverManager.getConnection(connectionURL, "root", "hardik");
                                Statement statement = connection.createStatement();
                                String getNotesQry = "select title, description from descriptions where title = '" + request.getParameter("title") + "';";

                                ResultSet rs = statement.executeQuery(getNotesQry);
                                while (rs.next()) {
                                    rTitle = rs.getString("title");
                                    rDesc = rs.getString("description");
                        
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Retriving Data, Please Wait...\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                        }
                        connection.close();
                    
      out.write("<script>\n");
      out.write("\n");
      out.write("                        document.getElementById(\"noteTitle\").value = \"");
      out.print( rTitle);
      out.write("\";\n");
      out.write("                        document.getElementById(\"noteDesc\").value = \"");
      out.print( rDesc);
      out.write("\";\n");
      out.write("\n");
      out.write("                    </script>");

                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        String isUpdated = "";
                        if (request.getParameter("isUpdated") != null) {
                            isUpdated = request.getParameter("isUpdated");
                            if (isUpdated.equals("1")) {
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Note Updated Successfully.\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                    } else {
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        No Updation Performed.\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                            }
                        }

                        String isDeleted = "";
                        if (request.getParameter("isDeleted") != null) {
                            isDeleted = request.getParameter("isDeleted");
                            if (isDeleted.equals("1")) {
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Note Deleted Successfully.\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                    } else {
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Sorry an error occurred: ");
      out.print(request.getParameter("isDeleted").substring(1));
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                            }
                        }

                        if (request.getParameter("name") != null) {
                            if (request.getParameter("name").equals("null")) {
                                response.sendRedirect("login.jsp?isAccepted=0");
                            }
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Welcome to iNotes,  ");
      out.print(request.getParameter("name"));
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                        }

                        int count = 0;

                        sess.setAttribute("email", user0);
                        String user = "Logged in as:" + user0;
                        String title = request.getParameter("noteTitle");

                        String description = request.getParameter("noteDesc");

                        String connectionURL = "jdbc:mysql://localhost:3306/inotes";
                        Connection connection = null;
                        PreparedStatement pstatement = null;
                        PreparedStatement pstatement0 = null;
                        int updateQuery = 0;
                        int updateQuery0 = 0;
                        boolean serverConnected = true;
                        String databaseStatus = "checking...";
                        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                        if (title != null) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                connection = DriverManager.getConnection(connectionURL, "root", "hardik");
                                Statement statement = connection.createStatement();
                                String queryString = "insert into titles values(?,?);";
                                String descQry = "insert into descriptions values (?,?,?);";
                                pstatement = connection.prepareStatement(queryString);
                                pstatement0 = connection.prepareStatement(descQry);
                                //                    java.sql.Timestamp date0 = new java.sql.Timestamp(new java.util.Date().getTime());
                                pstatement.setString(1, user0);
                                pstatement.setString(2, title);
                                pstatement0.setString(1, title);
                                pstatement0.setString(2, description);
                                pstatement0.setString(3, user0);
                                updateQuery = pstatement.executeUpdate();
                                updateQuery0 = pstatement0.executeUpdate();
                                databaseStatus = "Note titled: " + title + " saved";
                                if (updateQuery != 0) {
                                }
                                String getNotesQry = "select title from titles join emails on titles.email = emails.email where titles.email = '" + user0 + "';";
                                ResultSet rs = statement.executeQuery(getNotesQry);
                                Map<Integer, String> map = new HashMap<Integer, String>();
                                while (rs.next()) {
                                    String str = rs.getString("title");
                                    count++;

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(count);
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a id=\"titleListId\" href=\"addNotes.jsp?title=");
      out.print(str);
      out.write('"');
      out.write('>');
      out.print(str);
      out.write("</a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"edit.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"delete.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                            }
//sess.setAttribute("map", map);
                        } catch (Exception ex) {
                            databaseStatus = ex.toString();

                        } finally {
                            // close all the connections.
                            pstatement.close();
                            connection.close();
                        }
                    } else {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            connection = DriverManager.getConnection(connectionURL, "root", "hardik");
                            Statement statement = connection.createStatement();
                            String getNotesQry = "select title from titles join emails on titles.email = emails.email where titles.email = '" + user0 + "';";
                            ResultSet rs = statement.executeQuery(getNotesQry);

                            while (rs.next()) {
                                String str = rs.getString("title");
                                count++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(count);
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a id=\"titleListId\" href=\"addNotes.jsp?title=");
      out.print(str);
      out.write('"');
      out.write('>');
      out.print(str);
      out.write("</a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"edit.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"delete.jsp?title=");
      out.print(rs.getString("title"));
      out.write("\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    } catch (Exception e) {
                    
      out.write("<div id=\"snackbar\" onLoad=\"showToast()\">\n");
      out.write("                        Sorry an error occurred: ");
      out.print(e.toString());
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            var x = document.getElementById(\"snackbar\");\n");
      out.write("                            x.className = \"show\";\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                x.className = x.className.replace(\"show\", \"\");\n");
      out.write("                            }, 3000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>");

                            }
                        }
                    
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"absolute rounded alert alert-info\" role=\"alert\">\n");
      out.write("                <strong>Login Status: ");
      out.print(user);
      out.write("  <b>|</b>  Server Status: ");
      out.print(serverConnected);
      out.write("  <b>|</b>  Database Status: ");
      out.print(databaseStatus);
      out.write("  <b>|</b>  Date: ");
      out.print(date);
      out.write("</strong>;\n");
      out.write("            </div>            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
