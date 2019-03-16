package com.zrhis.wsjd.util;

import com.zrhis.base.Message;

public class MessageManager {
	
	public static Message exception(Exception ex){
		Message msg = exception(ex, false);
		return msg;
	}
	public static Message exception(Exception ex,boolean details){
		Message msg = new Message();
		if(ex != null){
			msg.setSuccess(false);
			msg.setIsException(true);
			msg.setIsError(true);
			msg.setExName(ExceptionTools.getExceptionName(ex));
			if(details){
				msg.setExDetails(ExceptionTools.getExceptionDetails(ex).toString());
			}
			msg.setMessage(ex.getMessage());
		}
		return msg;
	}
	public static Message save(boolean flag){
		String str = flag?"保存成功":"保存失败";
		Message msg = new Message(flag,str);
		return msg;
	}
	public static Message saveCheck(boolean flag){
		String str = flag?"保存成功":"该家庭已签约";
		Message msg = new Message(flag,str);
		return msg;
	}
	public static Message save(){
		return save(true);
	}
	public static Message update(boolean flag){
		String str = flag?"修改成功":"修改失败";
		Message msg = new Message(flag,str);
		return msg;
	}
	public static Message update(){
		return update(true);
	}
	public static Message delete(boolean flag){
		String str = flag?"删除成功":"删除失败";
		Message msg = new Message(flag,str);
		return msg;
	}
	public static Message delete(){
		return delete(true);
	}
}
