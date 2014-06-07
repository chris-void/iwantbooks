package org.spring.iwantbooks.domain;

import java.io.Serializable;
import java.util.*;

public class User
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//用户姓名
	private String name;
	//用户密码
	private String pass;
	//用户邮箱
	private String mail;
	//用户手机
	private String phone;
	//用户QQ
	private String qq;
	//id
	private Integer id;
	

	//无参数的构造器
	public User()
	{
	}
	//初始化全部属性的构造器
	public User(String name , String pass)
	{
		this.name = name;
		this.pass = pass;
	}

	//name属性的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

    public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
        
	//pass属性的setter和getter方法
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}
	
	 public void setMail(String mail)
	{
		this.mail = mail;
	}
	public String getMail()
	{
		return this.mail;
	}
	
	 public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	
	 public void setQq(String qq)
	{
		this.qq = qq;
	}
	public String getQq()
	{
		return this.qq;
	}

	//salary属性的setter和getter方法
	
 
	//重写equals()方法，只要name、pass相同的员工即认为相等。
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null &&
			obj.getClass() == User.class)
		{
			User user = (User)obj;
			return this.getName().equals(user.getName())
				&& this.getPass().equals(user.getPass());
		}
		return false;
	}
	//根据员工的name、pass来计算hashCode值
	public int hashCode()
	{
		return name.hashCode()
			+ pass.hashCode() * 17;
	}
}