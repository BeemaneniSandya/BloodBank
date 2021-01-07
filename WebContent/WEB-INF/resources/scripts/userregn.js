function validateForm() {
	let userName = document.getElementById("username").value;
	let password = document.getElementById("password").value;
	let confirmPassword = document.getElementById("cnfpassword").value;

	if (userName == "" || password == "" || confirmPassword == "") {
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
	}
	if (password != confirmPassword) {
		swal({
			title : "Oops!!",
			text : "Passwords donot match",
			icon : "error"
		});
		return false;
	}

	if (checkPasswordStrength(password)) {
		swal({
			title : "Oops!!",
			text : "Passwords is not strong enough",
			icon : "error"
		});
		return false;
	} else {
		return true;
	}

}
function checkPasswordStrength(password) {
	if (password.length < 8) {
		return true;
	} else {
		var capitalLetterCount = 0;
		var smallLetterCount = 0;
		var numbersCount = 0;
		var specialCharCount = 0;

		for (i = 0; i < password.length; i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				capitalLetterCount++;
			} else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				smallLetterCount++;
			} else if (password.charAt(i) >= 0 && password.charAt(i) <= 9) {
				numbersCount++;
			} else if (password.charAt(i) == '!' || password.charAt(i) == '@'
					|| password.charAt(i) == '#' || password.charAt(i) == '$'
					|| password.charAt(i) == '%' || password.charAt(i) == '&'
					|| password.charAt(i) == '*') {
				specialCharCount++;
			}
		}

		if (capitalLetterCount < 1 || smallLetterCount < 1 || numbersCount < 1
				|| specialCharCount < 1) {
			return true;
		}
	}
}