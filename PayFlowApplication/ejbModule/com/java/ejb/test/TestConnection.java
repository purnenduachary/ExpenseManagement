package com.java.ejb.test;

import java.sql.Connection;
import java.sql.SQLException;

<<<<<<< HEAD
import com.java.ejb.dao.GroupDao;
import com.java.ejb.daoimpl.GroupDaoImpl;
=======
import com.java.ejb.dao.UserDao;
import com.java.ejb.daoimpl.UserDaoImpl;
>>>>>>> 984bcc27eafc4cb03d1c6dc166083946130e82ea
import com.java.ejb.util.ConnectionHelper;

public class TestConnection {

    public static void main(String[] args)  {
    	
    	
        try (Connection conn = ConnectionHelper.getConnection()) {
        	
            if (conn != null && !conn.isClosed()) {
                System.out.println("Database connection established successfully!");
            } else {
                System.out.println("Failed to establish database connection.❌");
            }
        } catch (Exception e) {
            System.out.println("❌ Error while connecting to database: " + e.getMessage());
            System.out.println("Error while connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
        
<<<<<<< HEAD
        
        
        
        GroupDao gpdao=new GroupDaoImpl();
        
        try {
			gpdao.showAllGroup().forEach(System.out::println);
		} catch (SQLException e) {
=======
        UserDao userdao = new UserDaoImpl();
        
        try {
			userdao.getAllUsers().forEach(System.out::println);;
		} catch (ClassNotFoundException | SQLException e) {
>>>>>>> 984bcc27eafc4cb03d1c6dc166083946130e82ea
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
<<<<<<< HEAD
    
=======
        
>>>>>>> 984bcc27eafc4cb03d1c6dc166083946130e82ea
    }
}

