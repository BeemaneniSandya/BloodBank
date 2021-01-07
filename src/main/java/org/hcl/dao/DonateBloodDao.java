package org.hcl.dao;

import org.hcl.models.DonateBlood;
import org.hcl.models.User;

public interface DonateBloodDao {

	public boolean addDonar(DonateBlood donateBlood, User user);
}