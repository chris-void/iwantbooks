<%@ page contentType="text/html; charset=gb2312" language="java"%>
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
   <title>�޸ĸ�������</title>
  
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="userheader.jsp"%>

<tr>
<td>
<table width="80" border="0" align="center" bgcolor="#cccccc">
  <tr bgcolor="#e1e1e1" >
	<td colspan="4" ><div class="mytitle">��ǰ�û���<s:property value="#session.user_name"/></div></td> 
  </tr>
  </table>
</td>
</tr>

  <div id="wrapper">
  <s:if test="tip!=null">
<div class="error">
	<s:property value="tip"/>
</div>
</s:if>
  <div class="login" class="animate form">
	<s:form action="changing" >
	<p>�û�����<input id="username" readOnly="true" name="name" required="required" value="<s:property value="old.name"/>" type="text" placeholder="username"/></p>
	<p>Mail��   <input id="username" name="mail" required="required" value="<s:property value="old.mail"/>" type="text" placeholder="username"/></p>
	<p>Phone��<input id="username" name="phone" required="required" value="<s:property value="old.phone"/>" type="text" placeholder="username"/></p>
	<p>QQ��<input id="username" name="qqhao" required="required" value="<s:property value="old.qq"/>" type="text" placeholder="username"/></p>
	<p>��֤�룺<input id="username" name="vercode" required="required"  type="text" placeholder="vercode"/>
	
	
    ��֤�룺<img name="d" src="authImg">
	<s:submit value="�ύ��" theme="simple"/><s:reset  theme="simple" value="���"/>

</s:form></div>
</div>


</body>
</html>