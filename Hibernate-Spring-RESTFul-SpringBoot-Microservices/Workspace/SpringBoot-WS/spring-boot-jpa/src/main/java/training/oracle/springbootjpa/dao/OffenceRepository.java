package training.oracle.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import training.oracle.springbootjpa.entities.OffenceEO;

@Repository
public interface OffenceRepository extends CrudRepository<OffenceEO, Integer>{
	
	
}
