package lab_03;

import javax.swing.JFrame;

public class Message {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
	JFrame frame = new JFrame ("Compose Message");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	MessagePanel panel = new MessagePanel();

    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
    }

}
