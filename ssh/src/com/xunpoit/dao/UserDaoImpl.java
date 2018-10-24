package com.xunpoit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.xunpoit.beans.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User selectUserById(int id) {
		
		return sessionFactory.openSession().get(User.class, id);
		//return sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public void insertUser(User user) {
		sessionFactory.openSession().save(user);

	}

}
