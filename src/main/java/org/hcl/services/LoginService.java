package org.hcl.services;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;

public interface LoginService {

	public boolean validateUserLogin(User user) throws ApplicationException;

	public User validateUser(User user) throws ApplicationException;
}