package org.spring.iwantbooks.domain;

import java.io.Serializable;
import java.util.*;

public class Book
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//�鼮����
	private String name;
	//���
	private String num;
        //���
    private String kind;
        //���
	private int id;
	
	private String selluser;
	
	//�۸�
	private String price;
	
	private String imgpath;

	//�޲����Ĺ�����
	public Book()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Book(String name , String num, String kind , String selluser ,String price ,String imgpath)
	{
		this.name = name;
		this.num = num;
		this.kind = kind;
		this.price = price;
		this.selluser = selluser;
		this.imgpath=imgpath;
	}

	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//kind���Ե�setter��getter����
	public void setKind(String kind)
	{
	    this.kind = kind;
	}
   
	public String getKind()
	{
	    return this.kind;
	}

	//��������
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
	
    public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
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
 
	public boolean equals(Object obj)
	{
        if(this == obj)
        {
            return true;
        }
		
		if (obj != null &&
			obj.getClass() == Book.class)
		{
			Book book = (Book)obj;
			return this.getName().equals(book.getName())
				&& this.getSelluser().equals(book.getSelluser());
		}
		return true;
	}

	public int hashCode()
	{
		return 
		name.hashCode()
			+ num.hashCode() * 17;
	}
}