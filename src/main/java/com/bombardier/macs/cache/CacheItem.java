package com.bombardier.macs.cache;

public class CacheItem {
	private long timeStamp;
	private Object data;

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public CacheItem(long timeStamp, Object data) {
		super();
		this.timeStamp = timeStamp;
		this.data = data;
	}
}
