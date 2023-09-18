package com.mzos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Sham");
		emp.setEmpSal(60000);
		System.out.println(emp);

		Address add = new Address("Satara", "Maharashtra", 411412);
		System.out.println(add);

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.save(emp);
		session.save(add);

		tr.commit();
		session.close();

	}

}
