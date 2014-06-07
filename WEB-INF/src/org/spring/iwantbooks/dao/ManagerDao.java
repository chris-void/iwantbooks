package org.spring.iwantbooks.dao;

import java.util.*; 

import org.spring.iwantbooks.domain.*;


public interface ManagerDao
{
 
	Manager get(Integer id);

	String save(Manager manager);

	void update(Manager manager);

	void delete(Manager manager);

	void delete(Integer id);

	List<Manager> findAll();

	List<Manager> findByNameAndPass(Manager mgr);

	Manager findByName(String name);
}
