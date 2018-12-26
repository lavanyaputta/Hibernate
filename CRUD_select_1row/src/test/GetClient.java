package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class GetClient {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		
		
		Object o=session.get(Student.class, 123); 
		Student st=(Student)o;
		System.out.println(st.getId());
		System.out.println("firing the quiry");
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
		
		
		 
		session.close();
		sf.close();
		System.out.println("select success");
		
		
	}

}
