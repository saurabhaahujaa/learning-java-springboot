package oracle.tms.test;

import org.junit.Test;

import junit.framework.Assert;
import oracle.tms.dao.UserDAO;
import oracle.tms.dao.impl.UserDAOImpl;
import oracle.tms.entities.RoleEO;
import oracle.tms.entities.UserEO;

public class UserTest {

	
	@Test
	public void testAddUser()
	{
		RoleEO roleRef = new RoleEO("RTO","null");
		// EO of Dependent Ensure You Have Master Object With in
		UserEO userRef = new UserEO("Piyush", "piyush1234", roleRef);
		
		UserDAO userDAORef = new UserDAOImpl();
		String result = userDAORef.insertUser(userRef);
		
		Assert.assertEquals("Piyush",result);
	}
}
