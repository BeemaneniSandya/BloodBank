package org.hcl.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	private static final Logger logger = LogManager.getLogger(LoginDaoImpl.class);

	public User validateUser(User user) throws ApplicationException {

		Long user_id;
		String sql = "SELECT userId  FROM User user WHERE user.userName=:username AND user.password=:password";

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		query.setString("username", user.getUserName());
		query.setString("password", user.getPassword());
		user_id = (Long) query.uniqueResult();
		logger.info(user.getUserName() + " entered in to validateUser method of LoginDaoImpl of Dao Layer");
		if (user_id == null) {
			logger.info(user.getUserName() + " is wrong or Password is wrong");
			throw new ApplicationException("Either User Name or Password or both are invalid");
		} else {
			user.setUserId(user_id);
		}
		return user;
	}

}