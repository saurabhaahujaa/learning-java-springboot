package oracle.tms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import oracle.tms.dao.OffenceDAO;
import oracle.tms.entities.OffenceEO;
import oracle.tms.utils.HibernateUtil;

public class OffenceDAOImpl implements OffenceDAO {

	@Override
	public Integer  insertOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession(); // To Invoke API methods
		sessionRef.beginTransaction();
		Integer returnedPK=(Integer)sessionRef.save(offenceEORef); // API Call
		sessionRef.getTransaction().commit();
		sessionRef.close();
		return returnedPK;
	}

	@Override
	public void updateOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		sessionRef.beginTransaction();
		sessionRef.update(offenceEORef);// Update happens based on PK
		sessionRef.getTransaction().commit();
		sessionRef.close();

	}

	@Override
	public void deleteOffence(Integer offenceID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		sessionRef.beginTransaction();
		// Find EO based on PK
		OffenceEO offenceEOToBeDeleted = sessionRef.get(OffenceEO.class, offenceID);
		sessionRef.delete(offenceEOToBeDeleted);;// Delete happens based on PK
		sessionRef.getTransaction().commit();
		sessionRef.close();

	}

	@Override
	public OffenceEO findOffenceEOByPrimaryKey(Integer offenceID) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef=HibernateUtil.getSessionFactory();
		Session sessionRef=sessionFactoryRef.openSession();
		// Find EO based on PK
		OffenceEO offenceEOToBeDeleted = sessionRef.get(OffenceEO.class, offenceID);
		sessionRef.close();
		return offenceEOToBeDeleted;
	}
	
	@Override
	public List<OffenceEO> findAll() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef = HibernateUtil.getSessionFactory();
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
				// Here First We are Find the EO Based on PK
				String SELECTALL = "SELECT o FROM OffenceEO o";
				
				Query queryRef = sessionRef.createQuery(SELECTALL);
				
				List<OffenceEO> offenceResult = queryRef.list();
				
		sessionRef.close(); // Releases the Session
		return offenceResult;
	}

	@Override
	public List<OffenceEO> findByGivenPenalty(Float givenPenalty) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactoryRef = HibernateUtil.getSessionFactory();
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
				// Here First We are Find the EO Based on PK
				Query queryRef = sessionRef.createNamedQuery("ByPenalty");
				
					queryRef.setParameter("givenPenaltyValue", givenPenalty);
				
				List<OffenceEO> offenceResult = queryRef.list();
				sessionRef.close(); // Releases the Session
				return offenceResult;

	}
}
