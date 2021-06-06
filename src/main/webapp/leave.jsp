<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<title>Insert title here</title>
<style type="text/css">
table, tr td {
    border: 1px solid red
}
tbody {
    display: block;
    height: 500px;
    overflow: auto;
}
thead, tbody tr {
    display: table;
    width: 100%;
    table-layout: fixed;/* even columns width , fix width of table too*/
}
thead {
    width: calc( 100% - 1em )/* scrollbar is average 1em/16px width, remove it from thead width */
}
table {
    width: 400px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Welcome</a>
    <a class="navbar-brand" href="/backemployee?email=${msg1[0].email}">Back</a>
    

    
    </div>
</nav>
<div class="card text-center">
  <div class="card-header">
    Featured
  </div>
  <div class="card-body">
    <form action="employeeleavereq" method="post">
    <div class="form-group row">
							  <input type="hidden" id="id" class="form-control"  name="id" value="${msg1[0].id}" >
							</div>
                            <div class="form-group row">
                            
                                    <label for="employeeleavereq" class="col-md-4 col-form-label text-md-right">Email</label>
                                    <div class="col-md-6">
                                        <input type="text" id="email" class="form-control" readonly name="email" value="${msg1[0].email}">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                            
                                    <label for="employeeleavereq" class="col-md-4 col-form-label text-md-right">Name</label>
                                    <div class="col-md-6">
                                        <input type="text" id="name" class="form-control" readonly name="name" value="${msg1[0].name}">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="totalleave" class="col-md-4 col-form-label text-md-right">Total Leave</label>
                                    <div class="col-md-6">
                                        <input type="text" id="totalleave" class="form-control" name="totalleave" value="${msg1[0].assignedleave}" readonly>
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="leaveremaining" class="col-md-4 col-form-label text-md-right">Remaining</label>
                                    <div class="col-md-6">
                                        <input type="text" id="leaveremaining" class="form-control" value="${msg1[0].remainingleave}" name="leaveremaining" readonly>
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="startdate" class="col-md-4 col-form-label text-md-right">Start Date</label>
                                    <div class="col-md-6">
                                        <input type="date" id="startdate" class="form-control" name="startdate">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="enddate" class="col-md-4 col-form-label text-md-right">End Date</label>
                                    <div class="col-md-6">
                                        <input type="date" id="enddate" class="form-control" name="enddate">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="reason" class="col-md-4 col-form-label text-md-right">Reason</label>
                                    <div class="col-md-6">
                                        <input type="text" id="reason" class="form-control" name="reason">
                                    </div>
                                </div>
                                <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                        Request
                                        </button>
                                    </div>
                                </form>
  </div>
  <div class="card-footer text-muted">
    
  </div>
</div>


</body>
</html>