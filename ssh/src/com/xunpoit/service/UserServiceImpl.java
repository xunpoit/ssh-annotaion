package com.xunpoit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xunpoit.beans.User;
import com.xunpoit.dao.UserDao;

public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User queryUserById(int id) {
		return userDao.selectUserById(id);
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);

	}

}
