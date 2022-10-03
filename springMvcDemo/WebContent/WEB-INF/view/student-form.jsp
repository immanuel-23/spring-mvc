<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="theStudent">
		First Name :<form:input path="firstName" />
		<form:errors path="firstName"></form:errors>

		<br>
		Last Name:<form:input path="lastName" />
		<form:errors path="lastName"></form:errors>
		<br>
		No of ATKT: <form:input path="atkt" />
		<form:errors path="atkt"></form:errors>
		
		<br>
		Email:<form:input path="email" />
		<form:errors path="email"></form:errors><br>
		Zip: <form:input path="zipCode" />
		<form:errors path="zipCode"></form:errors>
		

		<%-- <form:select path="year">
			<form:option value="1" />
			<form:option value="2" />
			<form:option value="3" />
			<c:forEach var="year" items="${theStudent.yearOption}">
				<form:option value="${year.value}"></form:option>
			</c:forEach>
		</form:select> --%>

		<form:select path="year">
			<form:options items="${theStudent.yearOption}" />
		</form:select>

		<br>
		<form:checkboxes items="${theStudent.subjects}"
			path="selectedSubjects" />
		<br>

		<form:radiobuttons path="selectedGender" items="${theStudent.genders}" />
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>