package oracle.tms.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactoryRef;
	
	static
	{
//		Configuration cfg = new Configuration();
//		cfg.configure(); // Configuration points to hibernate.cfg.xml 
//		sessionFactoryRef = cfg.buildSessionFactory(); // We Create SessionFactory Instance
		sessionFactoryRef= new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory(){
		return sessionFactoryRef;
	}
}
