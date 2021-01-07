function validateForm() {
	donarName = document.getElementById("donarName").value;
	bloodGroup = document.getElementById("requiredgroup").value;
	city = document.getElementById("city").value;
	glucoseLevel = document.getElementById("glucoseLevel").value;
	time = document.getElementById("time").value;

	if (donarName == "" || bloodGroup == "" || city == "" || glucoseLevel == ""
			|| time == "") {
		swal({
			title : "Oops!!",
			text : "All fields are mandatory",
			icon : "error"
		});
		return false;
	} else if (donarName.length < 4) {
		swal({
			title : "Oops!!",
			text : "Please enter the full name of the donar",
			icon : "error"
		});
		return false;
	} else if (time.length != 5) {
		swal({
			title : "Oops!!",
			text : "Please enter the time in valid format (HH:mm)",
			icon : "error"
		});
		return false;
	} else {
		return true;
	}
}