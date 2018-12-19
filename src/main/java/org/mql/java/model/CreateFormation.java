package org.mql.java.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.java.entities.Formation;

public class CreateFormation {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.configure().addAnnotatedClass(Formation.class).buildSessionFactory()
			;
		
		Session session = factory.getCurrentSession();
		 try {
			 System.out.println("Creating new Streaming");
			 
			 session.beginTransaction();
			 
			 
			 session.getTransaction().commit();
			 System.out.println("done....! ");
			 
			 
		 } 
		 finally{
			  factory.close();
		 }
	}
}
