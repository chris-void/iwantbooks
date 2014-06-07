package org.spring.iwantbooks.dao.impl;

import java.util.*; 
import javax.servlet.*;
import org.spring.iwantbooks.domain.*;
import org.crazyit.common.hibernate3.support.*;
import org.spring.iwantbooks.dao.*;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.HibernateException;
import java.sql.SQLException;
import java.util.List;

public class BookDaoHibernate
	extends HibernateDaoSupport
	implements BookDao
{
	public Book get(int id)
	{
		return (Book)getHibernateTemplate()
			.get(Book.class,id);
	}


	public int save(Book book)
	{
		return (int)getHibernateTemplate()
			.save(book);
	}

	
	public void update(Book book)
	{
		getHibernateTemplate()
			.update(book);
	}

	
	public void delete(Book book)
	{
		getHibernateTemplate()
			.delete(book);
	}

	
	public void delete(int id)
	{
        
		 //getHibernateTemplate().deleteAll(b);
        Book t= (Book)this.getHibernateTemplate().get(Book.class,id);
        getHibernateTemplate().delete(get(id));
        // getHibernateTemplate().deleteAll(books);
        
	}

	public List<Book> findAll()
	{
		return (List<Book>)getHibernateTemplate()
			.find("from Book");
	}

	public List<Book> findBySelluser(String selluser)
	{
	    return (List<Book>)getHibernateTemplate()
		    .find("from Book where selluser = ? ", selluser);
	}
	
	public List<Book> findByNameAndNum(String name, String num)
	{
		return (List<Book>)getHibernateTemplate()
			.find("from Book b where b.name = ? and b.num=?"
			, name , num); 
	}

	
	public List<Book> SearchBooks(String name, String kind, String num)
	{
	    List<Book> books = (List<Book>)
		                   getHibernateTemplate().
							find ("from Book b where b.name like ? and b.kind like ? and b.num like ?",
							"%"+name+"%","%"+kind+"%","%"+num+"%");
				
		//List<Book> books = (List<Book>)getHibernateTemplate().find("from Book where kind = ?",kind );
		
	    if(books!= null && books.size() >=1)
		{
		    return books;
		}
		
		return null;
	}


}
