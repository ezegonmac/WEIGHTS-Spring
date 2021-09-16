package es.ezegonmac.HibernateConnection;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveWeight {
	
	public static void main(String[] args ) {

		// 1. Crear SessionFactory
		
		SessionFactory factory 
				= new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Weights.class)
					.buildSessionFactory();
		
		// 2. Crear obj Session
		
		Session session = factory.openSession();
		
		try {
			// 3. Crear obj Weight
			Date date = new Date();
			Weights weight1 = new Weights(60.8, date);
			
			// 4. Realizar transaccion SQL
			session.beginTransaction();
			session.save(weight1);
			session.getTransaction().commit();
			
			System.out.println("Registro insertado satisfactoriamente");
			
			session.close();
			
		}finally {
			factory.close();
		}
		
					
	}

}
