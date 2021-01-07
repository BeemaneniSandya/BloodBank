package org.hcl.dao;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;

public interface LoginDao {

	public User validateUser(User user) throws ApplicationException;
}