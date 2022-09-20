<%--
  Created by IntelliJ IDEA.
  User: sakil
  Date: 9/20/2022
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%if(session.getAttribute("uname")==null)
{
    response.sendRedirect("index.jsp");
}%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>New Booking</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script>
        function myFunction() {
            alert(<%out.print(request.getAttribute("message"));%>);
        }
    </script>
    <jsp:include page="cusnewNav.jsp"></jsp:include>
</head>
<body>


<div class="container">
    <h2>New Booking</h2>
    <form action="addbooking" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" value="<%out.print(session.getAttribute("name"));%>">
        </div>
        <div class="form-group">
            <label for="pnbr">Phone Number:</label>
            <input type="text" class="form-control" id="pnbr" placeholder="Enter number" name="pnbr" value="<%out.print(session.getAttribute("tpnbr"));%>">
        </div>
        <div class="form-group">
            <label for="to">To:</label>
            <input type="text" class="form-control" id="to" placeholder="To" name="to">
        </div>
        <div class="form-group">
            <label for="from">From:</label>
            <input type="text" class="form-control" id="from" placeholder="From" name="from">
        </div>
        <input type="hidden" class="form-control" id="action" placeholder="From" name="action" value="cbook">
        <button type="submit" class="btn btn-default"onclick="myFunction()">Add new Booking</button>
    </form>
</div>

</body>
</html>
