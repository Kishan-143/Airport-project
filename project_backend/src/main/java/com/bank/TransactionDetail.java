package com.bank;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class TransactionDetail {
	double amount;
	double traTimestamp;
	int payeeBankAccount;
	int payerBankAccount;
	LocalDateTime traTime;

	TransactionDetail(double amount,int payeeBankAccount,int payerBankAccount)
	{
		LocalDateTime now = LocalDateTime.now();  
		this.setTraTime(now);
		this.setAmount(amount);
		this.setPayeeBankAccount(payeeBankAccount);
		this.setPayerBankAccount(payerBankAccount);
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setTraTime(LocalDateTime t) {
		this.traTime = t;
	}
	public double getTraTimestamp() {
		return traTimestamp;
	}
	public void setTraTimestamp(double traTimestamp) {
		this.traTimestamp = traTimestamp;
	}
	public int getPayeeBankAccount() {
		return payeeBankAccount;
	}
	public void setPayeeBankAccount(int payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}
	public int getPayerBankAccount() {
		return payerBankAccount;
	}
	public void setPayerBankAccount(int payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}
}
