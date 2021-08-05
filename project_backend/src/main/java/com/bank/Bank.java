package com.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	
	TransactionList t;
	AccountList a;
	
	Bank() {
		t = new TransactionList();
		a = new AccountList();
		System.out.println("Welcome to the Bank...");	
	}

	public TransactionList get_transactionList() {
		return t;
	}
	
	public AccountList get_accountList() {
		return a;
	}
	
	public void open_account(AccountList accountList){
		String cust_id;
		double balance;
		String account_type,branch;

		Scanner sc= new Scanner(System.in);

		System.out.println("You are in account opening department.");		
		System.out.println("Enter customer Id : ");	
		cust_id = sc.nextLine();
		
		System.out.println("Enter balance : ");	
		balance = sc.nextDouble();
		
		System.out.println("Enter account type (saving/current) : ");	
		account_type = sc.nextLine();
		
		System.out.println("Enter branch name : ");	
		branch = sc.nextLine();
		
		accountList.addAccount(cust_id,balance,account_type,branch);
	}
	
	public void add_transaction(TransactionList transactions){
		
		int id = TransactionList.currentTid;
		double amount;
		int payerBankAccount,payeeBankAccount;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("\nYou are in adding transaction section.");		
		System.out.println("Enter Payee Bank Account : ");	
		payeeBankAccount = sc.nextInt();
		
		System.out.println("Enter Payer Bank Account : ");	
		payerBankAccount = sc.nextInt();
		
		System.out.println("Enter amount : ");	
		amount = sc.nextDouble();
		
		do_transaction(amount, payerBankAccount, payeeBankAccount);
	}
	public void do_transaction(double amount,int payerBankAccount,int payeeBankAccount) {
		t.addTransaction(amount, payerBankAccount, payeeBankAccount);
	}
	public void print_transactions(TransactionList transactions){
		System.out.println("\nAll transactions. ");		
		transactions.printTransactionList();
	}
	
	public void print_accounts(AccountList accounts){
		System.out.println("\nAll accounts. ");		
		accounts.printAccountList();
	}
	
	
	public int get_transaction_no(TransactionList transactions){
		return transactions.currentTid;
	}	
	
	public ArrayList<Object[]> get_transactions(){
		return t.getTransaction();
	}
	
	public void close_account(){
		System.out.println();
		System.out.println("You are in account closing department.");	
	}	
}
