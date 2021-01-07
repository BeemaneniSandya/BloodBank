package org.hcl.services;

import java.util.List;

import org.hcl.models.RequestBlood;
import org.hcl.models.User;

public interface RequestStatusService {

	public List<RequestBlood> getRequestList(User user);
}