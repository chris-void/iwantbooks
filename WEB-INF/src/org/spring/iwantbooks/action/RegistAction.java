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

public class RegistAction
	extends UserBaseAction
{
	//定义一个常量作为员工登录成功的Result名
	private final String REGIST_FAILED = "input";
	//定义一个常量作为经理登录成功的Result名
	private final String REGIST_SUCCESS = "success";
	
	//封装请求参数
	private User user;
	//注册的验证码
	private String vercode;
	//处理登录后的提示信息
	private String tip;
	//manager属性的setter和getter方法
	public void setUser(User user)
	{
		this.user = user;
	}
	public User getUser()
	{
		return this.user;
	}

	//vercode属性的setter和getter方法
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
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
		//创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取HttpSession中的rand属性
		String ver2 = (String)ctx.getSession().get("rand");
		if (vercode.equalsIgnoreCase(ver2))//验证码
		{
			//调用业务逻辑方法来处理登录请求
			int result = mgr.validRegist(getUser());
			//注册成功
			if (result == REGIST)
			{
				ctx.getSession().put(WebConstant.USER 
					, user.getName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.USER_LEVEL);
				setTip("您已经成功注册");
                      mgr.addUser(user);
				return REGIST_SUCCESS;
			}
			//注册失败
			else if (result == USERNAME_FAIL)
			{
				setTip("用户名已被注册");
				return REGIST_FAILED;
			}
		}
		//验证码不匹配
		else
		{
			setTip("验证码不匹配,请重新输入");
			return REGIST_FAILED;
		}
		return REGIST_FAILED;
	}
}