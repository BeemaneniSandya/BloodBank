package org.hcl.services;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.RequestBlood;
import org.hcl.models.User;

public interface RequestBloodService {

	public boolean validateFields(RequestBlood requestBlood) throws ApplicationException;

	public boolean addRequest(RequestBlood requestBlood, User user);
}