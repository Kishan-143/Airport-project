package com.bank;
import java.util.*;  
public class console {
	
	public static void main(String[] args) {
		Bank db = new Bank();
		while (true){
			System.out.println("Choises...");
			System.out.println(" 1. Account Opening.");
			System.out.println(" 2. Account Closing.");
			System.out.println(" 3. Add transaction.");
			System.out.println(" 4. Print all accounts.");
			System.out.println(" 5. Print all transactions.");
			System.out.println(" 10. Exit");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter choises from above.");
			int s1 = sc.nextInt();
			if(s1 == 10) {
				System.out.println("Thank you !!!");
				break;
			}
			switch(s1) {
				case 1:
				{
					db.open_account(db.get_accountList());
					break;
				}
				case 3: 
				{
					db.add_transaction(db.get_transactionList());
					break;	
				}
				case 4:
				{
					db.print_accounts(db.get_accountList());
					break;
				}
				case 5:
				{
					db.print_transactions(db.get_transactionList());
					break;
				}
				default:break;
			}			
		}
	}

}
