<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <title>iNotes</title>
        <%HttpSession sess = request.getSession();%>
        <script>
            function update() {
                alert('Coming Soon\nThis feature is presently under development but will be available soon.');
            }
        </script>
        <style>
            body {
                background: #efefef;
                margin: 10px;
                border-color: #4C4A48;
                background-size: cover;
                font-size: 14px;
            }

            #noteParent {
                margin-left: 6px;
                margin-right: -6px;
                width: 70%;
                float: left;
                background-color: #efefef;
            }

            .card0{
                float: left;
                width: 28%;
                margin-left: 24px;
                margin-right: -6px;
                background-color: #efefef;
            }

            h5{
                text-align: center;
                color: #ffffff;
                font-weight: 600;
                font-size: 14px;
                padding-top: 10px;
                padding-right: 10px;
                padding-left: 10px;
                padding-bottom: 10px;
                background-color: #3299d4;
                width: 100%;
            }

            textarea, input{
                font-size: 24px!important;
            }

            #a1, #a2, #a3{
                margin-right: 8%;
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
                border-color: blue;
            }

            table.table td a.edit {
                color: #FFC107;
                align-items: center;
            }
            table.table td a.delete {
                color: #E34724;
                align-items: center;
            }
            table.table td a.delete {
                color: #E34724;
                align-items: center;
            }
            table.table th i {
                font-size: 13px;
                cursor: pointer;
                align-items: center;
            }
            table.table thead {
                background-color: #efefef;
                font-weight: bold;
            }
            table.table tbody {
                color: #000000;
                font-weight: bold;
                background-color: #efefef;
            }
            table.table tr th, table.table tr td {
                border-color: #3299d4;
            }
            table {
                background-color: #efefef;
                margin-top: -10px;
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
            #bc{
                background: #3299d4;

            }
            #bca{
                color: white;
            }
            #div0{
                position:absolute;
                top:11px;
                padding-top: 4px;
                padding-right: 4px;
                right: 10px;
                background: #3299d4;
                margin-top: 2px;
                margin-right: 4px;
                text-align: right;
            }
            #div00{
                position:absolute;
                top:11px;
                padding-top: 4px;
                background: #3299d4;
                margin-top: 2px;
                text-align: center;
                font-size: 18px;
                font-style: bold;
                right: 50%;
                color: white;
            }
        </style>

    </head>

    <body>
        <form method="post" action="addNotes.jsp">

            <div id="div00">iNotes</div>

            <div id="div0">
                <a href="login.jsp?isLogout=1"><i class="material-icons md-18" style="font-size:22px;color:white">logout</i>&nbsp; &nbsp;</a>

                <a href="mailTo: hardik.education963@gmail.com"><i class="material-icons md-18" style="font-size:22px;color:white">feedback</i>&nbsp; &nbsp;</a>

                <a href="" onclick="update()"><i class="material-icons md-18" style="font-size:22px;color:white">info</i>&nbsp; &nbsp;</a>

                <a hred="" onclick="update()"><i class="material-icons md-18" style="font-size:22px;color:white">dark_mode</i>&nbsp; &nbsp;</a>

                <a href="" onclick="update()"><i class="material-icons md-18" style="font-size:22px;color:white">account_circle</i></a>
            </div>

            <nav aria-label="breadcrumb" >
                <ol class="breadcrumb" id="bc">
                    <li class="breadcrumb-item"><a id="bca" href="addNotes.jsp">Home</a></li>
                    <li class="breadcrumb-item active" id="bca" aria-current="page">Create Notes</li>
                </ol>
            </nav>


            <div id="baseFrame">
                <div id="noteParent">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Note Title: </label>
                        <input required type="text" class="form-control" id="noteTitle" name="noteTitle" placeholder="Write your note title here">
                    </div>
                    <div class="form-group">
                        <label for="exampleFormControlTextarea1">Note Description: </label>
                        <textarea required class="form-control" id="noteDesc" placeholder="Write your note description here"
                                  rows="11" name="noteDesc" id="noteDesc"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Save Note</button>
                </div>
            </div>   

            <div class="card0">
                <h5>Saved Notes</h5>
                <!-- java code -->
                <table class="table table-hover table-bordered" id="t1">
                    <thead>
                    <th>No.</th>          
                    <th>Title</th>
                    <td>Edit</td>
                    <td>Delete</td>
                    </thead>
                    <tbody>

                        <%

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
                        %><div id="snackbar" onLoad="showToast()">
                        Retriving Data, Please Wait...
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
                        }
                        connection.close();
                    %><script>

                        document.getElementById("noteTitle").value = "<%= rTitle%>";
                        document.getElementById("noteDesc").value = "<%= rDesc%>";

                    </script><%
                        }
                    %>

                    <%
                        String isUpdated = "";
                        if (request.getParameter("isUpdated") != null) {
                            isUpdated = request.getParameter("isUpdated");
                            if (isUpdated.equals("1")) {
                    %><div id="snackbar" onLoad="showToast()">
                        Note Updated Successfully.
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
                    } else {
                    %><div id="snackbar" onLoad="showToast()">
                        No Updation Performed.
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
                            }
                        }

                        String isDeleted = "";
                        if (request.getParameter("isDeleted") != null) {
                            isDeleted = request.getParameter("isDeleted");
                            if (isDeleted.equals("1")) {
                    %><div id="snackbar" onLoad="showToast()">
                        Note Deleted Successfully.
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
                    } else {
                    %><div id="snackbar" onLoad="showToast()">
                        Sorry an error occurred: <%=request.getParameter("isDeleted").substring(1)%>
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
                            }
                        }

                        if (request.getParameter("name") != null) {
                            if (request.getParameter("name").equals("null")) {
                                response.sendRedirect("login.jsp?isAccepted=0");
                            }
                    %><div id="snackbar" onLoad="showToast()">
                        Welcome to iNotes,  <%=request.getParameter("name")%>
                        <script>
                            var x = document.getElementById("snackbar");
                            x.className = "show";
                            setTimeout(function () {
                                x.className = x.className.replace("show", "");
                            }, 3000);
                        </script>
                    </div><%
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

                    %>
                    <tr>
                        <td>
                            <%=count%>
                        </td>
                        <td>
                            <a id="titleListId" href="addNotes.jsp?title=<%=str%>"><%=str%></a>
                        </td>
                        <td>
                            <a href="edit.jsp?title=<%=rs.getString("title")%>"><i class="material-icons">&#xE254;</i></a>

                        </td>
                        <td>
                            <a href="delete.jsp?title=<%=rs.getString("title")%>"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                    <%
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
                    %>
                    <tr>
                        <td>
                            <%=count%>
                        </td>
                        <td>
                            <a id="titleListId" href="addNotes.jsp?title=<%=str%>"><%=str%></a>
                        </td>
                        <td>
                            <a href="edit.jsp?title=<%=rs.getString("title")%>"><i class="material-icons">&#xE254;</i></a>
                        </td>
                        <td>
                            <a href="delete.jsp?title=<%=rs.getString("title")%>"><i class="material-icons">&#xE872;</i></a>
                        </td>
                    </tr>
                    <%
                        }
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
                            }
                        }
                    %>
                    </tbody>
                </table>
            </div>
            <div class="absolute rounded alert alert-info" role="alert">
                <strong>Login Status: <%=user%>  <b>|</b>  Server Status: <%=serverConnected%>  <b>|</b>  Database Status: <%=databaseStatus%>  <b>|</b>  Date: <%=date%></strong>;
            </div>            
        </form>
    </body>
</html>