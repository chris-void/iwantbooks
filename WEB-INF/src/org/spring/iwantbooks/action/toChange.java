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


public class toChange
	extends UserBaseAction
{
	//封装请求参数
	private String name;
	private String phone;
	private String mail;
	private String qqhao;
	private String tip;
    private String vercode;
	
	public void setVercode(String vercode)
	{
	    this.vercode = vercode;
	}
	
	public String getVercode()
	{
        return this.vercode;
	}
	
	public void setPhone(String phone)
	{
	    this.phone= phone;
	}
	
	public String getPhone()
	{
	    return this.phone;
	}
	
	public void setMail(String mail)
	{
	    this.mail = mail;
	}
	
	public String getMail()
	{
	    return this.mail;
	}
	
	public void setQqhao(String qqhao)
	{
	    this.qqhao = qqhao;
	}
	
	public String getQqhao()
	{
	    return this.qqhao;
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
		ActionContext ctx = ActionContext.getContext();
		//获取HttpSession中的rand属性
		String ver2 = (String)ctx.getSession().get("rand");
		name=(String)ctx.getSession().get(WebConstant.USER);
		if(vercode.equalsIgnoreCase(ver2))
		{
		    User temp = mgr.findByName(name);
		    temp.setMail(mail);
		    temp.setQq(qqhao);
		    temp.setPhone(phone);
		    mgr.updateUser(temp);
		    setTip("修改资料成功!");
		    return "success";
		}
		else
		{
		    setTip("验证码错误!");
		    return "error";
		}
		//创建ActionContext实例
		
	}
}