<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO JS</h1>
<%
String name="Priya";%>
<%="welcome"+name%>


<% int x=10;int y=20; %>
<%="sum :"+(x+y)%>

<%!int count=0; %>
You are visitor no:<%=count++ %>
<br>
<%!String greet(){
	return "Welcome back";
	}
	%>
<%=greet() %>
<%int y=10/0; %>
</body>
</html>