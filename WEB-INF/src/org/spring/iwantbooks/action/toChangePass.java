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


public class toChangePass
	extends UserBaseAction
{

    private final String oldfalse = "old";
	private final String newfalse = "two";
    private final String change_ok = "success";	
	//��װ�������
	private String name;
    private String oldpass;
	private String newpass1;
	private String newpass2;
	private String tip;
	
	
	
	public void setName(String name)
	{
	    this.name = name;
	
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setOldpass(String oldpass)
	{
	    this.oldpass = oldpass;
	}
	
	public String getOldpass()
	{
	    return this.oldpass;
	}
	
	public void setNewpass1(String newpass1)
	{
	    this.newpass1 = newpass1;
	}
	
	public String getNewpass1()
	{
	  return this.newpass1;
	}
	
	public void setNewpass2(String newpass2)
	{
	    this.newpass2 = newpass2;
	}
	
	public String getNewpass2()
	{
	  return this.newpass2;
	}

	//tip���Ե�setter��getter����
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	//�����û�����
	public String execute()
		throws Exception
	{
	    ActionContext ctx = ActionContext.getContext();
		String n = (String)ctx.getSession().get(WebConstant.USER);
		System.out.println(n);
		
		System.out.println(oldpass);
	    User temp = mgr.findByName(n);
		System.out.println(temp.getPass());
		if(oldpass.equals(temp.getPass()))
		{
		    if(newpass1.equals(newpass2))
			{
			    temp.setPass(newpass1);
				mgr.updateUser(temp);
				setTip("�޸�����ɹ�!");
			}
			else
			{
			    setTip("���ε����������벻һ��!");
			    return newfalse;
			}
		}
	    else
		{
		    setTip("�������������");
			return oldfalse;
		}
		return "success";
	}
}