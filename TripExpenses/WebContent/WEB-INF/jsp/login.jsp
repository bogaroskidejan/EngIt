<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
      <div class="col-sm-10 col-md-10 col-lg-10 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form class="form-signin" action='${pageContext.request.contextPath }/login' method='POST'>
              <div class="form-label-group">
                <input class="form-control" id="username" name="username"  placeholder="username" required autofocus>
                <label for="username">Username</label>
              </div>

              <div class="form-label-group">
                <input  class="form-control" type="password" id="password" name="password"   placeholder="Password" required>
                <label for="password">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              <hr class="my-4">
              
            </form>
          </div>
        </div>
      </div>
    </div>
  
</body>
</html>