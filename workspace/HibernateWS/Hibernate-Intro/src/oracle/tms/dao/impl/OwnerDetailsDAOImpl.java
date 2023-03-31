package oracle.tms.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import oracle.tms.dao.OwnerDetailsDAO;
import oracle.tms.entities.OwnerDetailsEO;
import oracle.tms.utils.HibernateUtil;

public class OwnerDetailsDAOImpl implements OwnerDetailsDAO {

	@Override
	public Integer insertOwnerDetails(OwnerDetailsEO ownerDetailsEORef) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession(); // To Invoke API methods
		sessionRef.beginTransaction();
		Integer returnedPK=(Integer)sessionRef.save(ownerDetailsEORef); // API Call
		sessionRef.getTransaction().commit();
		sessionRef.close();
		return returnedPK;
	}

	@Override
	public void updateOwnerDetails(OwnerDetailsEO ownerDetailsEORef) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		sessionRef.beginTransaction();
		sessionRef.update(ownerDetailsEORef);// Update happens based on PK
		sessionRef.getTransaction().commit();
		sessionRef.close();

	}

	@Override
	public void deleteOwnerDetails(Integer ownerID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		sessionRef.beginTransaction();
		// Find EO based on PK
		OwnerDetailsEO ownerDetailsEOToBeDeleted = sessionRef.get(OwnerDetailsEO.class, ownerID);
		sessionRef.delete(ownerDetailsEOToBeDeleted);;// Delete happens based on PK
		sessionRef.getTransaction().commit();
		sessionRef.close();

	}

	@Override
	public OwnerDetailsEO findOwnerIdEOByPrimaryKey(Integer ownerID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		// Find EO based on PK
		OwnerDetailsEO ownerDetailsEOSearched = sessionRef.get(OwnerDetailsEO.class, ownerID);
		sessionRef.close();
		return ownerDetailsEOSearched;
	}

}
