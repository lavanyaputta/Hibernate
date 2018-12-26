package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class SelectAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria c = session.createCriteria(Employee.class);
		List<Employee> list = c.list();
		for (Employee e : list) {
			System.out.println(
					"ID:" + e.getId() + "NAME:" + e.getName() + "EMAIL:" + e.getEmail() + "SAL:" + e.getSalary());
		}
	}
}
