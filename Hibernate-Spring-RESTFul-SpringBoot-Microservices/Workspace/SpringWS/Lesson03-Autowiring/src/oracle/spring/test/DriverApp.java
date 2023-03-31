package oracle.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import oracle.spring.business.CurrencyConvertor;
import oracle.spring.business.impl.Customer;


public class DriverApp {
	
	public static void main(String[] args) {
		
		// Instanciation of IOC Container [ Bring IOC Container In Action ]
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/beans.xml");
		
		// Client is Looking for the Business Component ByName 
		CurrencyConvertor ccRef = (CurrencyConvertor)appContext.getBean("ccBean");
		
		// Invocation of Business Operation
		System.out.println(ccRef.dollarToRS(1000.0));
		System.out.println(ccRef.yensToRS(10000.0));
		
		
		
	}

}
