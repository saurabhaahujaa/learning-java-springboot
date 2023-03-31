package oracle.tms.util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactoryRef;
	
	static
	{
		//  Using Hibernate.properties
		//Configuration cfg = new Configuration().addClass(OffenceEO.class);
		
		// Using hibernate.cfg.xml
		Configuration cfg = new Configuration().configure();
		sessionFactoryRef = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactoryRef;
	}
}
