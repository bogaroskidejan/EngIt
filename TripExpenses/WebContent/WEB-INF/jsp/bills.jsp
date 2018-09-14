<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All bills</title>
</head>
<body>
        <table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Item</th>  
                        <th>Price</th> 
                        <th>Date</th>
                        <th>Business trip</th>
                        <th>Action:</th>                  
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="bill" items="${bills}">
                        <tr>
                            <td>${bill.billid}</td>
                            <td>${bill.billitem}</td>                        
                            <td>${bill.price}</td>
                            <td>${bill.billdate}</td>  
                            <td>${bill.businesstrip}</td>  
                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletebill?billid=${bill.billid}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <table class = "table" border="2" width="150" >
                <thead>
                    <tr>
                        <th>Total:</th>
                    </tr>
                </thead>
                	<tr></tr>
                </tbody>
            </table>
</body>
</html>