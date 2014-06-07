<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<script type="text/javascript" src="${pageContext.request.contextPath}/images/js/slide.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/images/js/kickstart.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/css/kickstart.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/style.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/demo.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/animate-custom.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/iwantbooks/login.css" media="all" />

	<link href = "${pageContext.request.contextPath}/images/iwantbooks/icon.png" type = "image/png" rel = "shortcut icon" />
	<link href = "${pageContext.request.contextPath}/images/iwantbooks/login.css" type = "text/css" rel = "stylesheet" />
   <title>查看书籍详细</title>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>
当前用户：<s:property value="#session.user_name"/>
<span>
<s:if test="tip!=null">
<div class="error">
	<s:property value="tip"/>
</div>
</s:if><span>

<div id="wrapper" align="center">
	查看书籍详细
	<hr>
	<p>书名:<s:property value="book.name"/></p>
	<p>类型:<s:property value="book.kind"/></p>
	<p>书号:<s:property value="book.num"/></p>
	<p>价格:<s:property value="book.price"/></p>
	<p>卖家:<s:property value="book.selluser"/></p>
    <p>详细描述：<s:property value="book.imgpath"/></p>
	
	<s:form action = "getSeller.action">
	   <input type = "hidden" name="selluser" value="<s:property value="book.selluser"/>"/>
	   <s:submit theme="simple" value="联系卖家"/>
	</s:form>
</div>
</body>
</html>