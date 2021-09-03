<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/3/21
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza Order Page</title>
</head>
<body>
<h1>Welcome to Pizza Planet</h1>
<jsp:include page="partials/pizzaForm.jsp" />

<%--<form method="post" action="/pizza-order">--%>
<%--    <c:if test="${error}">--%>
<%--        <p>Username or password invalid</p>--%>
<%--    </c:if>--%>
<%--    <label for="username">Username</label>--%>
<%--    <input id="username" name="username" placeholder="Enter your username" type="text"/>--%>
<%--    <label for="password">Password</label>--%>
<%--    <input id="password" name="password" placeholder="Enter your password" type="password"/>--%>
<%--    <br>--%>
<%--    <button id="submit">Submission</button>--%>
<%--</form>--%>

</body>
</html>
