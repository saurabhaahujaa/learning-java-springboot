package oracle.tms.entry;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import oracle.tms.business.RTOOperations;
import oracle.tms.entities.OffenceEO;

public class DriverApp {
	public static void main(String[] args) {
		// IOC Container got into Action
		ApplicationContext appContext=new ClassPathXmlApplicationContext("/beans.xml");
		
		//Lookup for Business Components on IOC
		RTOOperations rtoOperRef=(RTOOperations)appContext.getBean("rtoBean");
		
		//Invoke the operations
		
		List<OffenceEO> resultListRef=rtoOperRef.fetchAllOffenceTypes();
		
		for (Iterator iterator=resultListRef.iterator();iterator.hasNext();) {
			OffenceEO offenceEO=(OffenceEO)iterator.next();
			System.out.println(offenceEO);
		}
	}

}
