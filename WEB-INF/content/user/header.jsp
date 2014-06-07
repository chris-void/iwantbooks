<%@ page contentType="text/html; charset=gb2312"%>
<link href="${pageContext.request.contextPath}/images/css.css" rel="stylesheet" type="text/css">
<body topmargin="0">

  <div align="right">
	   <s:form action="logout.action">
	   <s:submit value="退出登陆" theme="simple"/>
	</s:form></div> 

  <div align="right"><s:form action="change.action">
	   <input type = "hidden" name="name" value="<s:property value="#session.user_name"/>"/>
	   <s:submit value="修改资料" theme="simple"/>
	</s:form></div> 
	
    <div align="right"><s:form action="changePass.action">
	   <input type = "hidden" name="name" value="<s:property value="#session.user_name"/>"/>
	   <s:submit value="修改密码" theme="simple"/>
	</s:form></div> 

<div>
<div align="left">
   <img src = "${pageContext.request.contextPath}/images/iwantbooks/title.png" width="220" height="160" id = "top"/>
</div>

</div>
 
</table>
