<%@page import="com.java.model.EmployeeModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<title>Insert title here</title>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Welcome</a>
    <a class="navbar-brand" href="#">Employee Operations Menu</a>
    <a class="navbar-brand" href="/login">Logout</a>

    
    </div>
</nav>
<h2> Welcome ${msg[0].name}!</h2>



<div class="row">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">View Your Details</h5>
        <a href="empviewdetails?email=${msg[0].email}" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Request For Leave</h5>
        <a href="reqleave?email=${msg[0].email}" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
</div>


    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Leave Status</h5>
        <a href="checkleave?email=${msg[0].email}" class="btn btn-primary">Go</a>
      </div>
    </div>
  

</body>

</html>