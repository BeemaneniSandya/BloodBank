package org.hcl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.hcl.appexception.ApplicationException;
import org.hcl.dao.RegistrationDao;
import org.hcl.models.User;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationDao;

	public boolean validateUser(User user) throws ApplicationException {

		if (user.getUserName() == "" || user.getPassword() == "" || user.getConfirmPassword() == "") {
			throw new ApplicationException("All fields are mandatory");
		} else if (user.getUserName().length() < 6 || user.getUserName().length() > 25) {
			throw new ApplicationException("Username length should be in between 6-25");
		} else if (!(user.getPassword().equals(user.getConfirmPassword()))) {
			throw new ApplicationException("Passwords are not same");
		} else if (isPasswordNotStrong(user.getPassword())) {
			throw new ApplicationException("Password is not strong");
		} else {
			return true;
		}
	}

	public boolean isPasswordNotStrong(String password) throws ApplicationException {

		if (password.length() < 8) {
			return true;
		} else {
			int captialLetterCount = 0;
			int smallLetterCount = 0;
			int numberCount = 0;
			int specialCharacterCount = 0;

			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
					captialLetterCount++;
				} else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
					smallLetterCount++;
				} else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					numberCount++;
				} else if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
						|| password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '&'
						|| password.charAt(i) == '*') {
					specialCharacterCount++;
				}
			}

			if (captialLetterCount < 1 || smallLetterCount < 1 || numberCount < 1 || specialCharacterCount < 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Transactional
	public boolean doesUserExists(User user) throws ApplicationException {

		return registrationDao.doesUserExists(user);
	}

	@Transactional
	public boolean addUser(User user) {

		return registrationDao.addUser(user);
	}

}