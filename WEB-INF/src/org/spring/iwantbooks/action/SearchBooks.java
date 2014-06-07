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

public class SearchBooks extends UserBaseAction
{
    private String name;
	private String kind;
	private String num;
	private String tip;
	private List<Book> result;
	
	public void setName(String name)
	{
	    this.name = name;
	}
	
	public String getName()
	{
	    return this.name;
	}
	
	public void setKind(String kind)
	{
	    this.kind = kind;
	}
	
	public String getKind()
	{
	    return this.kind;
	}
	
	public void setNum(String num)
	{
	    this.num = num;
	}
	
	public String getNum()
	{
	    return this.num;
	}
	
	public void setTip(String tip)
	{
	    this.tip = tip;
	}
	
	public String getTip()
	{
	    return this.tip;
	}
	
	public void setResult(List<Book> result)
	{
	    this.result=result;
	}
	
	public List<Book> getResult()
	{
	    return this.result;
	}
	
	public String execute()
	{
	    List<Book> temp =mgr.SearchBooks(name,kind, num);
		
		System.out.println(name);
		System.out.println(kind);
		System.out.println(num);
		setResult(temp);
		//System.out.println(result.size());
	    return "success";
	}

}
