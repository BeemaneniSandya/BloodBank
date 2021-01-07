<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="navigation-bar2.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Blood</title>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/request_blood.css">
<script src="${pageContext.request.contextPath}/resources/scripts/request_blood.js"></script>
</head>
<body>
	<header>
		<h2>Request Blood</h2>
	</header>
	<p id="error">${error}</p>
	<div id="container">
		<form:form action="addRequest" method="post"
			modelAttribute="requestBlood">

			<label for="patientName" class="field">Patient Name<span class="mandatory">*</span></label>
			<br>
			<form:input path="patientName" class="value" name="patientname" id="patientname" placeholder="Enter the Patient's full name" />
			<br>
			<label for="bloodGroup" class="field">Required Blood Group<span class="mandatory">*</span></label>
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
			<label for="doctorName" class="field">Doctor Name<span class="mandatory">*</span></label>
			<br>
			<form:input path="doctorName" class="value" name="doctorname" id="doctorname" placeholder="Enter the Doctor's name" />
			<br>
			<label for="hospitalAddress" class="field">Hospital Name and Address<span class="mandatory">*</span>
			</label>
			<br>
			<form:textarea path="hospitalAddress" class="value"
				name="hospitalname" id="hospitalname"
				placeholder="Enter Hospital's name and Address" />
			<br>
			<label for="when" class="field">Blood Required on<span class="mandatory">*</span></label>
			<br>
			<form:input type="date" path="when" class="value" name="when" id="when"/>
			<br>
			<label for="contactName" class="field">Contact Name<span class="mandatory">*</span></label>
			<br>
			<form:input path="contactName" class="value" name="contactname" id="contactname" placeholder="Enter the name of the person to contact" />
			<br>
			<label for="contactNumber" class="field">Contact Number<span class="mandatory">*</span></label>
			<br>
			<form:input path="contactNumber" class="value" name="contactnumber" id="contactnumber" placeholder="Enter the contact number of person to contact" />
			<br>
			<label for="contactEmail" class="field">Contact Email Id<span class="mandatory">*</span></label>
			<br>
			<form:input type="email" path="contactEmail" class="value" name="contactemail" id="contactemail" placeholder="Enter the email-id of the person to contact" />
			<br>
			<input type="submit" id="button1" name="request" class="btn btn-success" value="Submit" onclick="return validateForm()">
			<input type="reset" id="button2" class="btn btn-success" Value="Reset">
		</form:form>
	</div>
</body>
</html>