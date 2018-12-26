package Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class StoreData {

	public static void main(String[] args) {
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		
		//creating session factory Object
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t= session.beginTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setFirstName("lavanya");
		e.setLastName("putta");
		
		session.persist(e);
		t.commit();
		session.close();
		System.out.println("saved succussfully..........");
		
		
		
		
		
		
		
		
	}
	
}
