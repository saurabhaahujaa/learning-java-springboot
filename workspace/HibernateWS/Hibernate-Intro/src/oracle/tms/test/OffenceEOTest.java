package oracle.tms.test;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import oracle.tms.dao.OffenceDAO;
import oracle.tms.dao.impl.OffenceDAOImpl;
import oracle.tms.entities.OffenceEO;

public class OffenceEOTest {
	public OffenceDAO offenceDAORef=new OffenceDAOImpl();
	
	@Test
	public void testInsertOffence() {
		
		//Create entity object
		OffenceEO offenceEORef=
				new OffenceEO(new Integer(1004),"No License",new Float(5000.0f),"All vehicles");
		
		//Invoke the DAO Impl
		Integer result=offenceDAORef.insertOffence(offenceEORef);
		
		//Testing
		Assert.assertEquals(new Integer(1004), result);
	}
	@Test
	public void testUpdateOffence() {
		
		//Create entity object
		OffenceEO offenceEORef=
				new OffenceEO(new Integer(1001),"Rash Driving",new Float(10000.0f),"All vehicles");
		
		//Invoke the DAO Impl
		offenceDAORef.updateOffence(offenceEORef);
		
	}
	
	@Test
	public void testDeleteOffence() {
		
		//Invoke the DAO Impl
		offenceDAORef.deleteOffence(new Integer(1004));

	}
	
	@Test
	public void testfindOffenceEOByPrimaryKey() {
		
		OffenceEO resultOffence=offenceDAORef.findOffenceEOByPrimaryKey(1003);
		
		Assert.assertNotNull(resultOffence);
		System.out.println(resultOffence);

	}
	@Test
	public void testFindAll() {
		
		// Invoke the DAO Impl
		List<OffenceEO> resultOffences = offenceDAORef.findAll();
		
		Assert.assertNotNull(resultOffences);
		
		for (Iterator iterator = resultOffences.iterator(); iterator.hasNext();) {
			OffenceEO offenceEO = (OffenceEO) iterator.next();
			System.out.println(offenceEO);
		}
		
	}
	
	@Test
	public void testFindByPenalty() {
		
		// Invoke the DAO Impl
		List<OffenceEO> resultOffences = offenceDAORef.findByGivenPenalty(5000.0f);
		
		Assert.assertNotNull(resultOffences);
		
		for (Iterator iterator = resultOffences.iterator(); iterator.hasNext();) {
			OffenceEO offenceEO = (OffenceEO) iterator.next();
			System.out.println(offenceEO);
		}
		
	}



}
