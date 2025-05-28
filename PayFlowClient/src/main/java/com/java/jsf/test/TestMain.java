package com.java.jsf.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jsf.model.User;
import com.java.jsf.util.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Test for hibernate");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create a new User instance
            User user = new User();
            user.setId(1);          // assuming ID is int or Integer
            user.setName("John Doe");
            user.setEmail("john.doe@example.com");
            // set other fields if any

            // Save the user object
            session.save(user);

            tx.commit();
            System.out.println("User saved successfully!");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Close the SessionFactory (optional, usually at app shutdown)
        HibernateUtil.getSessionFactory().close();
    }
    }
		
	

