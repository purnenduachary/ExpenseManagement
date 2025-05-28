package com.java.ejb.bean;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
@Remote(UserBeanRemote.class)
public class UserBean {
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

}
