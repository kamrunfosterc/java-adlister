<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %> <%--defining and using instance variables--%>
<% counter += 1; %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="partials/navbar.jsp"%> <%-- IMPORTANT FORMAT --%>
<h1>The current count is <%= counter %>.</h1> <%--interpret whats in brackets, converts to be displayed in html--%>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>