package org.hcl.services;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;

public interface RegistrationService {

	public boolean validateUser(User user) throws ApplicationException;

	public boolean isPasswordNotStrong(String password) throws ApplicationException;

	public boolean doesUserExists(User user) throws ApplicationException;

	public boolean addUser(User user);
}