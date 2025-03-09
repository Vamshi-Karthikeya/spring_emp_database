package com.vamshi.springboot.demosecurity.service;

import com.vamshi.springboot.demosecurity.entity.User;
import com.vamshi.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
