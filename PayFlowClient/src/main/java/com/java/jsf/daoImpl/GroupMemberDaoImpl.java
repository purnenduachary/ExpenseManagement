package com.java.jsf.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.ejb.model.User;
import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.model.GroupMember;
import com.java.jsf.util.HibernateUtil;

public class GroupMemberDaoImpl implements GroupMemberDao{
	
	SessionFactory sessionFactory;
	
	Session session;
	

	@Override
	public List<GroupMember> showAllGroup() {
	

		
		sessionFactory=HibernateUtil.getSessionFactory();
		
		session=sessionFactory.openSession();
		
		Transaction trans=session.beginTransaction();
		
		Query query=session.createQuery("from GroupMember");
		
		List<GroupMember> groupMemberList=query.list();
		
		trans.commit();
		
		session.close();
		
		
		return groupMemberList;
	}

}
