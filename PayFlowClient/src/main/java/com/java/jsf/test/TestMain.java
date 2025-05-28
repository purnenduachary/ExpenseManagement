package com.java.jsf.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.ejb.model.User;
import com.java.jsf.util.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Test for hibernate");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@example.com");
        user.setCreatedAt(new Date(System.currentTimeMillis()));

        session.save(user);
        tx.commit();
        session.close();

        System.out.println("User saved successfully!");
    }
		
	
}
