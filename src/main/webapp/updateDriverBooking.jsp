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
      <label for="dname">Name:</label>
      <input type="text" class="form-control" id="dname" placeholder="Enter name" name="dname" value="<%out.print(session.getAttribute("name"));%>">
    </div>
    <div class="form-group">
      <label for="dpnbr">Phone Number:</label>
      <input type="text" class="form-control" id="dpnbr" placeholder="Enter number" name="dpnbr" value="<%out.print(session.getAttribute("tpnbr"));%>">
    </div>
    <div class="form-group">
      <label for="cname">To:</label>
      <input type="text" class="form-control" id="cname" placeholder="To" name="cname" value="<%out.print(session.getAttribute("cname"));%>">
    </div>
    <div class="form-group">
      <label for="cnbr">To:</label>
      <input type="text" class="form-control" id="cnbr" placeholder="To" name="cnbr"value="<%out.print(session.getAttribute("cnbr"));%>">
    </div>
    <div class="form-group">
      <label for="cto">To:</label>
      <input type="text" class="form-control" id="cto" placeholder="To" name="cto"value="<%out.print(session.getAttribute("cto"));%>">
    </div>
    <div class="form-group">
      <label for="cfrom">From:</label>
      <input type="text" class="form-control" id="cfrom" placeholder="From" name="cfrom" value="<%out.print(session.getAttribute("cfrom"));%>">
    </div>
    <div class="form-group">
      <label for="amount">From:</label>
      <input type="number" class="form-control" id="amount" placeholder="amount" name="amount" value="<%out.print(session.getAttribute("cfrom"));%>">
    </div>


    <input type="hidden" class="form-control" id="action" placeholder="From" name="action" value="cbook">
    <button type="submit" class="btn btn-default"onclick="myFunction()">Comform the order</button>
  </form>
</div>

</body>
</html>
