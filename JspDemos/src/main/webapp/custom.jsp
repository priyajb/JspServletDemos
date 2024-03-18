<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<% request.setAttribute("message", "great day"); %>
<c:out value="${message}"></c:out>
<%List<String> fruits=Arrays.asList("apple","kiwi","banana","watermelon"); 
session.setAttribute("fruitlist", fruits);
%>
<h1> Using EL</h1>
${fruitlist}<br>

<h1> Using c:forEach</h1>
<c:forEach items="${fruitlist}" var="fruit" step="2">
${fruit}<br>
</c:forEach>


</body>
</html>