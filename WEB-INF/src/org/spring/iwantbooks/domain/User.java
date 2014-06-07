package org.spring.iwantbooks.domain;

import java.io.Serializable;
import java.util.*;

public class User
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//�û�����
	private String name;
	//�û�����
	private String pass;
	//�û�����
	private String mail;
	//�û��ֻ�
	private String phone;
	//�û�QQ
	private String qq;
	//id
	private Integer id;
	

	//�޲����Ĺ�����
	public User()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public User(String name , String pass)
	{
		this.name = name;
		this.pass = pass;
	}

	//name���Ե�setter��getter����
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
        
	//pass���Ե�setter��getter����
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

	//salary���Ե�setter��getter����
	
 
	//��дequals()������ֻҪname��pass��ͬ��Ա������Ϊ��ȡ�
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
	//����Ա����name��pass������hashCodeֵ
	public int hashCode()
	{
		return name.hashCode()
			+ pass.hashCode() * 17;
	}
}