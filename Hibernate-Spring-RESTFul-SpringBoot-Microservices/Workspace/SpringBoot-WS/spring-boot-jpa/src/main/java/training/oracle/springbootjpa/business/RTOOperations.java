package training.oracle.springbootjpa.business;

import java.util.List;

import training.oracle.springbootjpa.entities.OffenceEO;

public interface RTOOperations {

	public Integer addOffenceType(OffenceEO offenceEORef);
	
	public List<OffenceEO> fetchAllOffenceTypes();

}
