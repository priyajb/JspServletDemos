<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Session Id "+session.getId()+"<br>");
out.println("maxinactive "+session.getMaxInactiveInterval()+"<br>");

String username=(String)session.getAttribute("username");
out.print("welcome "+username);
List<String> movies=(List<String>)request.getAttribute("movies");
for(String movie:movies){
	out.print(movie+"<br>");
}
%>

</body>
</html>