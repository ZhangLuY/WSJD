package com.zrhis.base;

import java.util.List;
import java.util.Map;
/**
 * @author 王成委
 * 
 * 公共消息类，作为统一返回前台的格式类
 * 
 * 如需加字段请备注姓名、字段作用、日期
 * 
 */
@SuppressWarnings("rawtypes")
public class Message {
	private Boolean isError;//是否是错误信息
	private String errorCode;//错误代码
	private Boolean success;//请求是否成功
	private Boolean isException;//是否抛出异常，抛出异常则success为false，优先级大于success
	private String exName;//异常名称
	private String exDetails;//异常详细信息
	private String message;
	/****前台分页相关*****/
	private Integer totalPage;//总页数
	private Integer totalCount;//总记录数
	private Integer currentPage;//当前页数
	private Integer pageSize;//分页大小
	private List roots;//记录
	private Object data;
	private Boolean flag;//操作是否成功
	private Boolean isSessionOut;	//session是否失效标志
	private Map<String,Object> metaData;
	public Message(){
		
	}
	public Message(Integer totalCount,List list){
		this.success = true;
		this.flag = true;
		this.totalCount = totalCount;
		this.roots = list;
		
	}
	public Message(String message){
		this.success = true;
		this.flag = true;
		this.message = message;
	}
	public Message(boolean flag,String message){
		this.success = true;
		this.flag = flag;
		this.message = message;
	}
	public Message(Object obj){
		this.success = true;
		this.flag = true;
		this.data = obj;
		
	}
	public Message(List list){
		this.success = true;
		this.flag = true;
		this.roots = list;
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getIsError() {
		return isError;
	}
	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getIsException() {
		return isException;
	}
	public void setIsException(Boolean isException) {
		this.isException = isException;
	}
	public String getExName() {
		return exName;
	}
	public void setExName(String exName) {
		this.exName = exName;
	}
	public String getExDetails() {
		return exDetails;
	}
	public void setExDetails(String exDetails) {
		this.exDetails = exDetails;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List getRoots() {
		return roots;
	}
	public void setRoots(List roots) {
		this.roots = roots;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Boolean getIsSessionOut() {
		return isSessionOut;
	}
	public void setIsSessionOut(Boolean isSessionOut) {
		this.isSessionOut = isSessionOut;
	}
	public Map<String, Object> getMetaData() {
		return metaData;
	}
	public void setMetaData(Map<String, Object> metaData) {
		this.metaData = metaData;
	}
	
	
}
