package training.oracle.springbootjpa.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.oracle.springbootjpa.business.RTOOperations;
import training.oracle.springbootjpa.dao.OffenceRepository;
import training.oracle.springbootjpa.entities.OffenceEO;

@Service
public class RTOOperationsImpl implements RTOOperations {

	@Autowired
	private OffenceRepository offenceRepository;
	
	@Override
	public Integer addOffenceType(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		OffenceEO returnedOffenceEO =offenceRepository.save(offenceEORef);
		return returnedOffenceEO.getOffenceId();
	}

	@Override
	public List<OffenceEO> fetchAllOffenceTypes() {
		// TODO Auto-generated method stub
		List<OffenceEO> offenceResultList = new ArrayList<>();
		offenceRepository.findAll().forEach(offenceResultList::add);
		return offenceResultList;
	}

}
