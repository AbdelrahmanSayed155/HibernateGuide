/**
 * 
 */
package com.abdelrahman.testCon;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * @author Abdelrahman Sayed
 *
 * Apr 10, 2018
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetails  user = new UserDetails();
		user.setId(5);
		user.setName("Abdelrahman Sayed Mohamed ----- ");
		user.setAddress("Naser City");
		user.setDescription("My name is abdelrahaman Sayed Mohamed ");
		user.setJoinDate(new Date());
		
		UserDetails  user1 = new UserDetails();
		user1.setName("Abdelrahman Sayed Mohamed ----- ");
		user1.setAddress("Naser City");
		user1.setDescription("My name is abdelrahaman Sayed Mohamed ");
		user1.setJoinDate(new Date());
		
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.addAnnotatedClass(UserDetails.class);
		annotationConfiguration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user1);
		session.getTransaction().commit();
		session.close();
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 5);
		System.out.println("user name : " +user.getName());
		session.close();
		
	}

}
