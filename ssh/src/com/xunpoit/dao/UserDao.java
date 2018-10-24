package com.xunpoit.dao;

import com.xunpoit.beans.User;

public interface UserDao {
    User selectUserById(int id);
    void insertUser(User user);
}
