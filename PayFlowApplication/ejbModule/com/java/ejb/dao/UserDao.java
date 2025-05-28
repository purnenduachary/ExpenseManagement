package com.java.ejb.dao;

<<<<<<< HEAD
public class UserDao {

}
=======
import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.User;

public interface UserDao {
    void addUser(User user) throws SQLException;
    User getUserById(int id) throws SQLException;
    User getUserByEmail(String email) throws SQLException;
    List<User> getAllUsers() throws SQLException;
}
>>>>>>> edbac1718826240683042bcc2ae6f22827452463
