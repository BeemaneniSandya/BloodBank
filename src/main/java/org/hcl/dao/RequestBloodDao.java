package org.hcl.dao;

import org.hcl.models.RequestBlood;
import org.hcl.models.User;

public interface RequestBloodDao {

	public boolean addRequest(RequestBlood requestBlood, User user);
}