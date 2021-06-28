<%-- 
    Document   : edit
    Created on : 29 May, 2021, 7:54:16 PM
    Author     : om
--%>

<%@page import="java.io.IOException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Timer"%>
<%@page import="java.util.TimerTask"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>iNotes</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <style>
            body {
                background: #efefef;
                margin: 10px;
                border-color: #4C4A48;
                background-size: cover;
                font-size: 14px;
            }
            textarea, input{
                font-size: 24px!important;
            }
            button{
                width: 150px;
                margin-left: 83%;
            }
            div.absolute {
                position: absolute;
                width: 97%;
                margin-left: 10px;
                margin-right: -80px;
                margin-top: 42%;
                margin-bottom: 10px;
                background-color: #e9e9e9;
                padding: 10px;
            }
            #noteParent {
                margin-left: 6px;
                margin-right: -6px;
                width: 70%;
                float: left;
                background-color: #efefef;
                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            }
            #bd{
                background-color: #000000;
                color: #ffffff;
            }
            #snackbar {
                visibility: hidden;
                min-width: 250px;
                min-height: 25px;
                margin-left: -125px;
                background-color: #333;
                color: #fff;
                text-align: center;
                border-radius: 20px;
                padding-left: 10px;
                padding-right: 10px;
                padding-top: 5px;
                position: fixed;
                z-index: 1;
                left: 50%;
                bottom: 30px;
                font-size: 14px;
            }

            #snackbar.show {
                visibility: visible;
                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
                animation: fadein 0.5s, fadeout 0.5s 2.5s;
            }

            @-webkit-keyframes fadein {
                from {bottom: 0; opacity: 0;} 
                to {bottom: 30px; opacity: 1;}
            }

            @keyframes fadein {
                from {bottom: 0; opacity: 0;}
                to {bottom: 30px; opacity: 1;}
            }

            @-webkit-keyframes fadeout {
                from {bottom: 30px; opacity: 1;} 
                to {bottom: 0; opacity: 0;}
            }

            @keyframes fadeout {
                from {bottom: 30px; opacity: 1;}
                to {bottom: 0; opacity: 0;}
            }
            div.absolute {
                position: absolute;
                width: 97%;
                margin-left: 10px;
                margin-right: -80px;
                margin-top: 42%;
                margin-bottom: 10px;
                background-color: #e9e9e9;
                padding: 10px;
            }
        </style>

        <script>
            function showToast() {
                var x = document.getElementById("snackbar");
                x.className = "show";
                setTimeout(function () {
                    x.className = x.className.replace("show", "");
                }, 3000);
            }
        </script>

    </head>
    <body>

        <form method="post" action="edit.jsp?title=<%=request.getParameter("title")%>">

            <nav aria-label="breadcrumb" id="bd">

                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item"><a href="addNotes.jsp?isUpdated=0"> Create Notes</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Edit Notes</li>
                </ol>

            </nav>

            <div id="noteParent">
                <div class="form-group">
                    <label for="exampleInputEmail1">Note Title: </label>
                    <input required type="text" class="form-control" id="noteTitle" name="noteTitle1" 
                           placeholder="Write your note title here" value="<%= request.getParameter("title")%>">
                </div>
                <%
                    String serverConnected = "checking...";
                    String databaseStatus = "checking...";
                    String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                    HttpSession sess = request.getSession();
                    String email = (String) sess.getAttribute("email");
                    String OriginalDesc = "";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inotes", "root", "hardik");
                    databaseStatus = "Connection Opened";
                    Statement statement = connection.createStatement();
                    String getNotesQry = "select description from descriptions where email = '" + email + "' and title = '" + request.getParameter("title") + "';";
                    ResultSet rs = statement.executeQuery(getNotesQry);
                    while (rs.next()) {
                        OriginalDesc = rs.getString("description");
                    }
                    databaseStatus = "Connected";
                %><div id="snackbar" onLoad="showToast()">
                    Data Retrieved Successfully.
                    <script>
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 3000);
                    </script>
                </div><%
                %>
                <%                String desc = request.getParameter("noteDesc");
                    if (!OriginalDesc.equals(desc) && desc != null && request.getParameter("title") != null) {
                        //update desc
                        try {
                            Class.forName("com.mysql.jdbc.Driver");

                            Statement stmt = connection.createStatement();
                            String qry = "update descriptions set description = '" + desc + "' where email = '" + email + "' AND title = '" + request.getParameter("title") + "';";
                            stmt.executeUpdate(qry);
                            connection.close();
                            response.sendRedirect("addNotes.jsp?isUpdated=1");
                        } catch (Exception e) {
                %><div id="snackbar" onLoad="showToast()">
                    Sorry an error occurred: <%=e.toString()%>
                    <script>
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 3000);
                    </script>
                </div><%
                        if (connection.isClosed()) {
                            databaseStatus = "Connection Closed";
                        }
                    }
                } else {
                    //Sorry an error occured: title or description is null!
                %><div id="snackbar" onLoad="showToast()">
                    Sorry an error occurred: Title or Description is null!
                    <script>
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 3000);
                    </script>
                </div><%
                    }
                    serverConnected = "connected";
                %><div id="snackbar" onLoad="showToast()">
                    Server Connected Successfully.
                    <script>
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 6000);
                    </script>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Note Description: </label>
                    <textarea required class="form-control" id="noteDesc" name="noteDesc" placeholder="Write your note description here"
                              rows="11" name="noteDesc" id="noteDesc" ><%=OriginalDesc%></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Update Note</button>
            </div>
            <div class="absolute rounded alert alert-info" role="alert">
                <strong>Login Status: <%=email%>  <b>|</b>  Server Status: <%=serverConnected%>  <b>|</b>  Database Status: <%=databaseStatus%>  <b>|</b>  Date: <%=date%></strong>;
            </div> 
        </form>
    </body>
</html>
