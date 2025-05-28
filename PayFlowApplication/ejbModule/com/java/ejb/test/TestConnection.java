package com.java.ejb.test;

import java.sql.Connection;

import com.java.ejb.util.ConnectionHelper;

public class TestConnection {

    public static void main(String[] args) {
    	
    	
        try (Connection conn = ConnectionHelper.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Database connection established successfully!");
            } else {
                System.out.println("Failed to establish database connection.❌");
            }
        } catch (Exception e) {
<<<<<<< HEAD
            System.out.println("❌ Error while connecting to database: " + e.getMessage());
=======
            System.out.println("Error while connecting to database: " + e.getMessage());
>>>>>>> edbac1718826240683042bcc2ae6f22827452463
            e.printStackTrace();
        }
    }
}

