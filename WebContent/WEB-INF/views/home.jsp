<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ include file="navigation-bar2.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/home-style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/home-style.css">
<style>
body {
	background-image: url('C:\Users\HP\Downloads\bloodbank2.jpg\s');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>
</head>
<body>
	<section>
		<h1>Welcome ${user.userName}</h1>
	</section>

	<section>

		<form class="example" action="getResults"
			style="margin: auto; max-width: 500px">
			<input type="text" placeholder="Search by blood group or city name"
				name="search">
			<button type="submit">
				<i class="fa fa-search"></i>
			</button>
		</form>
		<br> <br>
		<c:if test="${searchQueryList!=null}">
			<h2 id="tableHeadder">List of available donars</h2>
			<table border="1" id="table"
				class="table table-bordered table-striped table-hover">
				<tr>
					<th class="field">Donar Name</th>
					<th class="field">BloodGroup</th>
					<th class="field">City</th>
					<th class="field">Glucose Level</th>
				</tr>
				<c:forEach items="${searchQueryList}" var="element">
					<tr>
						<td class="value">${element.donarName}</td>
						<td class="value">${element.bloodGroup}</td>
						<td class="value">${element.city}</td>
						<td class="value">${element.glucoseLevel}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

		<c:if test="${searchQueryList==null}">
			<c:if test="${initialMessgae==null}">
				<h2>No results found.</h2>
			</c:if>
		</c:if>
	</section>

	<!-- <section id="ImageContainer">
	  <img src="C:\Users\HP\Downloads\bloodbank2.jpg\" alt="Image related to blood donation" height=335>
	</section> -->


</body>
</html>