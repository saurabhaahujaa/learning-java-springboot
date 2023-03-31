package oracle.tms.business;

import java.util.List;

import oracle.tms.entities.OffenceEO;

public interface RTOOperations {
	
	public Integer addOffenceType(OffenceEO offenceEORef);
	
	public List<OffenceEO> fetchAllOffenceTypes();

}
