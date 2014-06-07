package org.spring.iwantbooks.vo;

import java.io.Serializable;

public class UserBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String userName;
	private String userPass;
	private double amount;

 	//无参数的构造器
	public UserBean()
	{
	}
	//初始化全部属性的构造器
	public UserBean(String userName , String userPass
		, double amount)
	{
		this.userName = userName;
		this.userPass = userPass;
		this.amount = amount;
	}

	//userName属性的setter和getter方法
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return this.userName;
	}

	//userPass属性的setter和getter方法
	public void setUserPass(String userPass)
	{
		this.userPass = userPass;
	}
	public String getUserPass()
	{
		return this.userPass;
	}

	//amount属性的setter和getter方法
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
}