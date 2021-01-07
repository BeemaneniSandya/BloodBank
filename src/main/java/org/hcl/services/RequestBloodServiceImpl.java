package org.hcl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.hcl.appexception.ApplicationException;
import org.hcl.dao.RequestBloodDao;
import org.hcl.models.RequestBlood;
import org.hcl.models.User;

@Service("requestBloodService")
public class RequestBloodServiceImpl implements RequestBloodService {

	@Autowired
	private RequestBloodDao requestBloodDao;

	public boolean validateFields(RequestBlood requestBlood) throws ApplicationException {

		if (requestBlood.getContactName() == "" || requestBlood.getBloodGroup() == "" || requestBlood.getCity() == ""
				|| requestBlood.getDoctorName() == "" || requestBlood.getHospitalAddress() == ""
				|| requestBlood.getPatientName() == "" || requestBlood.getContactNumber() == ""
				|| requestBlood.getContactEmail() == "" || requestBlood.getWhen() == "") {
			throw new ApplicationException("All fields are mandatory");
		} else if (requestBlood.getPatientName().length() < 3) {
			throw new ApplicationException("Please enter the full name of the patient");
		} else if (requestBlood.getHospitalAddress().length() > 100) {
			throw new ApplicationException("Maximum  Characters Reached");
		} else if (requestBlood.getContactName().length() < 3) {
			throw new ApplicationException("Please enter the full name of the contact person");
		} else if (requestBlood.getContactNumber().length() > 10) {
			throw new ApplicationException("Please enter a valid contact number");
		} else {
			return true;
		}

	}

	@Transactional
	public boolean addRequest(RequestBlood requestBlood, User user) {

		return requestBloodDao.addRequest(requestBlood, user);
	}

}