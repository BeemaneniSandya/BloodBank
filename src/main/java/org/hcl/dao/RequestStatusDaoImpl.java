package org.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hcl.models.RequestBlood;
import org.hcl.models.User;

@Repository("requestStatusDao")
public class RequestStatusDaoImpl implements RequestStatusDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<RequestBlood> getRequestList(User user) {

		String hql = "FROM RequestBlood requestBlood WHERE requestBlood.accountId=:accountId";

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("accountId", user.getUserId());
		return query.getResultList();

	}

}