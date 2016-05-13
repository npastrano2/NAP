package bankAccount;


/**
 * Creates a bank account with a random bank account number, Accounts can be created,
 * add funds, withdraw funds, and closed when the user is done with the account. 
 * User can have multiple accounts open and sort accounts by account number, name and funds.
 * @author Nicholas Pastrano
 * @version 1.0
 */
public class BankAccount 
{

		/**
		 * Represents the balance of bank account.
		 */
		private double balance; 
		
		/**
		 * Represents the bank accounts owners name.
		 */
		private String name;  
		
		/**
		 * Represent the account number to this bank account.
		 */
		private long accountNumber; 
		
		/**
		 * Represents static number used to create unique account number values.
		 */
		private static long nextNumber = 1000; 
		
		/**
		 * Represents the total number of accounts open.
		 */
		private static int numOfAccounts; 
		
		/**
		 * Constructs a bank account with a random unique account number, a name and a default 
		 * balance. 
		 * @param accountNumber A unique account number
		 * @param name A name of the owner of bank account
		 * @param balance A value representing the balance of account
		 */
		public BankAccount(double balance, String name) 
		{
			this.balance = balance; 
			this.name = name; 
			this.accountNumber = nextNumber; 
			nextNumber++; 
			numOfAccounts++; 
		}
		
		/**
		 * Constructs a bank account with a name and default balance and account number.
		 * @param name A string representation of this accounts owners name
		 */
		public BankAccount(String name) 
		{
			//is this right?, creates a bank account with a name.
			this.balance = 0; 
			this.accountNumber = 1000; 
			this.name = name; 
			nextNumber++; 
			numOfAccounts++; 
		}
		
		/**
		 * Constructs a bank accounts with default values.
		 */
		public BankAccount()
		{
			this.name = "John";
			this.accountNumber = 1000; 
			this.balance = 0; 
			nextNumber++; 
			numOfAccounts++; 
		}
		
		/**
		 * Returns the name of this bank account. 
		 * @return 
		 * @return A name of this bank account
		 */
		public String getName()
		{
			return this.name; 
		}
		
		/**
		 * Changes the name of this bank account. 
		 * @param name A string representation of this bank account
		 */
		public void setName(String name)
		{
			this.name = name; 
		}
		
		/**
		 * Returns the account number of this account.
		 * @return A long value representing this bank account. 
		 */
		public long getAccountNumber()
		{
			return this.accountNumber;
		}
		
		/**
		 * Returns the account balance. 
		 * @return A double value representing the balance of this bank account
		 */
		public double getBalance()
		{
			return this.balance; 
		}
		
		/**
		 * Changes the value of this bank accounts balance when making a withdrawal. 
		 * @param amount A double value representing the amount to be withdrawn
		 * @param fee A double value representing the amount to be deducted during withdrawal
		 */
		public void withdraw(double amount, double fee)
		{
			if(this.balance >= (amount + fee))
			{
				this.balance = this.balance - (amount + fee); 
			}
		}
		/**
		 * Changes the value of this bank account's balance when making a deposit. 
		 * @param amount A double value representing the amount to be deposited
		 */
		public void deposit(double amount)
		{
			this.balance = this.balance + amount; 
		}
			
		/**
		 * Closes the current account by appending "CLOSED" to the account name
		 * and sets the balance to 0, leaving account number unchanged. 
		 */
		public void close()
		{
			this.name = name + "CLOSED"; 
			this.balance = 0; 
			//static or not?
			BankAccount.numOfAccounts--; 
		}
		
		/**
		 * Returns the total number of accounts. 
		 * @numOfAccounts A integer value representing total number of open accounts
		 */
		public static int getNumOfAccounts()
		{
			return numOfAccounts; 
		}
		
		/**
		 * Compares this account with the other account and returns true if they are the same, 
		 * false otherwise. 
		 * @return A boolean value specifying whether or not this bank account is equal to other bank account
		 */
		public boolean equals(Object Obj)
		{
			if(!(Obj instanceof BankAccount))
			{
				return false; 
			}
			BankAccount other = (BankAccount) this; 
			
			return this.accountNumber == other.accountNumber; 
		}
		
		/**
		 * Returns a string displaying the name, acc number and balance of Bank Account. 
		 */
		public String toString() 
		{
			return "Name: " + this.name + "\nAccount Number: " + this.accountNumber + "\nBalance: " + this.balance + "\n"; 
		}
		
		/**
		 * Creates a new account whose balance is the sum of the balances in acct1
		 * and closes account 1 and account 2. Both accounts must have the same name,
		 * and different account numbers then are returned with that name and a new account number.
		 */
		public static BankAccount consolidate(BankAccount acct1, BankAccount acct2)
		{
			if(acct1.getName().equals(acct2.getName()))
			{
				if(acct1.getAccountNumber() != acct2.getAccountNumber())
				{
					BankAccount acct3 = new BankAccount (acct1.getBalance() + acct2.getBalance(), acct1.getName());
					
					return acct3; 
				}
			}
		return null; 
		}
}

