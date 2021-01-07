package org.hcl.dao;

import java.util.List;

import org.hcl.models.RequestBlood;
import org.hcl.models.User;

public interface RequestStatusDao {

	public List<RequestBlood> getRequestList(User user);
}