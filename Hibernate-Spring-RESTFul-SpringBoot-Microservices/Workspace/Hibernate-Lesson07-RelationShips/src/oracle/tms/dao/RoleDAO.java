package oracle.tms.dao;

import java.util.List;

import oracle.tms.entities.RoleEO;


public interface RoleDAO {
	
	public String insertRole(RoleEO roleEORef);
	
	public void updateRole(RoleEO roleEORef);
	
	public void deleteRole(String roleName);
	
	public RoleEO findByPrimaryKey(String roleName);
	
	public List<RoleEO> findAllRoles();
	
	
	
}
