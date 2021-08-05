package com.bank;

import java.util.HashMap;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AccountDetails {
	String cust_id;
	int account_no;
	double balance;
	String account_type;
	String branch;
	AccountDetails(String cust_id,int account_no,double balance,String account_type,String branch)
	{
		this.setAccount_no(account_no);
		this.setAccount_type(account_type);
		this.setBalance(balance);
		this.setBranch(branch);
		this.setCust_id(cust_id);
	}
	
	public String toString()
    {
		return "Customer Id :" + cust_id + "\n Account No : " + account_no + "\nAccount Balance : " + balance + "\nAccount Type :" + account_type + "\nBranch :" + branch;
    }

	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
