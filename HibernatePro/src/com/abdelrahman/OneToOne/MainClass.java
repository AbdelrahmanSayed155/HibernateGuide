/**
 * 
 */
package com.abdelrahman.OneToOne;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.abdelrahman.testCon.UserDetails;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 11, 2018
 */
public class MainClass {
	public static void main(String[] args) {
		
		Passport passport = new Passport();
		passport.setNationality("Egyption");
		
		Person person =  new Person();
		person.setName("Abdelrahman");
		person.setAddress("Naser City ");
		person.setPassport(passport);
		
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.addAnnotatedClass(UserDetails.class);
		annotationConfiguration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(passport);
		session.save(person);
		session.close();
		
	}
	

}
