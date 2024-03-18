<%@page import="com.doctorapp.model.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

Doctor doctor = (Doctor)request.getAttribute("doctor");
String doctorName=doctor.getDoctorName();
out.print(doctor.getDoctorName()+"<br>");
out.print(doctor.getDoctorId()+"<br>");
out.print(doctor.getSpeciality()+"<br>");
out.println(doctor.getFees()+"<br>");
out.println(doctor.getRatings()+"<br>");
out.println(doctor.getExperience()+"<br>");


%>
</body>
</html>