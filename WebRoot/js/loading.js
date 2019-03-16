/*function File(conf,url){
	if(typeof url == undefined){
		this.info = conf.info;
		this.url = conf.url;
	}else{
		this.info = conf;
		this.url = url;
	}
	return this;
}*/

document.getElementById('loadmsg').style.display = 'none';
/**
 curl "jsFrame/extjs-4.2.1/ext-all.js"
 curl "jsFrame/extjs-4.2.1/resources/css/ext-all-neptune.css" 
 curl "jsFrame/extjs-4.2.1/packages/ext-theme-neptune/build/ext-theme-neptune.js"
 curl "jsFrame/extjs-4.2.1/resources/ext-theme-neptune/ext-theme-neptune-all.css"
 */
var CSSList = [
	{info:'系统主题',url:'jsFrame/extjs-4.2.1/resources/ext-theme-classic/ext-theme-classic-all.css',time:1000},
	{info:'系统样式',url:'css/app.css',time:100}
]
var JSList = [
	{info:'主要文件',url:'jsFrame/extjs-4.2.1/ext-all.js'},
	{info:'简体中文支持',url:'jsFrame/extjs-4.2.1/packages/ext-locale/build/ext-locale-zh_CN.js'},
	{info:'主程序',url:'js/app.js'}
]



var total = CSSList.length + JSList.length;
var xpr = document.getElementById('progressBody');
loadCSS(0,function(){
	loadJS(0,function(){
		
		//onLoadSuccess();
	})
})


function loadCSS(index,callback){
	var sid = "css"+(index+1);
	if(index < CSSList.length){
		var file = CSSList[index];
		var msg = document.getElementById('xLoadInfo');
		msg.innerHTML = '正在加载'+file.info+'......';
		var fn = fn;
		setTimeout(function(){
			AjaxPage(sid,file.url,'CSS',function(){
				index ++;
				loadCSS(index,callback);
				
				xpr.style.width = (index/total)*350+'px';
			});
		},file.time)
	}else{
		if(typeof callback == 'function')callback();
	}
}

function loadJS(index,callback){
	var sid = "Extjs-"+(index+1);
	if(index < JSList.length){
		var file = JSList[index];
		var msg = document.getElementById('xLoadInfo');
		msg.innerHTML = '正在加载'+file.info+'......';
		AjaxPage(sid,file.url,'JS',function(){
			index ++;
			loadJS(index,callback);
			xpr.style.width = ((index+JSList.length)/total)*350+'px';
		});
	}else{
		if(typeof callback == 'function')callback();
	}
}

function onLoadSuccess(){
	var msg = document.getElementById('xLoadInfo');
	msg.innerHTML = '正在创建系统组件......';
	Ext.Msg.alert('提示','加载完成');
}

function GetHttpRequest(){ 
	if (typeof XMLHttpRequest != 'undefined') {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    return xhr;
} 

function AjaxPage(sId, url, type,callback){
	if(type == 'CSS'){
		IncludeCSS(sId,url);
		if(typeof callback == 'function'){
        	callback();
        }
		return;
	}
	var xhr,status,onScriptError;
	xhr = GetHttpRequest();
	xhr.onreadystatechange = function(){
		if ( xhr.readyState == 4 ){ 
            if ( xhr.status == 200 || xhr.status == 304 ){
            	if(type == 'JS'){
					IncludeJS(sId, url, xhr.responseText);
            	}else if(type == 'CSS'){
            		IncludeCSS(sId, url, xhr.responseText);
            	}
            }else{ 
                alert( 'XML request error: ' + xhr.statusText + ' (' + xhr.status + ')' ) ; 
            } 
            if(typeof callback == 'function'){
            	callback();
            }
        } 
	}
	xhr.open('GET', url, true);
    xhr.send(null);
} 

function IncludeJS(sId, fileUrl, source){
    if ( ( source != null ) && ( !document.getElementById( sId ) ) ){ 
        var oHead = document.getElementsByTagName('HEAD').item(0); 
        var oScript = document.createElement( "script" ); 
        oScript.language = "javascript";
        oScript.type = "text/javascript";
        oScript.id = sId;
        oScript.defer = true;
        oScript.text = source;
        oHead.appendChild( oScript ); 
    } 
}

function IncludeCSS(sId, fileUrl, source){
	var oHead = document.getElementsByTagName('HEAD').item(0); 
    var link = document.createElement( "link" ); 
    link.type = "text/css";
    link.rel = "stylesheet";
	link.href = fileUrl;
    oHead.appendChild( link ); 
}
