package org.spring.iwantbooks.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.spring.iwantbooks.service.UserManager;
import org.spring.iwantbooks.domain.*;
import org.spring.iwantbooks.exception.HrException;
import org.spring.iwantbooks.action.base.UserBaseAction;
import static org.spring.iwantbooks.service.UserManager.*;


public class ToSeeMore
	extends UserBaseAction
{
	//封装请求参数
	private int bookId;
	private Book book;
	private String tip;

	
	public void setBookId(int bookId)
	{
	    this.bookId = bookId;
	
	}
	public int getBookId()
	{
		return this.bookId;
	}
	
	public void setBook(Book book)
	{
	    this.book = book;
	
	}
	public Book getBook()
	{
		return this.book;
	}

	//tip属性的setter和getter方法
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	//处理用户请求
	public String execute()
		throws Exception
	{
		//创建ActionContext实例
		
		setBook(mgr.findBook(bookId));
		System.out.println(book.getSelluser());
		return "success";
	}
}