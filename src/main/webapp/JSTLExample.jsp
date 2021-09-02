<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/2/21
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%request.setAttribute("userName", request.getParameter("name")); %>
<%! String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"}; %>
<% request.setAttribute("listOfCars", cars);%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--if else equivalent --%>
<c:choose>
    <c:when test = "${userName == null}"> <%--when = if--%>
        <%--        http://localhost:8080/JSTLExample.jsp--%>
        <h1>Hello, Random User</h1>
    </c:when>
    <c:otherwise>
        <%-- http://localhost:8080/JSTLExample.jsp?name=Kamrun --%>
        <h1>Hello, ${userName}</h1>

<%--        for each w. p tags--%>
        <c:forEach var="car" items="${listOfCars}">
            <p>${car}</p>
        </c:forEach>

<%--        proper instance how to use this properly list item--%>
        <h2>Proper list format</h2>
        <ul>
        <c:forEach var="car" items="${listOfCars}">
            <li>${car}</li>
        </c:forEach>
        </ul>


    </c:otherwise>

</c:choose>

</body>
</html>
