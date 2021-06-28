<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>iNotes</title>
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">-->
        <style>
            #frame {
                margin-top: -25px;
            }

            body {
                /* background-color: #e4e4e4; */
                /* background: linear-gradient(#2196f3 , #e91e63); */
                background: url(https://images.pexels.com/photos/5797904/pexels-photo-5797904.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940);
                margin: 5px;
                border-color: #4C4A48;
                background-size: cover;
            }

            #lemail,
            #lpass,
            #email,
            #pass{
                opacity: 1;
                font-weight: 600;
                color: #4C4A48;
                width: 100%;
                margin-top: -10px;
                font-size: 24px;
                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            }

            table {
                width: 100%;
                padding-right: 10px;
                padding-left: 10px;
                padding-top: 10px;
                padding-bottom: 14px;
                background-color: #ffffff;
                opacity: 0.8;

            }

            legend {
                color: #4C4A48;
                font-size: 24px;
                font-weight: bold;
            }

            #form {
                padding-top: 200px;
                padding-right: 30px;
                padding-bottom: 30px;
                width: 500px;
                height: 410px;
                position: absolute;
                top: 0;
                bottom: 0;
                left: 58%;
                right: 0;
                margin: auto;
            }

            #btn_back {
                display: block;
                font-size: 18px;
                text-align: center;
                margin-top: -2%;
                margin-left: -36%;
                color: #4C4A48;
                text-decoration: none;
            }

            #btn_signup {
                text-align: center;
                display: block;
                width: 100%;
                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
                color: #ffffff;
                font-weight: 400;
                font-size: 24px;
                background: #29CF3A;
                text-decoration: none;
                margin-top: 10px;
                border: 0px;
                padding-bottom: 5px;
            }

            #btn_signup:hover {
                background: #34c2ff;
                text-decoration: none;
                color: ffffff;
            }

            #developer_name {
                position: absolute;
                margin: auto;
                bottom: 8px;
                right: 12px;
                font-size: 18px;
                color: #4C4A48;
            }

            #heading {
                text-align: center;
                margin-top: 35%;
                width: 64%;
                font-size: 48px;
                color: #4C4A48;
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
            #a1{
                color: blue;
                font-size: 14px;
                text-align: right;
                margin-top: 10px;
                margin-right: 10px;
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
<script>
    function update(){
    alert('Coming Soon\nThis feature is presently under development but will be available soon.');
}
</script>
    <body>
        <div id="a1">
            Admin?, <a href="" onclick="update()">Control Center</a>
        </div>
        <form method="post" action="login.jsp">

            <div id="Frame">
                <h1 id="heading">iNotes</h1>
                <div id="form">
                    <fieldset>
                        <legend>Login Form</legend>
                        <table cellspacing="10">
                            <tr>
                                <td id="lemail">
                                    EMail ID:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="email" name="email" type="email" name="email" required>
                                </td>
                            </tr>

                            <tr>
                                <td id="lpass">
                                    Password:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="pass" name="pass" type="password" name="password" min="8" max="15" required>
                                </td>
                            </tr>
                        </table>
                        <input type="submit" value="Login" id="btn_signup" />
                    </fieldset>
                </div>
                <a id="btn_back" href="register.jsp" target="_self">New User, <U>Register?</U></a>
                <h1 id="developer_name">a product by <a href="about.html">Hardik Rawat</a></h1>
            </div>
            <%
                HttpSession sess = request.getSession();
                if (request.getParameter("isAccepted") != null) {
                    if (request.getParameter("isAccepted").equals("0")) {
            %><div id="snackbar" onLoad="showToast()">
                Invalid Name detected, Please register with a valid Name!
                <script>
                    var x = document.getElementById("snackbar");
                    x.className = "show";
                    setTimeout(function () {
                        x.className = x.className.replace("show", "");
                    }, 3000);
                </script>
            </div><%
                    } else if(request.getParameter("isAccepted").equals("2")){
                    %><div id="snackbar" onLoad="showToast()">
                unauthorized Attempt Detected, Request Refused Successfully
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

if (request.getParameter("isLogout") != null) {
                    if (request.getParameter("isLogout").equals("1")) {
                    sess.invalidate();
            %><div id="snackbar" onLoad="showToast()">
                You are logged out successfully.
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
            %><div id="snackbar" onLoad="showToast()">
                Wrong Email or Password Detected!
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

                    if (password != null) {
                        response.sendRedirect("login.jsp?isCorrect=0");
                    }
                }
            %>
        </form>
    </body>
</html>
