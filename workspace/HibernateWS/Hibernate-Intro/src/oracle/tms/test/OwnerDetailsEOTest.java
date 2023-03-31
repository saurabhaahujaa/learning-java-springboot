package oracle.tms.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import oracle.tms.dao.OwnerDetailsDAO;
import oracle.tms.dao.impl.OwnerDetailsDAOImpl;
import oracle.tms.entities.OffenceEO;
import oracle.tms.entities.OwnerDetailsEO;

class OwnerDetailsEOTest {
	
	public OwnerDetailsDAO ownerDetailsDAORef= new OwnerDetailsDAOImpl();

	@Test
	public void testInsertOwnerDetails() {
		
		//Create entity object
		OwnerDetailsEO ownerDetailsEORef=
				new OwnerDetailsEO(new Integer(1002),"John","Chambers","12/1/80",new Integer(23456),"993882716","MALE","12 JM UK","11 US",new Integer(560075),"CEO","ahrrp2323p","Adhaar");
		//Invoke the DAO Impl
		Integer result=ownerDetailsDAORef.insertOwnerDetails(ownerDetailsEORef);
		
		//Testing
		Assert.assertNotNull(result);
	}
	

@Test
public void testUpdateOwnerDetails() {
	
	//Create entity object
	OwnerDetailsEO ownerDetailsEORef=
			new OwnerDetailsEO(new Integer(1001),"John","Chambers","12/1/85",new Integer(23456),"993882716","MALE","12 JM UK","11 US",new Integer(560075),"CEO","ahrrp2323p","Adhaar");
	
	//Invoke the DAO Impl
	ownerDetailsDAORef.updateOwnerDetails(ownerDetailsEORef);
	
}
//
@Test
public void testDeleteOwnerDetails() {
	
	//Invoke the DAO Impl
	ownerDetailsDAORef.deleteOwnerDetails(new Integer(1002));

}

@Test
public void testfindOwnerIdEOByPrimaryKey() {
	
	OwnerDetailsEO resultOwner=ownerDetailsDAORef.findOwnerIdEOByPrimaryKey(1001);
	
	Assert.assertNotNull(resultOwner);
	System.out.println(resultOwner);
}

}
