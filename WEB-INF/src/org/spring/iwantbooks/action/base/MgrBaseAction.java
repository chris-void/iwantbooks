package org.spring.iwantbooks.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.spring.iwantbooks.service.MgrManager;


public class MgrBaseAction extends ActionSupport
{
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}
}