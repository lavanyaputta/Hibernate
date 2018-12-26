package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class SelectUsingProjections {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    
	    Criteria  cr=session.createCriteria(Employee.class);
	    //for single column select opertaion
	    Projection p=Projections.property("name");
	    cr.setProjection(p);
	    List<String> list=cr.list();
	    for(String name:list){
	    	System.out.println(name);
	    	
	    	//for multiple coulmn select operations
	   /* Projection p1=Projections.property("name");
	    Projection p2=Projections.property("email");
	   ProjectionList plist= Projections.projectionList();
	   plist.add(p1);
	   plist.add(p2);
	   
	   cr.setProjection(plist);
	   
	   List<Object[]> list=cr.list();
	    for(Object[] o:list){
	    	System.out.println(o[0]);
	    	System.out.println(o[1]);*/
	    	}
	}

}
