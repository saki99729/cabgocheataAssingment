<%--
  Created by IntelliJ IDEA.
  User: sakil
  Date: 9/20/2022
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%if(session.getAttribute("uname")==null)
{
  response.sendRedirect("index.jsp");
}%>
<html>
<head>
  <title>Customer Dash</title>
</head>
<body>
<jsp:include page="AdminNav.jsp"></jsp:include>
<jsp:include page="JumBotron.jsp"></jsp:include>

</body>
</html>
