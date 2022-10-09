<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Booking" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.model.Admin" %><%--
  Created by IntelliJ IDEA.
  User: sakil
  Date: 9/20/2022
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Customer Dash</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
</head>
<body>
<jsp:include page="navbarCus.jsp"></jsp:include>
<div class="container mt-3">

    <table class="table table-bordered table-sm">
        <thead>
        <tr>
            <th>username</th>
            <th>password</th>
            <th>name</th>
            <th>Job Role</th>
            <th>phone Number</th>


        </tr>
        </thead>
        <tbody>
        <%
            List<Admin>bookings =(ArrayList<Admin>)request.getAttribute("bookingList");
            for(Admin booking :bookings)
            {
                out.print("<tr>");
                out.print("<td>"+booking.getUname()+"</td>");
                out.print("<td>"+booking.getPass()+"</td>");
                out.print("<td>"+booking.getName()+"</td>");
                out.print("<td>"+booking.getJrole()+"</td>");
                out.print("<td>"+booking.getTnbr()+"</td>");

/*
                out.print("<td>");
                out.print("<form action=\"Servlet_BookAll\" method=\"get\">");
                out.print("<input type=\"hidden\" name=\"id\"  id=\"id\" value="+booking.getId()+">");
                out.print("<input type=\"hidden\" name=\"action\" value=\"single\">");
                out.print("<button type=\"submit\" style='font-size:18px' class=\"btn btn-link\"> <i class='far fa-arrow-alt-circle-right'></i></button>");
                out.print ("</td>");
*/
            }
        %>

        </tbody>
    </table>
</div>
<form action="" method="post">
    <input type="hidden" name="id" value="" id="id">
    <input type="hidden" name="action" value="dview">

</form>
</body>
</html>
