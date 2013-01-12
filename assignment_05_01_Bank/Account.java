//********************************************************************
//  based on Account.java, by Lewis/Loftus
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

package assignment_05_01_Bank;

import java.text.NumberFormat;

public class Account
{   
   private final double RATE = 0.03;  // interest rate of 3.0%

   private double balance;
   private String name;

   public Account (String customerName, double startBalance)  
   {
	  assert(startBalance > -0.01);
      name = customerName;
      balance = startBalance;
   }

   public boolean deposit (double amount)
   {
	  if (amount < 0.01)
		  return false;
	  balance += amount;
	  return true;
   }

   public boolean withdraw (double amount, double fee) 
   {
      if (balance - (amount + fee) < 0.0)
    	  return false;
	  balance -= (amount + fee);
      return true;
   }

   public boolean addInterest ()
   {
	  if (balance < 0.01)
		  return false;
      balance += (balance * RATE);
      return true;
   }
   
   public boolean addInterest (double specialRate)
   {
	   if (balance < 0.01)
		   return false;
	   balance += (balance * specialRate);
	   return true;
   }

   public double getBalance ()
   {
	  assert(balance >= 0);
      return balance;
   }
   
   public String getName ()
   {
	   return name;
   }

   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return (name + "\t" + fmt.format(balance));
   }
}
