package assignment_03;

public class RollingDice2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    PairOfDice myDice = new PairOfDice();
	  
	    System.out.println("I've got a pair of dice.");
	    System.out.println("Their value is " + myDice.toString() + ".");
	    System.out.println("Rolling the dice...");
	    myDice.roll();
	    
	    System.out.print("The first die rolled " + myDice.getFirstValue()); 
	    System.out.println(" and the second die rolled " + myDice.getSecondValue() + ".");
	    System.out.println("Now their value is " + myDice.toString() + ".");
	    
	    System.out.println("\nI'm gonna cheat!");
	    System.out.println("I'll set both their values to 6.");
	    myDice.setFirstValue(6);
	    myDice.setSecondValue(6);
	    System.out.println("Now their value is " + myDice.toString() + "!");
	    
	    System.out.println("\nI wonder how far I can push this cheating thing...");
	    System.out.println("I'll set both their values to 10, so I'll score 20!");
	    myDice.setFirstValue(10);
	    myDice.setSecondValue(10);
	    System.out.println("It didn't work! Their value is still " + myDice.toString() + ".");
	    System.out.println("Doh!");
	    
	}

}
