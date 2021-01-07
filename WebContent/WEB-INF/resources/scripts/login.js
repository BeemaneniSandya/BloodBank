function validateFields() {
	let userName = document.getElementById("username").value;
	let password = document.getElementById("password").value;

	if (userName == "" || password == "") {
		swal({
			title : "Oops!!",
			text : "All fields are mandatory",
			icon : "error"
		});
		return false;
	}

	if (userName.length < 6 || userName.length > 25) {
		swal({
			title : "Oops!!",
			text : "Username length should be in between 6-25",
			icon : "error"
		});
		return false;
	} else {
		return true;
	}
}