package oracle.tms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import oracle.tms.dao.RoleDAO;
import oracle.tms.entities.RoleEO;
import oracle.tms.util.HibernateUtil;

public class RoleDAOImpl implements RoleDAO {

	@Override
	public String insertRole(RoleEO roleEORef) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = sessionRef.getTransaction();
		tx.begin();
		String pk = (String) sessionRef.save(roleEORef);
		tx.commit();
		sessionRef.close();
		return pk;
	}

	@Override
	public void updateRole(RoleEO roleEORef) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = sessionRef.getTransaction();
		tx.begin();
			sessionRef.update(roleEORef);
		tx.commit();
		sessionRef.close();
	}

	@Override
	public void deleteRole(String roleName) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = sessionRef.getTransaction();
			tx.begin();
				RoleEO returnedRoleEORef = 
						sessionRef.get(RoleEO.class, roleName);
				sessionRef.delete(returnedRoleEORef);
			tx.commit();
		sessionRef.close();
	}

	@Override
	public RoleEO findByPrimaryKey(String roleName) {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		
			RoleEO returnedRoleEORef = 
				sessionRef.get(RoleEO.class, roleName);
			
		return returnedRoleEORef;
	}

	@Override
	public List<RoleEO> findAllRoles() {
		// TODO Auto-generated method stub
		Session sessionRef = HibernateUtil.getSessionFactory().openSession();
		
		Query queryRef = sessionRef.getNamedQuery("RoleEO.findAll");
		
		return queryRef.list();
	}

	
}
