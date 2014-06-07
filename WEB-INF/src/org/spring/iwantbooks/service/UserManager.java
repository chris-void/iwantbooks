package org.spring.iwantbooks.service;

import org.spring.iwantbooks.vo.*;
import org.spring.iwantbooks.domain.*;
import org.spring.iwantbooks.exception.*;

import java.util.*;


public interface UserManager
{
	//登录失败
	public static final int LOGIN_FAIL = 0;

	public static final int LOGIN_USER = 1;

       //管理员
	public static final int LOGIN_MGR = 2;

	public static final int USERNAME_FAIL=4;

    public static final int REGIST=5;    
	

	int validLogin(Manager user);

	int validRegist(User user);
	void addUser(User user)
		throws HrException;
		
	void addBook(Book book)
	    throws HrException;
	void deleteUser(int id)
        throws HrException;

    User findByName(String name);		
	
	void updateUser(User user);
	
	//根据卖家来搜索
	List<Book> MyBooks(String selluser);
	
	//根据书号来搜索
	List<Book> SearchBooks(String name, String kind, String num);
	
    void deleteById(int id);
		 
    Book findBook(int id);

}