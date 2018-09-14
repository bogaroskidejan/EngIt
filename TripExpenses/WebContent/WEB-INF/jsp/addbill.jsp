<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add bill</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreatebill" method="post">
	<table class="formtable">
	<tr>
				<td class="label">Business trip</td>
				<td>
				<select class="control" name="bustripid" >
						<c:forEach var="busstrip" items="${businesstrips}">
							<option value="${busstrip.bustripid}">${busstrip}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
		<tr>
			<td class="label">Bill date: </td>
			<td class="control"><input name="billdate" type="text"></td>
		</tr>
		<tr>
			<td class="label">Item: </td>
			<td class="control">
			<input  class="control" name="billitem"  />
			</td>
		</tr>
		<tr>
			<td class="label">Price: </td>
			<td class="control">
			<input  class="control" name="price"  />
			</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new bill"></td>
		</tr>
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>