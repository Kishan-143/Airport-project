package com.bank;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class TransactionList {
	static int currentTid = 0;
	HashMap<Integer,TransactionDetail> transactionList = new HashMap();
	
	public void addTransaction(double amount,int payerBankAccount, int payeeBankAccount){
		TransactionDetail t = new TransactionDetail(amount,payeeBankAccount,payerBankAccount);
		transactionList.put(this.currentTid,t);
		currentTid++;
	}	
	public ArrayList<Object[]> getTransaction() {
		ArrayList<Object[]> x = new ArrayList<Object[]>();
		Object[] y = new Object[3];
		Iterator<Integer> hashMapKey = transactionList.keySet().iterator();
		while(hashMapKey.hasNext())
		{
			Integer key = hashMapKey.next();
			y[0] = transactionList.get(key).amount;
			y[1] = transactionList.get(key).payeeBankAccount;
			y[2] = transactionList.get(key).payerBankAccount;
			x.add(y);
		}
		return x;
	}
	public void printTransactionList() {
		Iterator<Integer> hashMapKey = transactionList.keySet().iterator();
		while(hashMapKey.hasNext())
		{
			Integer key = hashMapKey.next();
			System.out.println("TID: "+ key);

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  	

			System.out.println("Transaction Amount: "+ transactionList.get(key).amount);
			System.out.println("Transaction Time: "+ dtf.format(transactionList.get(key).traTime));
			System.out.println("Payee Bank Account: "+ transactionList.get(key).payeeBankAccount);
			System.out.println("Payer Bank Account: "+ transactionList.get(key).payerBankAccount);		
			System.out.println();
		}
	}
}
