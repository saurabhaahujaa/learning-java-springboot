package oracle.tms.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import org.junit.*;
import oracle.tms.dao.RoleDAO;
import oracle.tms.dao.impl.RoleDAOImpl;
import oracle.tms.entities.RoleEO;


public class RoleEOTest {
	
	private RoleDAO roleDAORef = new RoleDAOImpl();
	
	
	@Test
	public void insertRoleTest()
	{
		RoleEO roleEORef = new RoleEO();
		roleEORef.setRolename("RTO");
		roleEORef.setRoleDesc("The RTO Officer");
		String result = roleDAORef.insertRole(roleEORef);
		
		Assert.assertEquals("RTO", result);
		
	}
	
	
	@Test
	public void findAllRoles()
	{
	
		List<RoleEO> returnedOffenceListRef = 
				roleDAORef.findAllRoles();
		
		for (Iterator iterator = returnedOffenceListRef.iterator(); iterator.hasNext();) {
			RoleEO roleEORef = (RoleEO) iterator.next();
			System.out.println(roleEORef);
		}
		
		Assert.assertNotNull(returnedOffenceListRef);
	}
	
	
}
