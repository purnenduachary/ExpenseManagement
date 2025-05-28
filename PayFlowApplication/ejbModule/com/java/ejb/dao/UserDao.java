package com.java.ejb.dao;
import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.User;

public interface UserDao {
	
    void addUser(User user) throws SQLException, ClassNotFoundException;
    
    User getUserById(int id) throws SQLException, ClassNotFoundException;
    
    User getUserByEmail(String email) throws SQLException;
    
    List<User> getAllUsers() throws SQLException, ClassNotFoundException;
    
//	int addUser(User user) throws ClassNotFoundException, SQLException;
//
//	User getUserById(int id) throws ClassNotFoundException, SQLException;


}
