package org.hcl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hcl.models.DonateBlood;
import org.hcl.models.User;

@Repository("donateBloodDao")
public class DonateBloodDaoImpl implements DonateBloodDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean addDonar(DonateBlood donateBlood, User user) {

		Session session = sessionFactory.getCurrentSession();
		donateBlood.setDonationStatus("Approval Pending");
		donateBlood.setAccountId(user.getUserId());
		session.save(donateBlood);
		return true;
	}

}