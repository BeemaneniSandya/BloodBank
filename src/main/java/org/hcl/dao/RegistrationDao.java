package org.hcl.dao;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;

public interface RegistrationDao {
	public boolean doesUserExists(User user) throws ApplicationException;

	public boolean addUser(User user);
}