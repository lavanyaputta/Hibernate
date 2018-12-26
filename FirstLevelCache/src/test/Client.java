package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	 
	
	Student st1=(Student)session.get(Student.class,1);
	 System.out.println(st1.getName());
	 
	 
	
	Student st2=(Student)session.get(Student.class,1);
System.out.println(st2.getEmail());


	
}
}
