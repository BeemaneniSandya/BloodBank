package org.hcl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.hcl.appexception.ApplicationException;
import org.hcl.dao.LoginDao;
import org.hcl.models.User;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	public boolean validateUserLogin(User user) throws ApplicationException {

		if (user.getUserName() == "" || user.getPassword() == "") {
			throw new ApplicationException("All fields are mandatory");
		} else if (user.getUserName().length() < 6 || user.getUserName().length() > 25) {
			throw new ApplicationException("Username length should be in between 6-25");
		} else {
			return true;
		}

	}

	@Transactional
	public User validateUser(User user) throws ApplicationException {

		return loginDao.validateUser(user);
	}

}