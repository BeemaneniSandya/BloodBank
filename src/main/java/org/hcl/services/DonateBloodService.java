package org.hcl.services;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.DonateBlood;
import org.hcl.models.User;

public interface DonateBloodService {

	public boolean validateDetails(DonateBlood donateBlood) throws ApplicationException;

	public boolean addDonar(DonateBlood donateBlood, User user);

}