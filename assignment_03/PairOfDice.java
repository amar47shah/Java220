package assignment_03;

public class PairOfDice 
{

	private Die die1 = new Die();
	private Die die2 = new Die();

	public void setFirstValue(int value)
	{
		die1.setFaceValue(value);
	}
	
	public void setSecondValue(int value)
	{
		die2.setFaceValue(value);
	}
	
	public int getFirstValue()
	{
		return die1.getFaceValue();
	}
	
	public int getSecondValue()
	{
		return die2.getFaceValue();
	}
	
	public int getValue()
	{
		return getFirstValue() + getSecondValue();
	}
	
	public int roll()
	{
		return die1.roll() + die2.roll();
	}
	
	public String toString()
	{
		String result = Integer.toString(getValue());
		
		return result;
	}
}
