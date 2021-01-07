<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="navigation-bar2.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donation Status</title>
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
	href="${pageContext.request.contextPath}/resources/styles/donation_status-style.css">
</head>
<body>
	<header>
	<h1>Donation Status</h1>
	</header>
	
	<div id="container">
		<c:if test="${donationList==null}">
			<p id="message">${message}</p>
		</c:if>
		<c:if test="${donationList!=null}">
			<table border="1"
				class="table table-bordered table-striped table-hover">
				<tr>
					<td class="field">Donar Name</td>
					<td class="field">Blood Group</td>
					<td class="field">City</td>
					<td class="field">Glucose Level</td>
					<td class="field">Sample Taken at</td>
					<td class="field">Approval Status</td>
				</tr>

					<c:forEach items="${donationList}" var="element">
					<tr>
						<td class="value">${element.donarName}</td>
						<td class="value">${element.bloodGroup}</td>
						<td class="value">${element.city}</td>
						<td class="value">${element.glucoseLevel}</td>
						<td class="value">${element.time}</td>
						<td class="value">${element.donationStatus}</td>
					</tr>
					</c:forEach>

			</table>


		</c:if>

	</div>
</body>
</html>