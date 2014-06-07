package org.spring.iwantbooks.dao;

import java.util.*; 

import org.spring.iwantbooks.domain.*;


public interface UserDao
{

	User get(Integer id);

	Integer save(User user);

	void update(User user);

	void delete(User user);

	void delete(Integer id);

	List<User> findAll();

	List<User> findByNameAndPass(User user);

	User findByName(String name);

	
}
