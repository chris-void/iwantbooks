package org.spring.iwantbooks.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.spring.iwantbooks.service.UserManager;

public class UserBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected UserManager mgr;
	//依赖注入业务逻辑组件所必须的setter方法
	public void setUserManager(UserManager mgr)
	{
		this.mgr = mgr;
	}
}