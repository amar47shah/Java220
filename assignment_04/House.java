package assignment_04;

import javax.swing.JFrame;

public class House 
{
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HousePanel panel = new HousePanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
