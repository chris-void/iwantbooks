<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>��д�鼮��ص�����</title>
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
	<td colspan="4" ><div class="mytitle">��ǰ�û���<s:property value="#session.user_name"/></div></td> 
  </tr>
  <tr bgcolor="#e1e1e1" >
	<td colspan="4" >����ϸ��д�鼮������ϣ�Խ��ϸԽ���ױ�������Ŷ</td> 
  </tr>
	<s:form action="processSell" >
	<div class="login" class="animate form">
	<div class="youpasswd">
							  
   <p> <span>����</span>
      <input id="username" name="book.name" required="required" type="text" placeholder="����"/></p>
	 <p> <span>���</span> <select name="book.kind">
	                           <option value="�����">�����</option>
							   <option value="��ѧ">��ѧ</option>
							   <option value="����">����</option>
							   <option value="ҽѧ">ҽѧ</option>
							   <option value="����ѧ��">����ѧ��</option>
							   <option value="��ý">��ý</option>
							   <option value="����">����</option>
							   <option value="����">����</option>
	                       </select></p>
   <p> <span>���</span>
      <input id="username" name="book.num" required="required" type="text" placeholder="���"/></p>
   <p> <span>�۸�</span>
      <input id="username" name="book.price" required="required" type="text" placeholder="�۸�"/></p>
    <p> <span>����</span>
      <input id="username" readOnly="true" value="<s:property value="#session.user_name"/>" name="book.selluser" required="required" type="text" placeholder="����"/></p>
	   <p> <span>ͼƬ</span>
      <input id="username" name="book.imgpath" required="required" type="text" placeholder="ͼƬ"/></p>
	   <p> <span>��֤��</span> 
      <input id="username" name="vercode" required="required" type="text" placeholder="��֤��"/></p>
	</div>
	
    ��֤�룺<img name="d" src="authImg"></div>
	<s:submit value="�ύ��" theme="simple"/><s:reset  theme="simple" value="���"/>

</s:form>

</table>
</td>
</tr>
</table>

</body>
</html>