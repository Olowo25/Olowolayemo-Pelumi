<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./common.jsp"%>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
		  <a class="navbar-brand" href="#">Kambok Infotech</a>
		  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarScroll">
		    <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
		      <li class="nav-item">
		        <a class="nav-link active" aria-current="page" href="#">School of technologies</a>
		      </li>
		    </ul>
		  </div>
		 </div>
	 </nav>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Enter Company Detail</h1>
				<form action="submit-company" method="post">
					  <div class="mb-3">
					    <label class="form-label">Company Name</label>
					    <input type="text" name="name" class="form-control" placeholder="type company name">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Headquarter</label>
					    <input type="text" name="headquarter" class="form-control" placeholder="type headquater or location">
					  </div>
					  <div class="container text-center">
						  <button type="submit" class="btn btn-primary">Create</button>
						  <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
					  </div>
				</form>
			</div>	
		</div>
	</div>
</body>
</html>