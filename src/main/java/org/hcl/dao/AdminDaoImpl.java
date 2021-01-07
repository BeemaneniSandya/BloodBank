package org.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hcl.appexception.ApplicationException;
import org.hcl.models.Admin;
import org.hcl.models.DonateBlood;
import org.hcl.models.RequestBlood;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean validateAdmin(Admin admin) throws ApplicationException {

		if (admin.getUserName().equals("Admin") && admin.getPassword().equals("Admin@765")) {
			return true;
		}

		else {
			throw new ApplicationException("Invalid Credentials");
		}
	}

	public List<RequestBlood> getRequestList() {

		String hql = "FROM RequestBlood";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);

		return query.getResultList();

	}

	public boolean acceptRequest(long patientId) {

		Session session = sessionFactory.getCurrentSession();
		RequestBlood requestBlood = session.get(RequestBlood.class, patientId);
		requestBlood.setRequestStatus("Approved");
		session.update(requestBlood);
		return true;
	}

	public boolean rejectRequest(long patientId) {
		Session session = sessionFactory.getCurrentSession();
		RequestBlood requestBlood = session.get(RequestBlood.class, patientId);
		requestBlood.setRequestStatus("Rejected");
		session.update(requestBlood);
		return true;
	}

	public List<DonateBlood> getDonarList() {

		String hql = "FROM DonateBlood";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);

		return query.getResultList();

	}

	public boolean acceptDonar(long patientId) {

		Session session = sessionFactory.getCurrentSession();
		DonateBlood donateBlood = session.get(DonateBlood.class, patientId);
		donateBlood.setDonationStatus("Approved");
		session.update(donateBlood);
		return true;
	}

	public boolean rejectDonar(long patientId) {
		Session session = sessionFactory.getCurrentSession();
		DonateBlood donateBlood = session.get(DonateBlood.class, patientId);
		donateBlood.setDonationStatus("Rejected");
		session.update(donateBlood);
		return true;

	}
}