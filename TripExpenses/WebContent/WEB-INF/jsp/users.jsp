<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>

<table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>userid</th>
                        <th>Username</th>  
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td>${user.userid}</td>
                            <td>${user.username}</td>                        
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>