package com.tektaurus.bean;

public class Student {
	
	private int sid;
	private String name;
	private String mobile;
	private String address;
	private String stream;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public Student(int sid, String name, String mobile, String address,
			String stream) {
		super();
		this.sid = sid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mobile=" + mobile
				+ ", address=" + address + ", stream=" + stream + "]";
	}
	

}
