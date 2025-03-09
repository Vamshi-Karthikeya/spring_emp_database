package com.vamshi.springboot.demosecurity.dao;

import com.vamshi.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
