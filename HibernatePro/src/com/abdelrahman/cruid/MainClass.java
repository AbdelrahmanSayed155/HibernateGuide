/**
 * 
 */
package com.abdelrahman.cruid;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.abdelrahman.testCon.UserDetails;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 11, 2018
 */
public class MainClass {
	
	public  double add(int y ,int x){
		return y+x;
	}
	public  double sub(int y ,int x){
		return y-x;
	}
	public static void main(String []args){
		
	
		
		
/// insert 
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		for(int y=0;y<10;y++){
//			Student st = new Student();
//			st.setName("Abdelrahman " + y);
//			st.setBirthDay(new Date());
//			st.setAddress("NaserCity street number " +y);
//			session.save(st);
//		}
//		session.getTransaction().commit();
//		session.close();
		
		
		/// selecting 
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Student  std = (Student) session.get(Student.class, 2);
//		session.close();
//		System.out.print(std.getName());
////		session.close();
		
	
		/// deleting 
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Student  std =  new Student();
//		//(Student) session.get(Student.class, 2);
//		std.setId(30);
//		std.setAddress("NaserCity street number 9");
//		std.setName("Abdelrahman 9");
//		session.delete(std);
//		session.getTransaction().commit();
//		session.close();
//		System.out.print("deleted from DB user name " + std.getName());
//		
		
		
		/// transient 
		
		
		
//		/// prstance  
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Student  std =  new Student();
//		//(Student) session.get(Student.class, 2);
//		
//		std.setBirthDay(new Date());
//		std.setAddress("lol_Fol");
//		std.setName("Abdelrahman 9");
//		session.save(std);
//		
//		std.setName("LOLOLO");
//		session.getTransaction().commit();
//		session.close();
//		System.out.print(" this prstance " + std.getName());
		
///------------------HQL
		
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.addAnnotatedClass(Student.class);
		annotationConfiguration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		org.hibernate.Query query = session.createQuery("from Student where id=:Tid and name=:Tname ");
		query.setCacheable(true);
		
		
		
////		query.setInteger(0, 1);
////		query.setString(1, "abdelrahman");
//		
//		// or 
//		
//		query.setInteger("Tid", id);
//		query.setString("Tname", name);
//		
//		List students = query.list();
//		
//		Student  std =  new Student();
//		//(Student) session.get(Student.class, 2);
//		
//		std.setBirthDay(new Date());
//		std.setAddress("lol_Fol");
//		std.setName("Abdelrahman 9");
//		session.save(std);
//		
//		std.setName("LOLOLO");
//		session.getTransaction().commit();
//		session.close();
//		System.out.print(" this prstance " + std.getName());

		
		
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		org.hibernate.Query query = session.getNamedQuery("gettingAllStudentBYID");
//		query.setInteger("inputid", 1);
//		List students = query.list();
		
//		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
//		annotationConfiguration.addAnnotatedClass(Student.class);
//		annotationConfiguration.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
//		//SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		org.hibernate.Criteria criteria  = session.createCriteria(Student.class);
//				criteria.add(Restrictions.eq("id", "10"))
//				.add(Restrictions.eq("name", "abdelrahman"))
//				.add(Restrictions.like("lastname", " % abdelrahman %"))
//				.add(Restrictions.between("salary", 10, 12))
//				.add(Restrictions.or(Restrictions.eq("", 7), Restrictions.eq("", 7)))
//				.add(Restrictions.and(Restrictions.eq("", 7), Restrictions.eq("", 7)));
//				
//				
//				org.hibernate.Criteria criteria2  = session.createCriteria(Student.class);
//				criteria2.setProjection(Projections.property(""));
//				//// from Student whre id =10 and name="abdelrahman"
//		List<Student> students = (List<Student>)criteria.list();
//		   
		  }
	
	

}
