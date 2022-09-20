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
    <title>Register</title>
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
    <h2>Register Vehicle</h2>
    <form action="registervehic" method="post">
        <div class="form-group">
            <label for="vtype">username:</label>
            <input type="text" class="form-control" id="vtype" placeholder="Enter vehicle type" name="vtype" value="">
        </div>
        <div class="form-group">
            <label for="vnbr">Password:</label>
            <input type="text" class="form-control" id="vnbr" placeholder="Enter password" name="vnbr" value="">
        </div>
        <div class="form-group">
            <label for="dname">name:</label>
            <input type="text" class="form-control" id="dname" placeholder="Enter name" name="dname">
        </div>


        <div class="form-group">
            <label for="license">phone Number:</label>
            <input type="text" class="form-control" id="license" placeholder="Enter license number" name="license">
        </div>

        <div class="form-group">
            <label for="branch">Branch:</label>
            <select name="branch" id="branch">
                <option value="Anuradhapura">Anuradhapura</option>
                <option value="Colombo">Colombo</option>
                <option value="Kurunagala">Kurunagala</option>
                <option value="Kandy">Kandy</option>
            </select>


        </div>
        <input type="hidden" class="form-control" id="action" placeholder="From" name="action" value="vehicle">
        <button type="submit" class="btn btn-default"onclick="myFunction()">Register</button>
    </form>
</div>

</body>
</html>
