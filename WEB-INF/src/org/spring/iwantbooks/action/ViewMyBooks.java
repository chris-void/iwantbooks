package org.spring.iwantbooks.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.spring.iwantbooks.service.UserManager;
import org.spring.iwantbooks.exception.HrException;
import org.spring.iwantbooks.action.base.UserBaseAction;
import org.spring.iwantbooks.vo.*;
import org.spring.iwantbooks.domain.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class ViewMyBooks extends UserBaseAction
{
	private List<Book> books;
	//unAttend���Ե�setter��getter����
	public void setBooks(List<Book> books)
	{
		this.books = books;
	}
	public List<Book> getBooks()
	{
		return this.books;
	}
	public String execute()
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�user����
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		System.out.println(user);
		List<Book> result = mgr.MyBooks(user);
		
		setBooks(result);
		
		return SUCCESS;
	}
}