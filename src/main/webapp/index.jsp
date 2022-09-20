<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2> Login Login</h2>
    <form class="form-horizontal" action="Servlet_Admin_Login" method="post">
        <div class="form-group">
            <label class="control-label col-sm-2" for="uname">Email:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="uname" placeholder="Enter email" name="uname">
            </div>
        </div>
        <br>


        <div class="form-group">
            <label class="control-label col-sm-2" for="pass">Password:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pass" placeholder="Enter password" name="pass">
            </div>
        </div>
        <br>



        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Login</button>
            </div>
        </div>
        <div class="form-group">
            <label><a href="newCustomer.jsp">Sign in</a> </label>
        </div>
    </form>
</div>

</body>
</html>
