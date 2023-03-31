package training.oracle.springbootjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import training.oracle.springbootjpa.business.RTOOperations;
import training.oracle.springbootjpa.entities.OffenceEO;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner{
	
	@Autowired(required=true)
	private RTOOperations rtoOperations;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<OffenceEO> resultOffences=rtoOperations.fetchAllOffenceTypes();
		resultOffences.forEach(System.out::println);
		
	}

}
