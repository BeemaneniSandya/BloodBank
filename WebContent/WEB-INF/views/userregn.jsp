<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navigation-bar1.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/userregn-style.css">
<script src="${pageContext.request.contextPath}/resources/scripts/userregn.js"></script>

</head>
<body>
   <header>
	<h1>Welcome to Blood Bank Management Portal</h1>
	<h2>Register to continue</h2>
   </header>
    <p id="error">${error}</p>
	<div id="container">
		<form:form action="add" method="post" modelAttribute="userDetails">

			<label for="username" class="field">Username<span class="mandatory">*</span></label>
			<br>
			<form:input path="userName" class="value" name="username" id="username"
				placeholder="Enter a Username" />
	        <br>
			<label for="password" class="field">Password<span class="mandatory">*</span></label>
			<br>
			<form:password path="password" class="value" name="password" id="password"
				placeholder="Enter a Password" />
            <br>
			<label for="cnfpassword" class="field">Confirm Password<span class="mandatory">*</span></label>
			<br>
			<form:password path="confirmPassword" class="value" name="cnfpassword"
				id="cnfpassword" placeholder="Renter the Password" />
            <br>
			<input type="submit" id="button1" name="register"
				class="btn btn-success" value="Submit" onclick="return validateForm()">
			<input type="reset" id="button2" class="btn btn-success" Value="Reset">
		</form:form>
	</div>

</body>
</html>