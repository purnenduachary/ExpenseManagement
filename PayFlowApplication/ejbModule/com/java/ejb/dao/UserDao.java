package com.java.ejb.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.User;

public interface UserDao {
<<<<<<< HEAD
=======
//	
//    void addUser(User user) throws SQLException;
//    
//    User getUserById(int id) throws SQLException;
    
    User getUserByEmail(String email) throws SQLException;
    
//    List<User> getAllUsers() throws SQLException;
    
	int addUser(User user) throws ClassNotFoundException, SQLException;
>>>>>>> 5f4838e6086703672f7fa7d5b3e73232216252be

	void addUser(User user) throws SQLException, ClassNotFoundException;

	User getUserById(int id) throws SQLException, ClassNotFoundException;

	User getUserByEmail(String email) throws SQLException;

	List<User> getAllUsers() throws SQLException, ClassNotFoundException;

//	int addUser(User user) throws ClassNotFoundException, SQLException;
//
//	User getUserById(int id) throws ClassNotFoundException, SQLException;

<<<<<<< HEAD
}
=======
	List<User> getAllUsers() throws ClassNotFoundException, SQLException;
}
>>>>>>> 5f4838e6086703672f7fa7d5b3e73232216252be
