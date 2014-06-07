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


public class DeleteBook
	extends UserBaseAction
{
	//封装请求参数
	private int bookId;
	
	private String tip;

	
	public void setBookId(int bookId)
	{
	    this.bookId = bookId;
	
	}
	public int getBookId()
	{
		return this.bookId;
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
		System.out.println(bookId);
		setTip("删除成功！");
		mgr.deleteById(bookId);
		return "success";
	}
}