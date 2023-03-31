package oracle.tms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import oracle.tms.dao.OffenceDAO;
import oracle.tms.entities.OffenceEO;


public class OffenceDAOImpl implements OffenceDAO {

	private SessionFactory sessionFactoryRef;
	
	public SessionFactory getSessionFactoryRef() {
		return sessionFactoryRef;
	}

	public void setSessionFactoryRef(SessionFactory sessionFactoryRef) {
		this.sessionFactoryRef = sessionFactoryRef;
	}

	@Override
	public Integer insertOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
			sessionRef.beginTransaction(); // We Will Manage the Transaction
				Integer returnedPK = (Integer)sessionRef.save(offenceEORef); // API Call
			sessionRef.getTransaction().commit(); 
		sessionRef.close(); // Releases the Session 
		return returnedPK;
	}

	@Override
	public void updateOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
			sessionRef.beginTransaction(); // We Will Manage the Transaction
				sessionRef.update(offenceEORef); // Update Happens Based on PK
			sessionRef.getTransaction().commit(); 
		sessionRef.close(); // Releases the Session 
	}

	@Override
	public void deleteOffence(Integer offenceID) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
			sessionRef.beginTransaction(); // We Will Manage the Transaction
				// Here First We are Find the EO Based on PK 
				OffenceEO offenceEOToBeDeleted = sessionRef.get(OffenceEO.class, offenceID);
				sessionRef.delete(offenceEOToBeDeleted); // API Call
			sessionRef.getTransaction().commit(); 
		sessionRef.close(); // Releases the Session 
		
	}

	@Override
	public OffenceEO findOffenceEOByPrimaryKey(Integer offenceID) {
		// TODO Auto-generated method stub
		
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
				// Here First We are Find the EO Based on PK 
				OffenceEO offenceEOToBeReturned = sessionRef.get(OffenceEO.class, offenceID);
				
		sessionRef.close(); // Releases the Session
		return offenceEOToBeReturned;
	}

	@Override
	public List<OffenceEO> findAll() {
		// TODO Auto-generated method stub
		
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
		
		Session sessionRef = sessionFactoryRef.openSession(); // To Invoke API Methods
				// Here First We are Find the EO Based on PK
				Query queryRef = sessionRef.createNamedQuery("ByPenalty");
				
					queryRef.setParameter("givenPenaltyValue", givenPenalty);
				
				List<OffenceEO> offenceResult = queryRef.list();
				
		sessionRef.close(); // Releases the Session
		return offenceResult;
	}

}
