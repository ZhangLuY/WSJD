package com.zrhis.wsjd.util;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 5604116064805170163L;

	public DbException() {
		super();

	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
	}

	public DbException(String message) {
		super(message);
	}

	public DbException(Throwable cause) {
		super(cause);
	}
	

}
