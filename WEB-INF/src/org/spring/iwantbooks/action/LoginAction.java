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


public class LoginAction
	extends UserBaseAction
{
	private final String USER_RESULT = "user";

	private final String MGR_RESULT = "mgr";

	private Manager manager;
	//��¼����֤��
	private String vercode;
	//�����¼�����ʾ��Ϣ
	private String tip;
	//manager���Ե�setter��getter����
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	//vercode���Ե�setter��getter����
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
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
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�rand����
		String ver2 = (String)ctx.getSession().get("rand");
		if (vercode.equalsIgnoreCase(ver2))//��֤��
		{
			//����ҵ���߼������������¼����
			int result = mgr.validLogin(getManager());
			//��¼���Ϊ��ͨԱ��
			if (result == LOGIN_USER)
			{
				ctx.getSession().put(WebConstant.USER 
					, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.USER_LEVEL);
				setTip("���Ѿ��ɹ���¼ϵͳ");
				return USER_RESULT;
			}
			//��¼���Ϊ����
			else if (result == LOGIN_MGR)
			{
				ctx.getSession().put(WebConstant.USER 
					, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.MGR_LEVEL);
				setTip("���Ѿ��ɹ���¼ϵͳ");
				return MGR_RESULT;
			}
			//�û��������벻ƥ��
			else
			{
				setTip("�û���/���벻ƥ��");
				return ERROR;
			}
		}
		//��֤�벻ƥ��
		else
		{
			setTip("��֤�벻ƥ��,����������");
			return ERROR;
		}
	}
}