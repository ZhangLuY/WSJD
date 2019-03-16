Ext.Loader.setConfig({
	enabled:true,
	paths: {
		'WS':'js/app',
		'Ext.ux.desktop':'jsFrame/extjs-4.2.1/examples/desktop/js',
		'Ext.ux':'jsFrame/extjs-4.2.1/examples/ux'
	}
});


Ext.require('WS.util.Format');
Ext.require('WS.ux.MessageManager');

Ext.onReady(function(){
	
	Ext.QuickTips.init();
	
	
	Ext.create('WS.Application');
	
	Ext.get('loadingWindow').remove();
	
	//test();
});

function test(){
	var store = Ext.create('Ext.data.Store',{
		fields:[],
		proxy:{
			type:'ajax',
			url:'test/dynamic',
			extraParams:{
				className:'user'
			},
			reader:{
				type:'json',
	            successProperty:'success',
	            totalProperty:'totalCount',
	            root:'roots'
			}
		},
		autoLoad:true
	});
	
	Ext.define('MyGrid',{
		extend:'Ext.grid.Panel',
		height:400,
		width:800,
		
		title:'测试表格',
		//store:store,
		
		initComponent:function(){
			this.columns = this.getUserColumns();
			
			this.callParent();
		},
		
		renderTo:Ext.getBody(),
		
		getUserColumns:function(){
			return [
				{text:'机构ID',dataIndex:'depId',width:100},
				{text:'机构名称',dataIndex:'depName',width:100},
				{text:'名称',dataIndex:'VMc',width:100},
				{text:'操作员名称',dataIndex:'CCzymc',width:100},
				{text:'用户名',dataIndex:'VUsername',flex:1}
			]
		},
		getDepColumns:function(){
			return [
				{text:'机构ID',dataIndex:'depId',width:200},
				{text:'机构名称',dataIndex:'depName',width:200},
				{text:'项目名称',dataIndex:'VXmmc',flex:1}
			]
		}
	});
	
	var grid = Ext.create('MyGrid',{
		store:store,
		
		tbar:[
			{xtype:'button',text:'User',handler:function(){
				store.load({
					params:{
						className:'user'
					}
				});
				grid.reconfigure(store,grid.getUserColumns());
			}},'-',
			{xtype:'button',text:'XM',handler:function(){
				store.load({
					params:{
						className:'xm'
					}
				});
				grid.reconfigure(store,grid.getDepColumns());
			}}
		]
	})
}