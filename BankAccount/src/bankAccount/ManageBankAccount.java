package bankAccount;

import java.util.Scanner;
import java.util.ArrayList; 
public class ManageBankAccount
{
	public static void main(String args[])
	{
		//new java.util.ArrayList<BankAccount>();
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		//java.util.Comparator<BankAccount> comparatorByAccountNumber =
			//	new BankAccountComparatorByAccountNumber();
		
		Scanner scan = new Scanner(System.in); 
		//create an array list of account information
		
		//BankAccount user1 = new BankAccount(); 
		//Switch names
		final int CREATE = 1; 
		final int BALANCE = 2; 
		final int DEPOSIT = 3; 
		final int WITHDRAW = 4; 
		final int EXIT = 5; 
		// used to create object of bank account.
		String name; 
		double balance; 
		long accNum; 
		int menuSelection = 0; 
		
		System.out.println(" MENU ");
		System.out.println("1. Create Account");
		System.out.println("2. View Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Exit");
		System.out.println(" ");
		
		
		do
		{
			System.out.println("WHAT WOULD YOU LIKE TO DO: ");
			menuSelection = scan.nextInt(); 
			switch(menuSelection)
			{
			case CREATE: 
					System.out.println("Enter name of new account"); 
					name = scan.next(); 
					System.out.println("Enter new balance of account"); 
					balance = scan.nextDouble(); 
					accounts.add(new BankAccount(balance, name)); 
					//BankAccount acct1 = new BankAccount(balance, name); 
				
					//accNum = accounts.getAccountNumber(); 
					//ArrayList.add(account); 
				
					System.out.println(accounts.toString()); 
				break; 
			case BALANCE:
				System.out.println("Check Account Balance\n");
				System.out.println("Enter Account Number: \n"); 
				accNum = scan.nextLong(); 
				 //BankAccount.get(accNum).getBalance(); 
				BankAccount num = searchByAccountNum(accounts, accNum); 
				
				System.out.println("Here is your balance:" + num); 
				//acctNum = acct1.getAccountNumber(); 
				break; 
			case DEPOSIT: 
				System.out.println("Make a Deposit"); 
				System.out.println("Enter Account Number: \n"); 
				accNum = scan.nextLong(); 
				break; 
			case WITHDRAW: 
				System.out.println("Withdraw from account\n");
				System.out.println("Account Number: ");
				break; 
			case EXIT: 
				System.out.println(); 
				break; 
			
			}
		}while(menuSelection != 5); 
		scan.close();
	}

	private static BankAccount searchByAccountNum(ArrayList<BankAccount> accounts, long accNum) 
	{
		return null; 
	}
}
