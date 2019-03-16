package com.zrhis.base;

import java.util.List;

@SuppressWarnings("rawtypes")
public class ResultModel {
	private Integer totalCount;
	private Integer page;
	
	private List list;
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	

}
