package assignment_05_01_Bank;

import java.util.Scanner;
import java.text.NumberFormat;


public class AtTheBank {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LLBank bank = new LLBank();
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		boolean readyToLeave = false;
		boolean readyToLogout = false;
		String input1, input2;
			
		System.out.println("Welcome to L&L Bank.");
			
		while (!readyToLeave) {
			System.out.println("\nPlease choose.");
			System.out.println("\t1) Open a new account.");
			System.out.println("\t2) Access an existing account.");
			System.out.println("\t3) Apply interest to all accounts.");
			System.out.println("\t4) View all accounts.");
			System.out.println("\t5) Exit.");
			input1 = scan.next();
			
			if (input1.equals("1")) 
			{
				System.out.println("You chose to open an account.");
				System.out.print("Name: ");
				String customerName = scan.next();
				System.out.print("Starting Balance: ");
				double startBalance = scan.nextDouble();
				if (startBalance < 10.0)
				{
					System.out.println(customerName + "'s account could not be created.");
					System.out.println("The minimum starting balance is $10.");
				}
				else if (bank.addAccount(customerName, startBalance))
				{
					System.out.println(customerName + "'s account was created.");
				}
				else
				{
					System.out.println(customerName + "'s account was not created.");
					System.out.println("The bank cannot accept new accounts at this time.");
				}
			}
			else if (input1.equals("2")) 
			{
				System.out.println("You chose to access an account.");
				System.out.print("Name: ");
				String customerName = scan.next();
				
				if (bank.login(customerName))
				{
					readyToLogout = false; 
					while (!readyToLogout)
					{
						System.out.println("\nYou are logged in as " + customerName + ".");
						System.out.println("Please choose.");
						System.out.println("\t1) Deposit funds.");
						System.out.println("\t2) Withdraw funds.");
						System.out.println("\t3) Balance Statement");
						System.out.println("\t4) Log out.");
				
						input2 = scan.next();
					
						if (input2.equals("1"))
						{
							System.out.print("Deposit amount: ");
							double amount = scan.nextDouble();
							if (bank.deposit(amount))
								System.out.println("Your new balance is " + money.format(bank.getBalance()) + ".");
							else
								System.out.println("Your deposit could not be completed.");
						}
						else if (input2.equals("2"))
						{
							System.out.print("Withdrawal amount: ");
							double amount = scan.nextDouble();
							if (bank.withdraw(amount))
								System.out.println("Your new balance is " + money.format(bank.getBalance()) + ".");
							else
								System.out.println("You have insufficient funds to withdraw that amount.");
						}
						else if (input2.equals("3"))
						{
							System.out.println("Your balance is " + money.format(bank.getBalance()) + ".");
						}
						else if (input2.equals("4"))
						{
							readyToLogout = true;
						}
						else
						{
							System.out.println("Please choose a valid option.");
						}
						
					} // end while
					
					// Logging out					
					bank.logout();
					System.out.println("You are logged out of " + customerName + "'s account.");
				}
				else
				{
					System.out.println(customerName + "'s account was not found.");
				}
			}
			else if (input1.equals("3"))
			{
				bank.addInterest();
				System.out.println("Interest has been applied to each account.");
				bank.showAllAccounts();
			}
			else if (input1.equals("4"))
			{
				bank.showAllAccounts();
			}
			else if (input1.equals("5")) 
			{
				readyToLeave = true;
			}
			else
			{
				System.out.println("Please choose a valid option.");
			}
		} // end while
			
		System.out.println("Thanks for doing business at L&L Bank.");
	}
}