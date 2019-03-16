document.getElementById('loadmsg').style.display = 'none';
var CSSList = [
	{info:'图标样式',url:'css/icon.css'+'?_dc='+Math.random(),time:100},
	{info:'系统主题',url:'jsFrame/extjs-4.2.1/resources/ext-theme-classic/ext-theme-classic-all.css',time:1000},
	{info:'附加样式',url:'jsFrame/extjs-4.2.1/examples/shared/example.css',time:100},
	//{info:'系统主题',url:'jsFrame/extjs-4.2.1/resources/ext-theme-neptune/ext-theme-neptune-all.css',time:1000},
	{info:'系统样式',url:'css/app.css'+'?_dc='+Math.random(),time:100}
]
var JSList = [
	{info:'Ext类库',url:'jsFrame/extjs-4.2.1/ext-all.js'},
	//{info:'Ext类库',url:'jsFrame/ext-all-4.1.1.js'},
	//{info:'主要文件',url:'js/all-classes.js'},
	{info:'简体中文支持',url:'jsFrame/extjs-4.2.1/packages/ext-locale/build/ext-locale-zh_CN.js'},
	{info:'jQuery类库',url:'jsFrame/jquery-1.7.1.min.js'},
	{info:'工具类',url:'jsCommen/util.js'+'?_dc='+Math.random()},
	{info:'初始化文件',url:'js/override.js'+'?_dc='+Math.random()},
	{info:'jQuery类库',url:'jsFrame/jquery-1.7.1.min.js'},
	{info:'图标工具类库',url:'js/Highcharts/highcharts.src.js'},
	{info:'图标工具打印类库',url:'js/Highcharts/modules/exporting.src.js'},
	{info:'主程序',url:'js/app.js'+'?_dc='+Math.random()}
]

loadCSS(0,function(){loadJS(0)});
function loadCSS(a,b){var c="css"+(a+1);if(CSSList.length>a){var d=CSSList[a],e=document.getElementById("xLoadInfo");e.innerHTML="\u6b63\u5728\u52a0\u8f7d"+d.info+"......";var f=f;setTimeout(function(){AjaxPage(c,d.url,"CSS",function(){a++,loadCSS(a,b),xpr.style.width=350*(a/total)+"px"})},d.time)}else"function"==typeof b&&b()}function loadJS(a,b){var c="Extjs-"+(a+1);if(JSList.length>a){var d=JSList[a],e=document.getElementById("xLoadInfo");e.innerHTML="\u6b63\u5728\u52a0\u8f7d"+d.info+"......",AjaxPage(c,d.url,"JS",function(){a++,loadJS(a,b),xpr.style.width=350*((a+JSList.length)/total)+"px"})}else"function"==typeof b&&b()}function onLoadSuccess(){var a=document.getElementById("xLoadInfo");a.innerHTML="\u6b63\u5728\u521b\u5efa\u7cfb\u7edf\u7ec4\u4ef6......",Ext.Msg.alert("\u63d0\u793a","\u52a0\u8f7d\u5b8c\u6210")}function GetHttpRequest(){return xhr="undefined"!=typeof XMLHttpRequest?new XMLHttpRequest:new ActiveXObject("Microsoft.XMLHTTP")}function AjaxPage(a,b,c,d){if("CSS"==c)return IncludeCSS(a,b),"function"==typeof d&&d(),void 0;var e;e=GetHttpRequest(),e.onreadystatechange=function(){4==e.readyState&&(200==e.status||304==e.status?"JS"==c?IncludeJS(a,b,e.responseText):"CSS"==c&&IncludeCSS(a,b,e.responseText):alert("XML request error: "+e.statusText+" ("+e.status+")"),"function"==typeof d&&d())},e.open("GET",b,!0),e.send(null)}function IncludeJS(a,b,c){if(null!=c&&!document.getElementById(a)){var d=document.getElementsByTagName("HEAD").item(0),e=document.createElement("script");e.language="javascript",e.type="text/javascript",e.id=a,e.defer=!0,e.text=c,d.appendChild(e)}}function IncludeCSS(a,b){var d=document.getElementsByTagName("HEAD").item(0),e=document.createElement("link");e.type="text/css",e.rel="stylesheet",e.href=b,d.appendChild(e)}var total=CSSList.length+JSList.length,xpr=document.getElementById("progressBody");
