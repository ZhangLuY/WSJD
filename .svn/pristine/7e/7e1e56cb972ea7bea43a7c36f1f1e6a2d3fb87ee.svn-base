function doLogin(){
	var msg1 = document.getElementById('errorMessage');
	var b = checkForm();
	if(!b)return;
	msg1.innerHTML = '';
	setInterval(changeLoginFlag,400)
	var form = document.getElementById('loginForm');
	form.submit();
}
var Flag = '';
function changeLoginFlag(){
	var msg2 = document.getElementById('message');
	if(Flag.length==6){
		Flag = ''
	}else{
		Flag += '.'; 
	}
	var str = '正在登录，请稍等'+Flag;
	msg2.innerHTML = str;
}

function checkForm(){
	var username = document.getElementById("VUsername");
	var password = document.getElementById("VPassword");
	var code = document.getElementById("code");
	var msg = document.getElementById('errorMessage');
	if(username.value == ''){
		msg.innerHTML = '用户名不能为空！';
		username.focus();
		return false;
	}
	if(password.value == ''){
		msg.innerHTML = '密码不能为空！';
		password.focus();
		return false;
	}
	if(code.value == ''){
		msg.innerHTML = '验证码不能为空！';
		code.focus();
		return false;
	}
	var c = document.getElementById('loginStuts');
	if(c.checked){
		saveToCookie();
	}
	return true;
}

//刷新验证码
function refreshImgCode() {
	var now = new Date();
	document.getElementById("imgCode").src = "system/getCode?id=" + now;
}

//重置表单
function doReset() {
	document.forms["loginForm"].reset();
	refreshImgCode();
	document.getElementById("VUsername").focus();
}

//cookie相关
function getLoginInfo(){
	var username = document.getElementById('VUsername');
	var password = document.getElementById('VPassword');
	var username_val = getCookie('username');
	var password_val = getCookie('password');
	if(isDefine(username_val)&&isDefine(password_val)){
		username.value = username_val;
		password.value = password_val;
		document.getElementById('code').focus();
	}
	
}

function saveToCookie(){
	var username = document.getElementById('VUsername');
	var password = document.getElementById('VPassword');
	var username_val = username.value;
	var password_val = password.value;
	addCookie("username",username_val,30,'','');
	addCookie("password",password_val,30,'','');
}

//添加cookie
function addCookie(name,value,expires,path,domain){
	var str=name+"="+escape(value);
	if(expires!=""){
		var date=new Date();
		date.setTime(date.getTime()+expires*24*3600*1000);//expires单位为天
		str+=";expires="+date.toGMTString();
	}
	if(path!=""){
		str+=";path="+path;//指定可访问cookie的目录
	}
	if(domain!=""){
		str+=";domain="+domain;//指定可访问cookie的域
	}
	document.cookie=str;
}
//取得cookie
function getCookie(name){
	var str=document.cookie.split(";")
	for(var i=0;i<str.length;i++){
		var str2=str[i].split("=");
		var namein = str2[0].trim();
		if(namein==name)return unescape(str2[1]);
	}
}
function isDefine(val){
	if(typeof val =='undefined'){
		return false;
	}else{
		return true;
	}
}

//去掉空格
String.prototype.trim = function() {      
    return this.replace(/^\s+/g,"").replace(/\s+$/g,"");      
}

window.onload = function() {
	document.getElementById("VUsername").focus();
	getLoginInfo();
	document.onkeyup = function(event) {
		var myEvent = event || window.event;
		var keyCode = myEvent.keyCode;
		if (keyCode == 13) {//如果按下的是回车键
			doLogin();
		}
	}
}