package org.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hcl.models.DonateBlood;

@Repository("searchDao")
public class SearchDaoImpl implements SearchDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<DonateBlood> getSearchResults(String searchQuery) {

		String hql = "FROM DonateBlood donateBlood WHERE (donateBlood.bloodGroup=:bloodGroup OR donateBlood.city=:city) "
				+ "AND donateBlood.donationStatus='Approved' ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("bloodGroup", searchQuery);
		query.setParameter("city", searchQuery);

		return query.getResultList();

	}

}