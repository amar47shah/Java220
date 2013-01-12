package assignment_05_01_Bank;

import java.util.ArrayList;


public class LLBank 
{
	private static double FEE = 2.50;
	
	private ArrayList<Account> ourAccounts;
	private int currentAccount;
	
	public LLBank() 
	{
		ourAccounts = new ArrayList<Account>(30);
		currentAccount = -1;
	}
	
	public boolean addAccount(String customerName, double startBalance)
	{
		if (ourAccounts.size() < 30)
		{
			ourAccounts.add(new Account(customerName, startBalance));
			return true;
		}
		return false;
	}
	
	public void addInterest()
	{
		for (Account a : ourAccounts)
			a.addInterest();
	}
	
	public boolean login(String name)
	{
		for (int i = 0; i < ourAccounts.size(); i++) 
			if (name.equals(ourAccounts.get(i).getName())) 
			{
			    this.currentAccount =  i;
			    return true;
			}
		return false;
	}
	
	public void logout()
	{
		currentAccount = -1;
	}
	
	public boolean deposit(double amount)
	{
		try
		{
			return ourAccounts.get(currentAccount).deposit(amount);
		}
		catch(IndexOutOfBoundsException e)
		{
			notLoggedIn();
			return false;
		}
	}
	
	public boolean withdraw(double amount)
	{
		try
		{
			return ourAccounts.get(currentAccount).withdraw(amount, FEE);
		}
		catch(IndexOutOfBoundsException e)
		{
			notLoggedIn();
			return false;
		}
	}
	
	public double getBalance()
	{
		try
		{
			return ourAccounts.get(currentAccount).getBalance();
		}
		catch(IndexOutOfBoundsException e)
		{
			notLoggedIn();
			return -1.0;
		}
	}
	
	public void showAllAccounts()
	{
		for (Account a : ourAccounts)
			System.out.println(a.toString());
	}
	
	private void notLoggedIn()
	{
		System.out.println("\nYou are not logged into an account.");
	}		
}
