package org.hcl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hcl.models.RequestBlood;
import org.hcl.models.User;

@Repository("requestBloodDao")
public class RequestBloodDaoImpl implements RequestBloodDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean addRequest(RequestBlood requestBlood, User user) {

		Session session = sessionFactory.getCurrentSession();
		requestBlood.setRequestStatus("Approval Pending");
		requestBlood.setAccountId(user.getUserId());
		session.save(requestBlood);
		return true;
	}

}