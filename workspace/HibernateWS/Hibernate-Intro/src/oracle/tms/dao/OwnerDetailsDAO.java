package oracle.tms.dao;

import oracle.tms.entities.OwnerDetailsEO;

public interface OwnerDetailsDAO {
	
	public Integer insertOwnerDetails( OwnerDetailsEO ownerDetailsEORef);
	public void updateOwnerDetails(OwnerDetailsEO ownerDetailsEORef);
	public void deleteOwnerDetails(Integer ownerID);
	public OwnerDetailsEO findOwnerIdEOByPrimaryKey(Integer ownerID);

}
