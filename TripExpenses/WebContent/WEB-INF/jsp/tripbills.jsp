<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All trip bills</title>
</head>
<body>
<table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>Trip bill Id</th>
                        <th>Business trip</th> 
                        <th>Total bill amount</th>  
                        <th>Total allowance</th>
                        <th>Summary</th> 
                        <th>Action:</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tripbill" items="${tripbills}">
                        <tr>
                            <td>${tripbill.tripbillid}</td>
                            <td>${tripbill.businesstrip}</td> 
                            <td>${tripbill.totalamount}</td>                        
                            <td>${tripbill.totalalowance}</td> 
                            <td>${tripbill.summary}</td>
                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletetripbill?tripbillid=${tripbill.tripbillid}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>