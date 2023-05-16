package com.kuebiko.vo;

//POJO ->>2006 -NIIT technologies
//Plain Old Java Object
//a class which does not extends special class is called POJO
//POJI - >> Plain OLD Java Interface
public class AccountVO {
	private String ac;
	private int balance;
	private String name;
	private String email;
	private String mobile;
	private int port;
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AccountVO [ac=" + ac + ", balance=" + balance + ", name=" + name + ", email=" + email + "]";
	}

}
