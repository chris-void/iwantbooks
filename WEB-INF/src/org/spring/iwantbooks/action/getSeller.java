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


public class getSeller
	extends UserBaseAction
{
	//��װ�������
	private String selluser;
	private String tip;
    private User user;
	
	public void setUser(User user)
	{
	    this.user=user;
	}
	
	public User getUser()
	{
	    return this.user;
	}
	
	public void setSelluser(String selluser)
	{
	    this.selluser = selluser;
	
	}
	public String getSelluser()
	{
		return this.selluser;
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
	    setTip("��������ˣ�������ϵ����Ŷ��");
		//����ActionContextʵ��
		setUser(mgr.findByName(selluser));
		return "success";
	}
}