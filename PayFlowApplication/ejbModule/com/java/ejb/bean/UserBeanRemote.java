package com.java.ejb.bean;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> edbac1718826240683042bcc2ae6f22827452463
import java.util.List;

import javax.ejb.Remote;

import com.java.ejb.model.User;

@Remote
public interface UserBeanRemote {
<<<<<<< HEAD

	List<User> showUser();
	
=======
    List<User> showUsers() throws ClassNotFoundException, SQLException, SQLException;
    User searchUser(int userId) throws ClassNotFoundException, SQLException;
    void addUser(User user) throws ClassNotFoundException, SQLException;
>>>>>>> edbac1718826240683042bcc2ae6f22827452463
}
