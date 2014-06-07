package org.spring.iwantbooks.service.impl;

import org.spring.iwantbooks.dao.*;
import org.spring.iwantbooks.domain.*;
import org.spring.iwantbooks.vo.*;
import org.spring.iwantbooks.exception.*;
import org.spring.iwantbooks.service.*;

import java.text.*;
import java.util.*;

public class MgrManagerImpl
	implements MgrManager
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
	
	
}
