package org.hcl.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.hcl.appexception.ApplicationException;
import org.hcl.dao.DonateBloodDao;
import org.hcl.models.DonateBlood;
import org.hcl.models.User;

@Service("donateBloodService")
public class DonateBloodServiceImpl implements DonateBloodService {

	@Autowired
	private DonateBloodDao donateBloodDao;

	public boolean validateDetails(DonateBlood donateBlood) throws ApplicationException {

		if (donateBlood.getDonarName() == "" || donateBlood.getBloodGroup() == "" || donateBlood.getCity() == ""
				|| donateBlood.getGlucoseLevel() == "" || donateBlood.getTime() == "") {
			throw new ApplicationException("All fields are mandatory");
		} else if (donateBlood.getDonarName().length() < 4) {
			throw new ApplicationException("Please enter the full name of the donar");
		} else if (donateBlood.getTime().length() != 5) {
			throw new ApplicationException("Please enter the time in valid format (HH:mm)");
		} else {
			return true;
		}
	}

	@Transactional
	public boolean addDonar(DonateBlood donateBlood, User user) {

		return donateBloodDao.addDonar(donateBlood, user);
	}

}