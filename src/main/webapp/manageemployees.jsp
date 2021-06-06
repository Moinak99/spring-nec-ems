<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Welcome</a>
    <!--  <a class="navbar-brand" href="backhr?email=${msg1}">Back</a>-->
        <a class="navbar-brand" href="/hrhome">Back</a>
    

    
    </div>
</nav>
<h2></h2>

<div>
<div class="card"">
  <div class="card-body">
    <h5 class="card-title">Search</h5>
    					<form action="searchbyemail" method="post">
    							<div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-right">Enter mail id</label>
                                    <div class="col-md-6">
                                        <input type="text" id="email" class="form-control" name="email">
                                    </div>
                                </div>
								<br />
                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                        Search
                                        </button>
                                    </div>
                                    </form>
    
  </div>
</div>
</div>

 <table class="table table-hover">
   
            <thead>
            <tr>
                <th>Employee Name</th>
                <th>Department</th>
                <th>Age</th>
                 <th>Address</th>
                <th>Contact</th>
                <th>Gender</th>
                <th>Salary(LPA)</th>
                 <th>Designation</th>
                <th>E-mail</th>
                <th>delete</th>
                <th>Update</th>
            </tr>
            </thead>
            
            <tbody>
            <c:forEach var="user" items="${msg1}"> 
                <tr>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.department}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><c:out value="${user.address}" /></td>
                    <td><c:out value="${user.contact}" /></td>
                    <td><c:out value="${user.gender}" /></td>
                    <td><c:out value="${user.salpackage}" /></td>
                    <td><c:out value="${user.designation}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><a href="del?_id=${user.id}">DELETE</a></td>
                    <td><a href="updt?_id=${user.id}">Update</a></td>
                </tr>
            </c:forEach>
            </tbody>
       </table>
</body>
</html>