package org.spring.iwantbooks.dao.impl;

import java.util.*; 

import org.spring.iwantbooks.domain.*;
import org.crazyit.common.hibernate3.support.*;
import org.spring.iwantbooks.dao.*;


public class UserDaoHibernate
	extends YeekuHibernateDaoSupport
	implements UserDao
{

	public User get(Integer id)
	{
		return getHibernateTemplate()
			.get(User.class , id);
	}

	public Integer save(User user)
	{
		return (Integer)getHibernateTemplate()
			.save(user);
	}

	public void update(User user)
	{
		getHibernateTemplate()
			.update(user);
	}
	
	public void delete(User user)
	{
		getHibernateTemplate()
			.delete(user);
	}

	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	public List<User> findAll()
	{
		return (List<User>)getHibernateTemplate()
			.find("from User");
	}

	public List<User> findByNameAndPass(User user)
	{
		return (List<User>)getHibernateTemplate()
			.find("from User p where p.name = ? and p.pass=?"
			, user.getName() , user.getPass()); 
	}

	public User findByName(String name)
	{
		List<User> users = (List<User>)getHibernateTemplate()
			.find("from User where name = ? " , name);
		if (users!= null && users.size() >= 1)
		{
			return users.get(0);
		}
		return null;
	}


}
