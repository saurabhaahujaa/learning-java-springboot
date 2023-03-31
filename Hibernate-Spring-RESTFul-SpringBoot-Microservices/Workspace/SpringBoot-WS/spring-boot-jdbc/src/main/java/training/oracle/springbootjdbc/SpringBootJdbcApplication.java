package training.oracle.springbootjdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String SQLQuery = "SELECT * FROM TM_OFFENCE";
		
		List<OffenceVO> resultOffences = jdbcTemplate.query(SQLQuery, 
						BeanPropertyRowMapper.newInstance(OffenceVO.class));
		
		resultOffences.forEach(System.out :: println);
		
//		for (Iterator iterator = resultOffences.iterator(); iterator.hasNext();) {
//			OffenceVO offenceVO = (OffenceVO) iterator.next();
//			System.out.println(offenceVO);
//		}
	}

}
