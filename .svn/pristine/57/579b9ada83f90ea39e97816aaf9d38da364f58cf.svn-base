<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
	    <base href="<%=basePath%>">
	    <title>创建国家卫生城市，共建和谐家园</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<link rel="stylesheet" href="css/login.css" type="text/css"></link>
		<script type="text/javascript" src="js/login.js"></script>
	</head>
<body>
	<div class="x-login-panel">
		<div class="x-login-center">
			<div class="x-login-left">
				<div class="x-login-top">创建国家卫生城市，共建和谐家园</div>
				<img src="images/login-img02.png" class="x-login-left-img" />
				<div id="message" class="x-login-message"></div>
			</div>
			<div class="x-login-logform">
				<div class="x-login-form-title">用户登陆</div>
				<div class="x-login-form">
					<form action="system/login"  method="post" id="loginForm">
						<div class="x-list">
							<label class="x-label">用户名：</label>
							<input class="x-input" type="text" class="x-form-input" id="VUsername" name="VUsername" autofocus/>
						</div>
						<div class="x-list">
							<label class="x-label">密&nbsp;&nbsp;码：</label>
							<input class="x-input" type="password" class="x-form-input" id="VPassword" name="VPassword"/>
						</div>
						<div class="x-list">
							<label class="x-label">验证码：</label>
							<input class="x-input" type="text" style="width: 90px;" class="x-form-input" id="code" name="code" maxlength="4"/>
							<img align="top" id="imgCode" title="刷新验证码" alt="刷新验证码" class="x-form-imgCode" src="system/getCode" onclick="refreshImgCode()" />
						</div>
						<div class="x-list">
	                        <input type="checkbox" name="loginStuts" id="loginStuts" class="stuts-checkbox" />
	                        记住我的登录状态(30天)
	                        <a href="javascript:void(0)" style="margin-left: 50px;">忘记密码？</a>
                		</div>
                		<div class="x-login-errormessage" id="errorMessage">${message}</div>
                		<div class="x-login-form-btn">
                			<a href="javascript:void(0)" class="x-btn x-btn-left" id="btn_submit" onclick="doLogin()">登陆</a>
                			<a href="javascript:void(0)" class="x-btn x-btn-right" id="btn_reset" onclick="doReset()">重置</a>
                		</div>
					</form>
				</div><!--End login form -->
			</div><!--End login logform  -->
		</div><!--End login center  -->
	</div><!--End login panel  -->
	
	<div class="login-bottom">
	 	<div class="login-bottom-split"></div>
	 	<div class="login-bottom-info">
	 		<p>
	 			Copyright © 2013 zrhis.com Inc. All Rights Reserved <a href="http://www.zrhis.com">郑州新中软科技有限公司</a>  版权所有
	 			联合开发：河南省卫生厅
	 		</p>
	 		<p>
				<span class="login-bottom-model">售后服务QQ：279220869</span>
				<span class="login-bottom-model">QQ技术支持：7530755</span>
				<span class="login-bottom-model"></span>
			</p>
			<p>
				<span class="login-bottom-model">
					客服电话：<span class="phoneNumber">400-0606-855</span>
					<span class="phoneNumber" style="margin:0;">0371-55829859</span>
				</span>
				<span class="login-bottom-model">公司邮箱：mshis@126.com</span>
			</p>
			
	 	</div>
	</div>
</body>
</html>
<script type="text/javascript">
	var agent = navigator.userAgent.toLowerCase();
	var browser;
	var regStr_ie = /msie [\d.]+;/gi ;
	if(agent.indexOf("msie") > 0 ){
		browser = agent.match(regStr_ie) ;
		var verinfo = (browser+"").replace(/[^0-9.]/ig,""); 
		if(verinfo<9 ){
			var con = confirm('该浏览器不是最佳的；为获得更快的响应速度，更好的显示效果推荐安装谷歌浏览器，现在是否安装？');
			if(con){
				var url = 'jsCommen/cab/Chrome28.0.1500.72.exe';
				window.location.href=url;
			}
		}
	}else{
		var is360 = false;  
        if(isIE&&(window.navigator.userProfile+'')=='null'){  
            is360 = true;  
        } 
        if(is360){
			var con = confirm('该浏览器不是最佳的；为获得更快的响应速度，更好的显示效果推荐安装谷歌浏览器，现在是否安装？');
			if(con){
				var url = 'jsCommen/cab/Chrome28.0.1500.72.exe';
				window.location.href=url;
			}
		}
	}

	/*if ((navigator.userAgent.indexOf('Chrome') >= 0) || (navigator.userAgent.indexOf('Firefox') >= 0)){
 			var con = confirm('该浏览器不是最佳的；为获得更快的响应速度，更好的显示效果推荐安装最佳浏览器，现在是否安装？');
		if(con){
			var url = 'jsCommen/cab/Chrome28.0.1500.72.exe';
			window.location.href=url;
		}
 		}*/
</script>