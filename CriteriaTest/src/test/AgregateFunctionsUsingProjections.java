package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class AgregateFunctionsUsingProjections {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    
	    Criteria  cr=session.createCriteria(Employee.class);  
	    Projection p1=Projections.avg("salary");
	    cr.setProjection(p1);
	    double avg_salary=(Double)cr.uniqueResult();
	    System.out.println(avg_salary);
	    
	    
	    Projection p2=Projections.max("salary");
	    cr.setProjection(p2);
	    int high_salary=(Integer)cr.uniqueResult();
	    System.out.println(high_salary);
	    
	    Projection p3=Projections.sum("salary");
	    cr.setProjection(p3);
	    int sum_ofall=(Integer)cr.uniqueResult();
	    System.out.println(sum_ofall);
	    
	    
	}

}
