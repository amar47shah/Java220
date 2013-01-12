package assignment_03;

import javax.swing.JFrame;

public class TextStats 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	      JFrame frame = new JFrame ("Text Stats");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	      TextStatsPanel panel = new TextStatsPanel();
	      frame.getContentPane().add (panel);

	      frame.pack();
	      frame.setVisible(true);
		
	}

}
