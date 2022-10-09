<%--
  Created by IntelliJ IDEA.
  User: sakil
  Date: 9/20/2022
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin Register</title>
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

</head>
<body>


<div class="container">
  <h2>New Booking</h2>
  <form action="admin" method="post">
    <div class="form-group">
      <label for="uname">username:</label>
      <input type="text" class="form-control" id="uname" placeholder="Enter name" name="uname" value="">
    </div>
    <div class="form-group">
      <label for="pass">Password:</label>
      <input type="text" class="form-control" id="pass" placeholder="Enter number" name="pass" value="">
    </div>
    <div class="form-group">
      <label for="name">name:</label>
      <input type="text" class="form-control" id="name" placeholder="To" name="name">
    </div>
    <div class="form-group">
      <label for="pnbr">phone Number:</label>
      <input type="text" class="form-control" id="pnbr" placeholder="From" name="pnbr">
    </div>
    <input type="hidden" class="form-control" id="action" placeholder="From" name="action" value="ad">
    <button type="submit" class="btn btn-default"onclick="myFunction()">Register</button>
  </form>
</div>

</body>
</html>
