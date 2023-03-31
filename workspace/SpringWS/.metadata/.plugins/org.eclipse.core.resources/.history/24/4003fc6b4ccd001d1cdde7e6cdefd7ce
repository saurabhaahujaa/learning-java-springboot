package oracle.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import oracle.spring.business.CurrencyConvertor;

public class AppEntry {
	public static void main(String []args){
		//Instantiate IOC Container
		ApplicationContext appContext= new ClassPathXmlApplicationContext("/beans.xml");
		
		//Client is looking for the Business Component ByName
		CurrencyConvertor ccRef=(CurrencyConvertor) appContext.getBean("ccBean");
		
		System.out.println(ccRef.dollarToRS(1000.0));
		System.out.println(ccRef.yensToRS(110.0));
	}
}
