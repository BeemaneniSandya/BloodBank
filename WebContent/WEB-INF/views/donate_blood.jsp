<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="navigation-bar2.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donate Blood</title>
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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/donate_blood.css">
<script
	src="${pageContext.request.contextPath}/resources/scripts/donate_blood.js"></script> 
</head>
<body>
	<header>
		<h2>Donate Blood</h2>
	</header>
	<p id="error">${error}</p>
	<div id="container">
	<form:form action="addDonar" method="post" modelAttribute="donationDetails">
		<label for="donarName" class="field">Donar Name<span class="mandatory">*</span></label>
			<br>
	    <form:input path="donarName" class="value" name="donarName" id="donarName" placeholder="Enter the donar's full name"/>
	        <br>
	    <label for="bloodGroup" class="field">Your Blood Group<span class="mandatory">*</span></label>
			<br>
			<form:select path="bloodGroup" class="value" name="requiredgroup"
				id="requiredgroup">
				<form:option value=""   label="Select" />
				<form:option value="A+" label="A+" />
				<form:option value="A-" label="A-" />
				<form:option value="B+" label="B+" />
				<form:option value="B-" label="B-" />
			    <form:option value="AB+" label="AB+" />
			    <form:option value="AB-" label="AB-" />
				<form:option value="O+" label="O+" />
				<form:option value="O-" label="O-" />
			</form:select>
			<br>
			<label for="city" class="field">City<span class="mandatory">*</span></label>
			<br>
			<form:input path="city" class="value" name="city" id="city" placeholder="Enter the city name" />
			<br>
			<label for="glucoseLevel" class="field">Blood Glucose Level(g/dl)<span class="mandatory">*</span></label>
			<form:input path="glucoseLevel" class="value" name="glucoseLevel" id="glucoseLevel" placeholder="Enter the Glucose Level in blood" />
			<br>
			
			<label for="time" class="field">Time at which sample collected<span class="mandatory">*</span></label>
			<form:input path="time" class="value" name="time" id="time" placeholder="Enter the time in HH:mm"/>
			<br>
			<input type="submit" id="button1" name="request" class="btn btn-success" value="Submit" onclick="return validateForm()">
			<input type="reset" id="button2" class="btn btn-success" Value="Reset">
	</form:form>
	</div>
</body>
</html>