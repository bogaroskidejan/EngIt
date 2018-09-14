<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add authority</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreateauthority" method="post">
	<table class="formtable">
		<tr>
			<td class="label">Id: </td>
			<td class="control"><input name="authorityid" type="text"></td>
		</tr>
		<tr>
			<td class="label">Role: </td>
			<td class="control">
			<input  class="control" name="authority"  />
			</td>
			
			
		</tr>
	
		<tr>
				<td class="label">User</td>
				<td>
				
				<select class="control" name="user" >

						<c:forEach var="user" items="${users}">
							<option value="${user.username}">${user.username}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new authority"></td>
		</tr>
		
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
	
</form>
</body>
</html>