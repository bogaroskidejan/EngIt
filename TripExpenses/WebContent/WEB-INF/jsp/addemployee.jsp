<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add employee</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreateemployee" method="post">
	<table class="formtable">
		
		<tr>
			<td class="label"> Full name: </td>
			<td class="control">
			<input  class="control" name="fullname"  />
			</td>
			
			
		</tr>
		<tr>
			<td class="label">Email: </td>
			<td class="control">
			<input    name="email"  />
			</td>
		</tr>
		<tr>
			<td class="label">Personal identificational number: </td>
			<td class="control">
			<input name="persidnum"  />
			</td>
		</tr>
		<tr>
			<td class="label">Password number: </td>
			<td class="control">
			<input name="passnum"  />
			</td>
		</tr>
		<tr>
			<td class="label">Has B licence: </td>
			<td class="control">
			<input name="haslicence"  />
			</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new employee"></td>
		</tr>
		
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>