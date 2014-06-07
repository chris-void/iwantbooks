<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登陆aaaaaaaaaaaaaaaaaaaaa</title>

	<!--<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>-->
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
<body style="background-image:url('${pageContext.request.contextPath}/images/background.jpg')">
	<div id = "top" style="background-image: url('${pageContext.request.contextPath}/images/iwantbooks/logo.jpg')">
		<div>
			<h3 id = "top1">Delivery of Books, Transfer of love</h3>
			<div class ="col_6" id = "slide">
			<ul class ="slideshow">
			<li><img src = "${pageContext.request.contextPath}/images/logo.jpg" width="550" height="350"/></li>
			<li><img src = "${pageContext.request.contextPath}/images/iwantbooks/pic/demo1.jpg" width="550" height="350"/></li>
			<li><img src = "${pageContext.request.contextPath}/images/iwantbooks/pic/demo2.jpg" width="550" height="350"/></li>
			
			<li><img src = "${pageContext.request.contextPath}/images/iwantbooks/pic/demo3.jpg" width="550" height="350"/></li>
			<li><img src = "${pageContext.request.contextPath}/images/iwantbooks/pic/demo4.jpg" width="550" height="350"/></li>
			</ul>
			</div>
		</div>	
		<div>
			<img src = "${pageContext.request.contextPath}/images/iwantbooks/title.png" id = "top2"/>
			<div id ="field">
				<div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
					    
                        <div id="login" class="animate form">
						 <s:if test="tip!=null">
                         <div class="youpasswd">
	                       <p>
						   <label for="username" class="uname"> 
					      	 <span><s:property value="tip"/></span></label>    
                           </p>
                           </div>
                           </s:if>
                            <s:form  action="processLogin" autocomplete="on"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u"> Your username
									&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <span>A-Z, 0-9</span></label>
                                    <input id="username" name="manager.name" required="required" type="text" placeholder="username"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="manager.pass" required="required" type="password" placeholder="password" /> 
									<input id="password" name="vercode" required="required" placeholder="vercode"/>
									<label for="password" class="youpasswd" data-icon="p"> Vercode: </label><img name="d" src="authImg">
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </s:form>
                        </div>

                        <div id="register" class="animate form">
						 <s:if test="tip!=null">
                         <div class="youpasswd">
	                       <p>
						   <label for="username" class="uname"> 
					      	 <span><s:property value="tip"/></span></label>    
                           </p>
                           </div>
                           </s:if>
                            <form  action="processRegist" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username
									&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <span>A-Z, 0-9</span></label>
                                    <input id="usernamesignup" name="user.name" required="required" type="text" placeholder="username" />
                                </p>
                              
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="user.pass" required="required" type="password" placeholder="password"/>
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your Email
									&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <span>A-Z, 0-9</span></label>
                                    <input id="usernamesignup" name="user.mail" required="required" type="text" placeholder="mail" />
                                </p>
								
								  <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your Phone
									&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <span>A-Z, 0-9</span></label>
                                    <input id="usernamesignup" name="user.phone" required="required" type="text" placeholder="phone" />
                                </p>
								
								  <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your QQ
									&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <span>A-Z, 0-9</span></label>
                                    <input id="usernamesignup" name="user.qq" required="required" type="text" placeholder="qq" />
                                </p>
								
								<p> <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">vercode： </label>
								<input id="password" name="vercode" required="required" placeholder="验证码"/>
									<img name="d" src="authImg">
								</p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
								
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
                    </div>
                </div>  
			</div>
			<!--div style="display:none">
			<script src="http://s24.cnzz.com/stat.php?id=4273731&web_id=4273731" language="JavaScript"></script>
			<script src="http://s20.cnzz.com/stat.php?id=5240441&web_id=5240441" language="JavaScript"></script>
			</div-->
		</div>
	</div>
	<div id = "bottom">
	</div>
</body>
</html>