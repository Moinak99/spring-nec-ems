<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Leave Status</a>
    <a class="navbar-brand" href="/backemployee?email=${msg2[0].email}">back</a>
    

    
    </div>
</nav>
<h2></h2>


 <table class="table table-hover">
   
            <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Assigned leave</th>
                <th>Remaining leave</th>
                <th>Days</th>
                <th>Reason</th>
                <th>Start date</th>
                <th>End date</th>
                <th>Current status</th>
                
                
            </tr>
            </thead>
            
            <tbody>
            <c:forEach var="user" items="${msg2}"> 
                <tr>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.assignedleave}" /></td>
                    <td><c:out value="${user.remainingleave}" /></td>
                                        <td><c:out value="${user.days}" /></td>
                    
                                        <td><c:out value="${user.reason}" /></td>
                    
                                        <td><c:out value="${user.startdate}" /></td>
                    
                                        <td><c:out value="${user.enddate}" /></td>
                                        <td><c:out value="${user.status}" /></td>
                    
                </tr>
            </c:forEach>
            </tbody>
       </table>


</body>
</html>