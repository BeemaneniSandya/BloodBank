function validateFields() {
	let adminName = document.getElementById("adminName").value;
	let password = document.getElementById("password").value;

	if (adminName == "" || password == "") {
		swal({
			title : "Oops!!",
			text : "All fields are mandatory",
			icon : "error"
		});
		return false;
	} else {
		return true;
	}
}