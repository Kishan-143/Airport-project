package com.bank;

public class customers {
	static int cust_no;
	int cust_id;
	String name;
	String address;
	int age;
	int mobile_no;
	customers(int cust_id,String name,String address, int age,int mobile_no){
		this.setCust_id(cust_id);
		this.setAddress(address);
		this.setAge(age);
		this.setMobile_no(mobile_no);
		this.setName(name);
		cust_no++;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
}
