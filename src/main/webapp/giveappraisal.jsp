<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <a class="navbar-brand" href="#">Appraisal</a>
     <a class="navbar-brand" href="/appraisal">Back</a>
     </div>
     </nav>
<div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Appraisal</h5>
    <form action="updateappraisal" method="post">
                            <input type="hidden" value="${msg2[0].id}" id="id" class="form-control" name="id">
                            <div class="form-group row">
                                    <label for="employeename" class="col-md-4 col-form-label text-md-right">Employee Name</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].name}" id="name" class="form-control" readonly name="name">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="employeename" class="col-md-4 col-form-label text-md-right">Department</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].department}" id="department" class="form-control" name="department">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="employeename" class="col-md-4 col-form-label text-md-right">Designation</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].designation}" id="designation" class="form-control" name="designation">
                                    </div>
                                </div>
                                                                <div class="form-group row">
                                    <label for="employeename" class="col-md-4 col-form-label text-md-right">Current Salary Package</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].salpackage}" id="salpackage" class="form-control" name="salpackage">
                                    </div>
                                </div>
                                <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                        Update
                                        </button>
                                    </div>
                                
                                </form>
  </div>
</div>
</body>
</html>