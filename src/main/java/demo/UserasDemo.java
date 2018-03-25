package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;

import model.Useras;

public class UserasDemo {
public final static Logger loger = Logger.getLogger(UserasDemo.class);
	public static void main(String[] args) {

		Useras us = new Useras();
		us.setUserasName("Anitas22");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(us);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		loger.info("aaaaaaaaaa");
	}

}
