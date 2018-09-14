<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All locations</title>
</head>
<body>
                <table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>  
                        <th>Country</th> 
                        <th>Daily allowance</th>  
                          <th>Location distance</th>
                        <th>delete</th>                  
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="location" items="${locations}">
                        <tr>
                            <td>${location.locid}</td>
                            <td>${location.locname}</td>                        
                            <td>${location.loccountry}</td>
                            <td>${location.locdailyallowance}</td>  
                            <td>${location.locdistance}</td>  
                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletelocation?locid=${location.locid}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>