<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doctorServlet">
Enter DoctorId:<input type="number" name="doctorId"><br>
Enter Doctor Name:<input type="text" name="doctorName"><br>
Enter Doctor Speciality:
<select name="speciality">
<option value="cardiologist">CARDIOLOGIST</option>
    <option value="dermotologist">DERMOTOLOGIST</option>
    <option value="pediatrician">PEDIATRICIAN</option>
    <option value="orthopedist">ORTHOPEDIST</option>
</select>
Enter Doctor Fees:<input type="number" name="fees"><br>

Enter Ratings:
<select name="ratings">
<option value="1">one</option>
<option value="2">two</option>
<option value="3">three</option>
<option value="4">four</option>
<option value="5">five</option>
</select>
Enter Doctor Experience:<input type="number" name="experience"><br>
<input type="submit" value="submit"><br>

</form>

</body>
</html>