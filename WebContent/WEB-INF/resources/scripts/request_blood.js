function validateForm() {
	let patientName = document.getElementById("patientname").value;
	let requiredGroup = document.getElementById("requiredgroup").value;
	let city = document.getElementById("city").value;
	let doctorName = document.getElementById("doctorname").value;
	let hospitalName = document.getElementById("hospitalname").value;
	let when = document.getElementById("when").value;
	let contactName = document.getElementById("contactname").value;
	let contactNumber = document.getElementById("contactnumber").value;
	let contactMail = document.getElementById("contactemail").value;

	if (patientName == "" || requiredGroup == "" || city == ""
			|| doctorName == "" || hospitalName == "" || when == ""
			|| contactName == "" || contactNumber == "" || contactEmail == "") {
		swal({
			title : "Oops!!",
			text : "All fields are mandatory",
			icon : "error"
		});
		return false;
	} else if (patientName.length < 3) {
		swal({
			title : "Oops!!",
			text : "Please enter the full name of the patient",
			icon : "error"
		});
		return false;
	} else if (hospitalName.length > 100) {
		swal({
			title : "Oops!!",
			text : "Maximum Characters Reached",
			icon : "error"
		});
		return false;
	} else if (contactName.length < 3) {
		swal({
			title : "Oops!!",
			text : "Please enter full name of the contact person",
			icon : "error"
		});
		return false;
	} else if (contactNumber.length > 10) {
		swal({
			title : "Oops!!",
			text : "Enter a valid contact number",
			icon : "error"
		});
	}

	else {

		return true;
	}
}