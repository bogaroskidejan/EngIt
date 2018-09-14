<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreatebusinesstrip" method="post">
	<table class="formtable">
		<tr>
			<td class="label">Days from: </td>
			<td class="control">
			<input type="text"   name="fromdate"  />
			</td>
		</tr>
		<tr>
			<td class="label">Days to: </td>
			<td class="control">
			<input  type="text"  name="todate"  />
			</td>
		</tr>
		<tr>
				<td class="label">Location</td>
				<td>
				<select class="control" name="locid" >
						<c:forEach var="location" items="${locations}">
							<option value="${location.locid}">${location.locname}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td class="label">Employee</td>
				<td>
				
				<select class="control" name="employeeid" >

						<c:forEach var="employee" items="${employees}">
							<option value="${employee.employeeid}">${employee.fullname}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new business trip"></td>
		</tr>
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>