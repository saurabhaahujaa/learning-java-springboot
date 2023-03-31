package oracle.spring.test;

import oracle.spring.business.CurrencyConvertor;
import oracle.spring.business.impl.CurrencyConvertorImpl;
import oracle.spring.business.impl.Customer;

public class AppEntry {
	
	public static void main(String[] args) {
		
		// Business Dependent Object Creation 
		Customer custRef = new Customer(1, "Rahul", "9874563210");
		
		// Business Target Object Creation
		CurrencyConvertorImpl ccRef = new CurrencyConvertorImpl();
	
		// Injecting Dependent Object to Target Object 
		// Via Setter Method
		ccRef.setCustomerRef(custRef);
		
		// Invocation of Business Operation
		System.out.println(ccRef.dollarToRS(1000.0));
		System.out.println(ccRef.yensToRS(10000.0));
		
		
		
		
	}

}
