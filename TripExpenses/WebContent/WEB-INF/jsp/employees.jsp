<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>

     <table class = "table" border="2" width="600" >
 
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Full name</th>  
                        <th>Email</th> 
                        <th>Personal Id number</th>  
                          <th>Passport number</th>
                          <th>Has licence</th>
                        <th>Delete</th>                  
                                               
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="employee" items="${employees}">
                        <tr>
                            <td>${employee.employeeid}</td>
                            <td>${employee.fullname}</td>                        
                            <td>${employee.email}</td>
                            <td>${employee.persidnum}</td>  
                            <td>${employee.passnum}</td>  
                            <td>${employee.haslicence}</td>    
                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deleteemployee?employeeid=${employee.employeeid}">Delete</a>
                            </td>
                            
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>