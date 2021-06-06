<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!------ Include the above in your HEAD tag ---------->

<!doctype html>
<html lang="en">
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Fonts -->
    <link rel="dns-prefetch" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">



    <link rel="icon" href="Favicon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <title>Update</title>
    <style type="text/css">
    
    @import url(https://fonts.googleapis.com/css?family=Raleway:300,400,600);


body{
    margin: 0;
    font-size: .9rem;
    font-weight: 400;
    line-height: 1.6;
    color: #212529;
    text-align: left;
    background-color: #f5f8fa;
}

.navbar-laravel
{
    box-shadow: 0 2px 4px rgba(0,0,0,.04);
}

.navbar-brand , .nav-link, .my-form, .login-form
{
    font-family: Raleway, sans-serif;
}

.my-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.my-form .row
{
    margin-left: 0;
    margin-right: 0;
}

.login-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.login-form .row
{
    margin-left: 0;
    margin-right: 0;
}


    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
    <div class="container">
    <a class="navbar-brand" href="#">Update Employee Details</a>
     <a class="navbar-brand" href="/searchall">Back</a>


    
    </div>
</nav>

<main class="my-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                    <div class="card">
                        <div class="card-header">Update</div>
                        <div class="card-body">
                            <form action="updatedetails" method="post">
                            
                            <input type="hidden" value="${msg2[0].id}" id="id" class="form-control" name="id">
                            <div class="form-group row">
                                    <label for="employeename" class="col-md-4 col-form-label text-md-right">Name</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].name}" id="name" class="form-control" name="name">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="department" class="col-md-4 col-form-label text-md-right">Department</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].department}" id="department" class="form-control" name="department">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="age" class="col-md-4 col-form-label text-md-right">Age</label>
                                    <div class="col-md-6">
                                        <input type="text" id="age" value="${msg2[0].age}" class="form-control" name="age">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="address" class="col-md-4 col-form-label text-md-right">Address</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].address}" id="address" class="form-control" name="address">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="contact" class="col-md-4 col-form-label text-md-right">Contact</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].contact}" id="contact" class="form-control" name="contact">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="gender" class="col-md-4 col-form-label text-md-right">Gender</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].gender}" id="gender" class="form-control" name="gender">
                                    </div>
                                </div>
                                
                                
                                <div class="form-group row">
                                    <label for="package" class="col-md-4 col-form-label text-md-right">Package</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].salpackage}" id="salpackage" class="form-control" name="salpackage">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="designation" class="col-md-4 col-form-label text-md-right">Designation</label>
                                    <div class="col-md-6">
                                        <input type="text" value="${msg2[0].designation}" id="designation" class="form-control" name="designation">
                                    </div>
                                </div>
                                

                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-right">Create e-mail id:</label>
                                    <div class="col-md-6">
                                        <input type="text" id="email" value="${msg2[0].email}" class="form-control" name="email">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-right">Create Password</label>
                                    <div class="col-md-6">
                                        <input type="password" id="password" value="${msg2[0].password}" class="form-control" name="password">
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
            </div>
        </div>
    </div>

</main>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
