<%-- 
    Document   : delete
    Created on : 20 May, 2021, 12:33:13 PM
    Author     : om
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <form method="post" action="delete.jsp">
            <h5>Deleting note, Please wait...</h5>
        </form>
    </body>
    <%
        HttpSession sess = request.getSession();
        String title=request.getParameter("title");
        String email = (String) sess.getAttribute("email");
        sess.setAttribute("email", email);
    %><h5>Email Received is: <%=title%></h5><%

        if (email != null) {
            //for deleteing desc...
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/inotes", "root", "hardik");
                Statement stmt = con.createStatement();
                String qry = "delete from descriptions where email = '" + email + "' AND title = '" + title + "';";
                stmt.executeUpdate(qry);
                con.close();
    %><h5>Almost Done...</h5><%
    } catch (Exception e) {
    %>
    <h6>Error: <%=e.toString()%></h6>
    <br>
    <h6>Error: <%=email%></h6>
    <%
        }
//for deleting title...
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/inotes", "root", "hardik");
            Statement stmt = con.createStatement();
            String qry = "delete from titles where email = '" + email + "' AND title = '" + title + "';";
            stmt.executeUpdate(qry);
            con.close();
    %><h5>Deleted Successfully, Redirecting to 'Create Note' Page...</h5><%
        Thread thread = new Thread();
        thread.sleep(1000);
        response.sendRedirect("addNotes.jsp?isDeleted=1");
    } catch (Exception e) {
    %>
    <h6>Error: <%=e.toString()%></h6>
    
    <%
        response.sendRedirect("addNotes.jsp?isDeleted=0"+e.toString());
            }
        }
    %>
</html>
