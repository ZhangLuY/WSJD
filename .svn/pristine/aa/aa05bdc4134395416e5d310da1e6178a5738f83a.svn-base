package com.zrhis.base;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

public class UserList implements Serializable{
	private static final UserList user = new UserList();//内部实例单例模式
	private Vector<UserSession> v;
	private UserList() {
		v = new Vector<UserSession>();//内部员工主键

	}

	public static UserList getInstance() {
		return user;

	}

	public void addUser(UserSession u) {
		if (null != u) {
			v.addElement(u);
			System.out.println(getNum());
		}

	}

	public void romoveUser(UserSession u) {
		if (null != u)
			v.removeElement(u);
		//System.out.println("等录的用户"+getNum()+"位");

	}

	public Enumeration<UserSession> getUserList() {
	
		return v.elements();

	}

	public int getNum() {
		return v.size();

	}

}
