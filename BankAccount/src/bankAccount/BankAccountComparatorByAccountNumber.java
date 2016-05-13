package bankAccount;

import java.util.ArrayList;
import java.util.Comparator; 



public class BankAccountComparatorByAccountNumber implements Comparator<BankAccount> 
{
	public int compare(BankAccount acct1, BankAccount acct2)
	{
		if(acct1.getAccountNumber() > acct2.getAccountNumber())
		{
			return -1; 
		}
		if(acct1.getAccountNumber() < acct2.getAccountNumber())
		{
			return 1; 
		}
		return 0; 
	}
	
	public static void main(String args [])
	{
		java.util.Comparator<BankAccount> comparatorByAccountNumber =
				new BankAccountComparatorByAccountNumber();
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		accounts.add(new BankAccount(100.0, "Nicholas")); 
		accounts.add(new BankAccount(230.2, "Andrew")); 
		accounts.add(new BankAccount(24023.2, "Pastrano")); 
		
		java.util.Collections.sort(accounts, comparatorByAccountNumber);
		
		for (BankAccount I : accounts)
	      {
	         System.out.println("Acc Number: " + I.getAccountNumber()); 
	         System.out.println("Name: " + I.getName()); 
	      }
	}
}
