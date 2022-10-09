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
    <h2>My Booking List</h2>
    <p>Rs.50/= per 1Km</p>
    <table class="table table-bordered table-sm">
        <thead>
        <tr>
            <th>Name</th>
            <th>Phone Number</th>
            <th>To</th>
            <th>From</th>
            <th>Driver name</th>
            <th>Driver Phone Number</th>
            <th>Status</th>
            <th>Amount</th>
            <th>Settings</th>

        </tr>
        </thead>
        <tbody>
        <%
            List<Booking>bookings =(ArrayList<Booking>)request.getAttribute("bookingList");
            for(Booking booking :bookings)
            {
                out.print("<tr>");
                out.print("<td>"+booking.getCname()+"</td>");
                out.print("<td>"+booking.getCpnber()+"</td>");
                out.print("<td>"+booking.getTo()+"</td>");
                out.print("<td>"+booking.getFrom()+"</td>");
                out.print("<td>"+booking.getDname()+"</td>");
                out.print("<td>"+booking.getDnbr()+"</td>");
                out.print("<td>");
                if (booking.getStatus().equals("pending"))
                {
                    out.print("<button type=\"button\" class=\"btn btn-warning\">"+booking.getStatus()+"</button>");
                }else{
                    out.print("<button type=\"button\" class=\"btn btn-success\">"+booking.getStatus()+"</button>");
                }
                out.print("</td>");
                out.print("<td>"+booking.getAmount()+"</td>");

                    out.print("<td>");
                    out.print("<form action=\"Servlet_BookAll\" method=\"get\">");
                    out.print("<input type=\"hidden\" name=\"id\"  id=\"id\" value="+booking.getId()+">");
                    out.print("<input type=\"hidden\" name=\"action\" value=\"single\">");
                    out.print("<button type=\"submit\" style='font-size:18px' class=\"btn btn-link\"> <i class='far fa-arrow-alt-circle-right'></i></button>");
                    out.print ("</td>");



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
