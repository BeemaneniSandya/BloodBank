<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<style>
li a {
	font-size: 20px;
    color: white;
	font-weight: bold;
}
#dropdown
{
  color:black;
}
#status
{
padding-left:20px;
padding-bottom:10px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="donarFront">Donate</a></li>
			<li class="nav-item"><a class="nav-link" href="requestFront">Request</a></li>
			<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#" id="status">Status <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li class="nav-item"><a id="dropdown" class="nav-link" href="requestStatus">RequestStatus</a></li>			
			        <li class="nav-item"><a id="dropdown" class="nav-link" href="donationStatus">DonationStatus</a></li>
				</ul>
			</li>
			
		</ul>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a href="userLogout">LogOut</a></li>
		</ul>
	</nav>
	<br>
</body>
</html>