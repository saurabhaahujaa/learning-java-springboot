package training.oracle.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import training.oracle.business.CurrencyConvertor;


public class DriverApp {

	public static void main(String[] args) {
		
		// Brining IOC in Action [ Like starting the Server ]
		ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
		
		// Lookup for the Bean
		CurrencyConvertor ccRef = (CurrencyConvertor)context.getBean("ccBean");
		
		// Invoking the Business Logic 
		String result = ccRef.dollarToRS(1000);
		System.out.println(result);
		
	}
	
}
