package com.vamshi.springboot.demosecurity.dao;

import com.vamshi.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
