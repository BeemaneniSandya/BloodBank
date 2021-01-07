function confirmApproveRequest() {
	alert("Approve Blood Request");
	var answer = confirm("Are you sure you want to approve this request ?");
	if (answer == true) {
		alert("Approved Sucessfully!!");
		return true;
	} else {
		return false;
	}
}

function confirmRejectRequest() {
	alert("Reject Blood Request");
	var answer = confirm("Are you sure you want to reject this request ?");
	if (answer == true) {
		alert("Rejected Sucessfully!!");
		return true;
	} else {
		return false;
	}
}

function confirmApproveDonar() {
	alert("Approve Blood Donation");
	var answer = confirm("Are you sure you want to approve this Donation ?");
	if (answer == true) {
		alert("Approved Sucessfully!!");
		return true;
	} else {
		return false;
	}
}

function confirmRejectDonar() {
	alert("Reject Blood Donation");
	var answer = confirm("Are you sure you want to reject this Donation ?");
	if (answer == true) {
		alert("Rejected Sucessfully!!");
		return true;
	} else {
		return false;
	}
}
