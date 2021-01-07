<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navigation-bar1.jsp" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success!!</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/success-style.css">
</head>
<body>

  <div class="container">
    <h2>Blood Bank Management Portal</h2>
    <div class="panel panel-success">
      <div class="panel-heading">Request Blood</div>
      <div class="panel-body">
         Your request has been successfully submitted.<a href="home">Click here to go back to Home page</a>
      </div>
    </div>
  </div>
</body>
</html>