<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="navigation-bar2.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Status</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/request_status-style.css">
</head>
<body>
	<header>
	<h1>Request Status</h1>
	</header>
	
	<div id="container">
		<c:if test="${requestList==null}">
			<p id="message">${message}</p>
		</c:if>
		<c:if test="${requestList!=null}">
			<table border="1"
				class="table table-bordered table-striped table-hover">
				<tr>
					<td class="field">Patient Name</td>
					<td class="field">Blood Group</td>
					<td class="field">City</td>
					<td class="field">Doctor Name</td>
					<td class="field">Hospital Address</td>
					<td class="field">Required on</td>
					<td class="field">Approval Status</td>
				</tr>

					<c:forEach items="${requestList}" var="element">
					 <tr>
						<td class="value">${element.patientName}</td>
						<td class="value">${element.bloodGroup}</td>
						<td class="value">${element.city}</td>
						<td class="value">${element.doctorName}</td>
						<td class="value">${element.hospitalAddress}</td>
						<td class="value">${element.when}</td>
						<td class="value">${element.requestStatus}</td>
					  </tr>
					</c:forEach>


			</table>


		</c:if>

	</div>
</body>
</html>