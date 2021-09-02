<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/2/21
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setAttribute("message", "Hello there World!"); %>
<%request.setAttribute("greeting", "Welcome, "+ request.getParameter("name")); %>
<html>
<head>
    <title>Title</title>
    <style>
        body {background-color: aquamarine;}
        h1 { color: blue;}
        h2 {color:coral;}
    </style>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<h1>Welcome to the landing page</h1>
<h1>Welcome, <%=request.getParameter("name")%></h1> <%--2nd option--%>
<h2>This is a smart use of the Expression Language Message -> ${message}</h2>
<h2>This is a 2nd smart use of the Expression Language Message -> ${greeting}</h2>

</body>
</html>
