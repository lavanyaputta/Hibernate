package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    
    Session session=sf.openSession();
    Transaction t=session.beginTransaction();
	 Employee e1=new Employee(111,"naresh","naresh@gmail.com",5000);
	 Employee e2=new Employee(222,"suresh","sureh@gmail.com",6000);
	 Employee e3=new Employee(333,"ramesh","ramesh@gmail.com",7000);
	 Employee e4=new Employee(444,"raju","raju@gmail.com",9000);
	 session.save(e1);
	 session.save(e2);
	 session.save(e3);
	 session.save(e4);
	 t.commit();
	 session.close();
	 sf.close();
	 System.out.println("success");
}
}
