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

public class SellAction extends UserBaseAction
{
     //封装请求参数
         private Book book;
	 //
	 private final String ADD_SUCCESS = "book_success";
	 
	// private final String ADD_FAILED = "book_failed";
	 
	 private String tip;
	 
	 public SellAction()
	 {
	 }
	 
	 public SellAction(Book book,String tip)
	 {
	     this.book = book;
		 this.tip = tip;
	 }
	 
	 public void setBook(Book book)
	 {
	     this.book = book;
	 }
	 
	 public Book getBook()
	 {
	     return this.book;
	 }
	 
	 public void setTip(String tip)
	 {
	     this.tip=tip;
	 }
	 
	 public String getTip()
	 {
	     return this.tip;
	 }
	 
	 public String execute()
	       throws Exception
	{
	    System.out.println(book.getKind());
	    mgr.addBook(book);
	    setTip("您已成功将书籍上架！");
	    return ADD_SUCCESS;
	}
	 

}
