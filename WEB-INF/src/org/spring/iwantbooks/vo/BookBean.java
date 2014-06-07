package org.spring.iwantbooks.vo;

import java.io.Serializable;

public class BookBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	//书籍名字
	private String name;
	//书号
	private String num;
        //类别
    private String kind;
        //序号
	private Integer id;
	
	private String selluser;
	
	//价格
	private String price;
	
	private String imgpath;

	//无参数的构造器
	public BookBean()
	{
	}
	//初始化全部属性的构造器
	public BookBean(String name , String num, String kind , String selluser ,String price ,String imgpath)
	{
		this.name = name;
		this.num = num;
		this.kind = kind;
		this.price = price;
		this.selluser = selluser;
		this.imgpath=imgpath;
	}

	//name属性的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//kind属性的setter和getter方法
	public void setKind(String kind)
	{
	    this.kind = kind;
	}
   
	public String getKind()
	{
	    return this.kind;
	}

	//卖家名字
	public void setSelluser(String selluser)
	{
		this.selluser=selluser;
	}
	public String getSelluser()
	{
		return this.selluser;
	}
	
	public void setNum(String num)
	{
	    this.num = num;
	}
	
	public String getNum()
	{
	    return this.num;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}
	public String getPrice()
	{
		return this.price;
	}
	
    public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
       
    public void setImgpath(String imgpath)
	{
		this.imgpath = imgpath;
	}
	public String getImgpath()
	{
		return this.imgpath;
	}	   

}