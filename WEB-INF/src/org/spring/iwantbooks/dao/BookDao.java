package org.spring.iwantbooks.dao;

import java.util.*; 

import org.spring.iwantbooks.domain.*;

public interface BookDao
{

	Book get(int id);

	int save(Book book);

	void update(Book book);


	void delete(Book book);

	
	void delete(int id);

	
	List<Book> findAll();

	
	List<Book> findByNameAndNum(String name, String num);

	List<Book> findBySelluser(String selluser);
	
	List<Book> SearchBooks(String name, String kind, String num);

}
