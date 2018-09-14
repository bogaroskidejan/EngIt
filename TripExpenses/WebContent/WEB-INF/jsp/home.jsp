<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<p><a href="${pageContext.request.contextPath}/locations">Show all locations</a></p>
	<p><a href="${pageContext.request.contextPath}/addlocation">Add new location</a></p>
	<p><a href="${pageContext.request.contextPath}/employees">Show all employees</a></p>
	<p><a href="${pageContext.request.contextPath}/addemployee">Add new employee</a></p>
	<p><a href="${pageContext.request.contextPath}/users">Show all users</a></p>
	<p><a href="${pageContext.request.contextPath}/adduser">Add new user</a></p>
	<p><a href="${pageContext.request.contextPath}/authorities">Show all authorities</a></p>
	<p><a href="${pageContext.request.contextPath}/addbusinesstrip">Add new business trip</a></p>
	<p><a href="${pageContext.request.contextPath}/businesstrips">Show all business trips</a></p>
	<p><a href="${pageContext.request.contextPath}/tripbills">Show all trip bills</a></p>
	<p><a href="${pageContext.request.contextPath}/addbill">Add new bill</a></p>
	<p><a href="${pageContext.request.contextPath}/bills">Show all bills</a></p>
	<p><a href="${pageContext.request.contextPath}/login">login</a></p>
</body>
</html>