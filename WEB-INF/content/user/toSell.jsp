<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>填写书籍相关的资料</title>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/images/js/slide.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/images/js/kickstart.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/css/kickstart.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/style.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/demo.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/animate-custom.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/login.css" media="all" />

	<link href = "${pageContext.request.contextPath}/images/iwantbooks/icon.png" type = "image/png" rel = "shortcut icon" />
	<link href = "${pageContext.request.contextPath}/images/iwantbooks/login.css" type = "text/css" rel = "stylesheet" />
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>
<table width="780" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
<table width="80%" border="0" align="center" bgcolor="#cccccc">
  <tr bgcolor="#e1e1e1" >
	<td colspan="4" ><div class="mytitle">当前用户：<s:property value="#session.user_name"/></div></td> 
  </tr>
  <tr bgcolor="#e1e1e1" >
	<td colspan="4" >请详细填写书籍相关资料，越详细越容易被人瞧上哦</td> 
  </tr>
	<s:form action="processSell" >
	<div class="login" class="animate form">
	<div class="youpasswd">
							  
   <p> <span>书名</span>
      <input id="username" name="book.name" required="required" type="text" placeholder="书名"/></p>
	 <p> <span>类别</span> <select name="book.kind">
	                           <option value="计算机">计算机</option>
							   <option value="数学">数学</option>
							   <option value="外语">外语</option>
							   <option value="医学">医学</option>
							   <option value="基础学科">基础学科</option>
							   <option value="传媒">传媒</option>
							   <option value="政治">政治</option>
							   <option value="其他">其他</option>
	                       </select></p>
   <p> <span>书号</span>
      <input id="username" name="book.num" required="required" type="text" placeholder="书号"/></p>
   <p> <span>价格</span>
      <input id="username" name="book.price" required="required" type="text" placeholder="价格"/></p>
    <p> <span>卖家</span>
      <input id="username" readOnly="true" value="<s:property value="#session.user_name"/>" name="book.selluser" required="required" type="text" placeholder="卖家"/></p>
	   <p> <span>图片</span>
      <input id="username" name="book.imgpath" required="required" type="text" placeholder="图片"/></p>
	   <p> <span>验证码</span> 
      <input id="username" name="vercode" required="required" type="text" placeholder="验证码"/></p>
	</div>
	
    验证码：<img name="d" src="authImg"></div>
	<s:submit value="提交啦" theme="simple"/><s:reset  theme="simple" value="清空"/>

</s:form>

</table>
</td>
</tr>
</table>

</body>
</html>