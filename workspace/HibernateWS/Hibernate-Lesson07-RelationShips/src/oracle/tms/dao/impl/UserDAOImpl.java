package oracle.tms.dao.impl;

import org.hibernate.Session;

import oracle.tms.dao.UserDAO;
import oracle.tms.entities.UserEO;
import oracle.tms.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {
	
	@Override
	public String insertUser(UserEO userEORef) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
			sessionRef.beginTransaction();
				String returnedUsername = (String)sessionRef.save(userEORef);
			sessionRef.getTransaction().commit();
		return returnedUsername;
	}

}
