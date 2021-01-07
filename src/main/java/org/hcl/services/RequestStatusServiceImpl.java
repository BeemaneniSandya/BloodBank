package org.hcl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.hcl.dao.RequestStatusDao;
import org.hcl.models.RequestBlood;
import org.hcl.models.User;

@Service("requestStatusService")
public class RequestStatusServiceImpl implements RequestStatusService {

	@Autowired
	private RequestStatusDao requestStatusDao;

	@Transactional
	public List<RequestBlood> getRequestList(User user) {

		return requestStatusDao.getRequestList(user);
	}

}