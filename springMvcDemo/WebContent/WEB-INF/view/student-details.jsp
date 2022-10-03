<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	First Name:${theStudent.firstName}
	<br> 
	Last Name:${theStudent.lastName}
	<br>Year: ${theStudent.year}
	<br>
	Email :${theStudent.email}
	<br>
	Atkt :${theStudent.atkt}<br>
	ZipCode:
	${theStudent.zipCode}
	
	<br>
	
	<c:forEach var="student" items="${theStudent.selectedSubjects}">
		${student}
	</c:forEach>
	
	<br> ${theStudent.selectedGender}
</body>
</html>