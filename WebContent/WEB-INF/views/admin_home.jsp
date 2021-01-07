<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="navigation-bar3.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
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
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/admin_home-style.css">
<script
	src="${pageContext.request.contextPath}/resources/scripts/admin_action.js"></script>
</head>
<body>
	<header>
		<h1>Accept Requests</h1>
	</header>


	<div id="container">

		<c:if test="${requestAdminList==null}">
			<p id="message">${message}</p>
		</c:if>

		<c:if test="${requestAdminList!=null}">
			<table border="1"
				class="table table-bordered table-striped table-hover">
				<tr>
					<th class="field">Patient Name</th>
					<th class="field">BloodGroup</th>
					<th class="field">City</th>
					<th class="field">Hospital Address</th>
					<th class="field">Contact Name</th>
					<th class="field">Contact Number</th>
					<th class="field">Required On</th>
					<th class="field">Status</th>
					<th class="field">Action</th>
				</tr>
				<c:forEach items="${requestAdminList}" var="element">
					<tr>
						<td class="value">${element.patientName}</td>
						<td class="value">${element.bloodGroup}</td>
						<td class="value">${element.city}</td>
						<td class="value">${element.hospitalAddress}</td>
						<td class="value">${element.contactName}</td>
						<td class="value">${element.contactNumber}</td>
						<td class="value">${element.when}</td>
						<td class="value">${element.requestStatus}</td>
						<c:if test="${element.requestStatus=='Approval Pending'}">
							<td class="value">
								<form action="approveRequest/${element.patientId}">
									<input type="submit" class="btn btn-success button"
										value="Approve" onclick="return confirmApproveRequest()">
								</form>

								<form action="rejectRequest/${element.patientId}">
									<input type="submit" class="btn btn-danger button"
										value="Reject" onclick="return confirmRejectRequest()">
								</form>
							</td>
						</c:if>

						<c:if test="${element.requestStatus!='Approval Pending'}">
							<td class="value">No action needed</td>
						</c:if>

					</tr>
				</c:forEach>
			</table>


		</c:if>

	</div>

</body>
</html>