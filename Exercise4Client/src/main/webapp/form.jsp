<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Employee</title>
</head>
<body>
	<form:form method="POST" action="createEmployee"
		modelAttribute="empl">
		<div>
			First Name:
			<form:input path="firstName" />
		</div>
		<div>
			Last Name:
			<form:input path="lastName" />
		</div>
		<div>
			Salary:
			<form:input path="salary" />
		</div>
		<input type="submit" value="Create">
	</form:form>
</body>
</html>