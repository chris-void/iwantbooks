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


public class appChangePass
	extends UserBaseAction
{
	//封装请求参数
	private String name;
	private String tip;
    private User old;
	
	public void setOld(User old)
	{
	    this.old=old;
	}
	
	public User getOld()
	{
	    return this.old;
	}
	
	public void setName(String name)
	{
	    this.name = name;
	
	}
	public String getName()
	{
		return this.name;
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
		User temp = mgr.findByName(name);
		setOld(temp);
		return "success";
	}
}