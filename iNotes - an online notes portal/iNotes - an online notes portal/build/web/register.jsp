<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
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

            #lname,
            #lemail,
            #lpass,
            #lcpass,
            #name,
            #email,
            #pass,
            #cpass {
                opacity: 1;
                font-weight: 600;
                color: #4C4A48;
                width: 100%;
                margin-top: -10px;
                font-size: 20px;
            }

            table {
                width: 100%;
                padding-right: 10px;
                padding-left: 10px;
                padding-top: 10px;
                padding-bottom: 14px;
                opacity: 0.8;
                background-color: white;
            }

            legend {
                color: #4C4A48;
                font-size: 20px;
                font-weight: bold;
            }

            #form {
                padding-top: -30px;
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
            }

            #btn_signup {
                text-align: center;
                display: block;
                /*width: 100%;*/
                margin-left: 74%;
                margin-top: 10px;
                border-radius: 5px;
                border-color: #000000;
                color: #ffffff;
                font-size: 20px;
                background: black;
                text-decoration: none;
                padding: 7px;
                border: 2px;
            }

            #btn_signup:hover {
                background: #5F5C6D;
                text-decoration: none;
                color: #ffffff;
                cursor: pointer;
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
        </style>
    </head>

    <body>
        <form method="post" action="register.jsp">
            <div id="Frame">
                <h1 id="heading">iNotes</h1>
                <div id="form">
                    <fieldset>
                        <legend>Sign Up Form</legend>
                        <table cellspacing="10">
                            <tr>
                                <td id="lname">
                                    Name:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="name" type="text" name ="name" required>
                                </td>
                            </tr>

                            <tr>
                                <td id="lemail">
                                    Mail ID:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="email" type="email" name = "email" required>
                                </td>
                            </tr>

                            <tr>
                                <td id="lpass">
                                    Password:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="pass" type="password" name="password" min="8" max="15" required>
                                </td>
                            </tr>

                            <tr>
                                <td id="lcpass">
                                    Confirm Password:
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input id="cpass" type="password" name="cpassword" min="8" max="15" required>
                                </td>
                            </tr>
                        </table>
                        <input type="submit" value="Get Started" id="btn_signup">
                    </fieldset>
                </div>
                <a id="btn_back" href="login.jsp" target="_self"><U>Login?</U></a>
                <h1 id="developer_name">a product by Hardik Rawat</h1>
            </div>
        </form>

        <!--java code-->
        <%
//            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String name = request.getParameter("name");
            String cpassword = request.getParameter("cpassword");
            if (password != null && cpassword != null) {
                if (!cpassword.equals(password)) {
        %><div id="snackbar" onLoad="showToast()">
            Passwords don't match, Please try again!
            <script>
                var x = document.getElementById("snackbar");
                x.className = "show";
                setTimeout(function () {
                    x.className = x.className.replace("show", "");
                }, 3000);
            </script>
        </div><%
        } else {
            if (email != null) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/inotes", "root", "hardik");
//here sonoo is database name, root is username and password  
                    Statement stmt = con.createStatement();
                    Statement stmt0 = con.createStatement();
                    String qry = "insert into athentication values ('" + password + "','" + email + "', '" + name + "');";
                    String qry0 = "insert into emails values ('" + email + "');";
                    stmt.executeUpdate(qry);
                    stmt0.executeUpdate(qry0);
                    con.close();
                    HttpSession sess = request.getSession();
                    sess.setAttribute("email", email);
                    response.sendRedirect("addNotes.jsp?name=" + name);
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
                }
            }


        %>
        <!--java code-->
    </body>
</html>
