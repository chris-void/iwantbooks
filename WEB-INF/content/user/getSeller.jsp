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
   <title>�鿴�û���Ϣ</title>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>
<p>��ǰ�û���<s:property value="#session.user_name"/></p>
<span>
<s:if test="tip!=null">
<div class="error">
	<s:property value="tip"/>
</div>
</s:if><span>

<div id="wrapper" align="center">
	�鿴�û���Ϣ
	<hr>
	<p>�û�:<s:property value="user.name"/></p>
	<p>Mail:<s:property value="user.mail"/></p>
	<p>QQ:<s:property value="user.qq"/></p>
	<p>Phone:<s:property value="user.phone"/></p>
</div>
</body>
</html>