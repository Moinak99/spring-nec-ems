<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Welcome</a>
    <a class="navbar-brand" href="#">H.R Operations Menu</a>
    <a class="navbar-brand" href="/login">Logout</a>

    
    </div>
</nav>

<div class="row">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add New Employee</h5>
        <a href="reg" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Manage Registered Employees</h5>
        <a href="searchall" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
</div>
<br /><br /><br />
<div class="row">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Give Appraisal</h5>
        <a href="appraisal" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Manage Leave Request</h5>
        <a href="leaverequestview" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
</div>

</body>
</html>