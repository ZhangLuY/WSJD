
Ext.apply(Ext.String,{
	rightPad:function(string, size, character){
		var result = String(string);
        character = character || " ";
        while (result.length < size) {
            result += character;
        }
        return result;
	},
	//41040000000000000
	generateDepPath:function(depId){
		var lens = [2,2,2,3,3],
			depId = String(depId),reg=/[0]{17}/,
			vpath=[],start=0,len,length = 17;
		for(var i=0;i<lens.length;i++){
			len = lens[i];
			var str = depId.substr(start,len);
			str = this.rightPad(str,length,'0');
			if(!reg.test(str)){
				vpath.push(str);
			}else{
				break;
			}
			start += len;
		}
		return vpath.join('-');
	}
});

Ext.apply(Ext.util.Format,{
	formatXzlx:function(value){
		if(value == 1){
			return '<font>市</font>';
		}else if(value == 2){
			return '<font>县</font>';
		}else if(value == 3){
			return '<font>乡镇</font>';
		}else if(value == 4){
			return '<font>村</font>';
		}else if(value == 5){
			return '<font>单位、社区</font>';
		}
	}
})

Ext.apply(Ext.util.Format,{
	formatJb:function(val){
		if(val == 1){
			return '<font>国家级</font>';
		}else if(val == 2){
			return '<font>省级</font>';
		}
	}
})
/**
 * 自定义VTypes
 */
Ext.apply(Ext.form.VTypes,{
	/**
	 * @param {String} val
	 * @param {Ext.form.field.Field} field
	 */
	password:function(val,field){
	    if(field.confirmTo){
	        var pwd=Ext.getCmp(field.confirmTo);
	        if(val.trim()== pwd.getValue().trim()){
	            return true; 
	        } else {
	            return false; 
	        }
	        return false; 
	    } 
    },
    passwordText:'两次输入的密码不一致'
});

Ext.apply(Ext.grid.RowEditor.prototype,{  
    saveBtnText: '确定',  
    cancelBtnText: '取消',  
    errorsText: '错误信息',  
    dirtyText: '已修改,你需要提交或取消变更'  
});

Ext.override(Ext.app.Controller,{
	
	storeControl:function(selectors){
		var me = this,
			selector,listener ,listeners,ev,scope = me,options;
		
		for(var selector in selectors){
			if (selectors.hasOwnProperty(selector) && (listeners = selectors[selector])) {
				
				var store = this.getStore(selector);
				
				for(ev in listeners){
					if(listeners.hasOwnProperty(ev)){
						options = null;
						listener = listeners[ev];
						
						if(Ext.isObject(listener)){
							options  = listener;
                            listener = options.fn;
                            scope    = options.scope || me;
                            
                            delete options.fn;
                            delete options.scope;
						}
						store.addListener(ev,listener,scope)
						
					}
				}//end listeners loop
				
			}
		} // end selectors loop
	}
});

Ext.ComponentQuery.pseudos.nothidden = function(items) {
    var i = 0, l = items.length, c, result = [];
    for (; i < l; i++) {
        if (!(c = items[i]).isHidden()) {
            result.push(c);
        }
    }
    return result;
};

Ext.apply(Ext.ComponentManager,{
	getActive:function(e){
		var dom = document.activeElement || e.target,
			id = dom.id;
		
		id = id.substring(0,id.lastIndexOf('-'));
		
		return Ext.getCmp(id);
	}
})
