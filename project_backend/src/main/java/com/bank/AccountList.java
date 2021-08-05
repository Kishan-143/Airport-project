package com.bank;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class AccountList {
	static int currentAccountNo = 0;

	ArrayList<AccountDetails> accountList = new ArrayList();
	
	public void addAccount(String cust_id,double balance,String account_type,String branch) 
	{
		accountList.add(new AccountDetails(cust_id,currentAccountNo,balance,account_type,branch));
	}
	
	public void printAccountList() {
		for(int i=0;i<accountList.size();i++) 
		{
			System.out.println(accountList.get(i));	
		}
	}

	
}
