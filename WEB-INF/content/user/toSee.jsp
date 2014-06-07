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
   <title>�鿴�鼮��ϸ</title>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>
��ǰ�û���<s:property value="#session.user_name"/>
<span>
<s:if test="tip!=null">
<div class="error">
	<s:property value="tip"/>
</div>
</s:if><span>

<div id="wrapper" align="center">
	�鿴�鼮��ϸ
	<hr>
	<p>����:<s:property value="book.name"/></p>
	<p>����:<s:property value="book.kind"/></p>
	<p>���:<s:property value="book.num"/></p>
	<p>�۸�:<s:property value="book.price"/></p>
	<p>����:<s:property value="book.selluser"/></p>
    <p>��ϸ������<s:property value="book.imgpath"/></p>
	
	<s:form action = "getSeller.action">
	   <input type = "hidden" name="selluser" value="<s:property value="book.selluser"/>"/>
	   <s:submit theme="simple" value="��ϵ����"/>
	</s:form>
</div>
</body>
</html>