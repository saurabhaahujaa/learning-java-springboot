package oracle.spring.test;

import oracle.spring.business.impl.CurrencyConvertorImpl;
import oracle.spring.business.impl.Customer;

public class AppEntry {
	public static void main(String []args){
		//Business Dependency Object Creation
		Customer customerRef=new Customer(1,"Rahul","93848994");
		//Business target object creation
		CurrencyConvertorImpl ccRef=new CurrencyConvertorImpl();
		
		//Injecting Dependent Object tp Target Object
		//via Setter Method
		ccRef.setCustomerRef(customerRef);
		System.out.println(ccRef.dollarToRS(1000.0));
		System.out.println(ccRef.yensToRS(110.0));
	}
}
