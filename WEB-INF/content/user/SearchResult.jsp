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
   <title>�鿴�Լ����鼮</title>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>

<s:if test="tip!=null">
<div class="error">
	<s:property value="tip"/>
</div>
</s:if>
��ǰ�û���<s:property value="#session.user_name"/>

<div align="center">
<s:iterator value="result" status="index">  
<hr>
    <s:if test="#index.odd == true"> 
		 <div  style="background-color:#dddddd" class="pt9">
	</s:if> 
	<s:else> 
		 <div class="pt9">
	</s:else>
	
	<span>����:</span><p><s:property value="name"/></p>
	<span>�鼮����</span><p><s:property value="kind"/></p>
	<span>���</span><p><s:property value="num"/></p>
	<span>�۸�</span><p><s:property value="price"/></p>
	<s:form action="tosee">
	   <input type = "hidden" name="bookId" value="<s:property value="id"/>"/>
	   <s:submit value="�鿴��ϸ" theme="simple"/>
	</s:form>
    </div>
</s:iterator>
</div>


</body>
</html>