package org.spring.iwantbooks.service.impl;

import org.spring.iwantbooks.dao.*;
import org.spring.iwantbooks.domain.*;
import org.spring.iwantbooks.vo.*;
import org.spring.iwantbooks.exception.*;
import org.spring.iwantbooks.service.*;

import java.text.*;
import java.util.*;

public class UserManagerImpl
	implements UserManager
{

	private UserDao userDao;
	private ManagerDao mgrDao;
    private BookDao bookDao;

	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	public void setMgrDao(ManagerDao mgrDao)
	{
		this.mgrDao = mgrDao;
	}

	public void setBookDao(BookDao bookDao)
	{
	    this.bookDao = bookDao;
	}

	public int validLogin(Manager mgr)
	{
		//如果找到一个管理员，以经理登录
		if (mgrDao.findByNameAndPass(mgr).size()
			>= 1)
		{
			return LOGIN_MGR;
		}
		//如果找到普通员工，以普通员工登录
		else if (userDao.findByNameAndPass(mgr)
			.size() >= 1)
		{
			return LOGIN_USER;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}
	
	public int validRegist(User user)
	{
	    if(userDao.findByName(user.getName())!=null)
		{
		    return USERNAME_FAIL;
		}
		
		else 
		{
		    return REGIST;
		}
	}

    public void addUser(User user)throws HrException
	{
		userDao.save(user);
	}
	
	public User findByName(String name)
    {
	    return userDao.findByName(name);
    }	
	
	public void updateUser(User user)
	{
	    userDao.update(user);
	}
	
	
	public void addBook(Book book)throws HrException
	{
	     bookDao.save(book);
	}

	public List<Book> MyBooks(String selluser)
	{
	    return bookDao.findBySelluser(selluser);
	}
	
	public List<Book> SearchBooks(String name, String kind, String num)
	{
	    List<Book> books = bookDao.SearchBooks(name,kind,num);
	    return books;
	}
	
	public void deleteById(int id)
	{
	    bookDao.delete(id);	
	}
	
	public void deleteUser(int id)throws HrException
	{
	    userDao.delete(id);
	}
	
	//根据id找到book
	public Book findBook(int id)
	{
	    return bookDao.get(id);
	}
	
}