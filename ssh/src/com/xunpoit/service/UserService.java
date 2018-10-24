package com.xunpoit.service;

import com.xunpoit.beans.User;

public interface UserService {
    User queryUserById(int id);
    void addUser(User user);
}
