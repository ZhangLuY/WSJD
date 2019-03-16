package com.zrhis.wsjd.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {
	public final String DATETIME_FORMAT = "yyyy-MM-dd hh:mm:ss";
	public final String DATEHM_FORMAT = "yyyy-MM-dd hh:mm";
	public final String DATE_FORMAT = "yyyy-MM-dd";
	private DateFormat[] dfs = {
		new SimpleDateFormat(this.DATETIME_FORMAT),
		new SimpleDateFormat(this.DATEHM_FORMAT),
		new SimpleDateFormat(this.DATE_FORMAT)
	};
	public Date parse(String dstr){
		Date date = null; 
		if(dstr.length()>19) dstr = dstr.substring(0, 19);
		try {
			date = this.dfs[0].parse(dstr);
		} catch (ParseException e) {
			try {
				date = this.dfs[1].parse(dstr);
			} catch (ParseException e1) {
				try {
					date = this.dfs[2].parse(dstr);
				} catch (ParseException e2) {
				}
			}
		}
		return date;
	}
	
	public String format(Date date,String format){
		String rs = "";
		if(date != null){
			DateFormat df = new SimpleDateFormat(format);
			rs = df.format(date);
		}
		return rs;
	}
	public String format(String date,String format){
		String rs = "";
		if(date != null){
			DateFormat df = new SimpleDateFormat(format);
			rs = df.format(this.parse(date));
		}
		return rs;
	}
}
