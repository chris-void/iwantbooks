package org.spring.iwantbooks.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.spring.iwantbooks.service.UserManager;

public class UserBaseAction
	extends ActionSupport
{
	//������ҵ���߼����
	protected UserManager mgr;
	//����ע��ҵ���߼�����������setter����
	public void setUserManager(UserManager mgr)
	{
		this.mgr = mgr;
	}
}