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
    <a class="navbar-brand" href="#">Welcome</a>
    <a class="navbar-brand" href="/hrhome">Back</a>
    

    
    </div>
</nav>

 <table class="table table-hover">
   
            <thead>
            <tr>
                <th>name</th>
                <th>email</th>
                <th>assignedleave</th>
                <th>remainingleave</th>
                <th>days</th>
                <th>reason</th>
                <th>startdate</th>
                <th>enddate</th>
                                <th>status</th>
                                <th>Response</th>
                
                
            </tr>
            </thead>
            
            <tbody>
            <c:forEach var="user" items="${msg}"> 
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
                                        
                    					

    											<td><input type="submit" value="Approve" onclick="location.href='approve?_id=${user.id}&email=${user.email}'" <c:if test="${user.status == 'approved' || user.status == 'rejected' }" ><c:out value="disabled='disabled'"/></c:if> /></td>
    											<td><input type="submit" value="Reject" onclick="location.href='reject?_id=${user.id}'" <c:if test="${user.status == 'approved' || user.status == 'rejected'}"><c:out value="disabled='disabled'"/></c:if> /></td>
    											
                    
                </tr>
            </c:forEach>
            </tbody>
       </table>


</body>
</html>