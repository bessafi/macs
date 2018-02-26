package com.bombardier.macs;

import java.util.Date;

/**
 * This class is a bean used to log performance entries
 * @author jblaplace
 *
 */
public class PerformanceStart {
	private String className;
	private Date startTime;
	private long threadId;
	private String msg;
	private String user;
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getClassName() {
		return className;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public long getThreadId() {
		return threadId;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}