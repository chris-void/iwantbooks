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


public class DeleteBook
	extends UserBaseAction
{
	//��װ�������
	private int bookId;
	
	private String tip;

	
	public void setBookId(int bookId)
	{
	    this.bookId = bookId;
	
	}
	public int getBookId()
	{
		return this.bookId;
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
		System.out.println(bookId);
		setTip("ɾ���ɹ���");
		mgr.deleteById(bookId);
		return "success";
	}
}