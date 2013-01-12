package assignment_04;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Keypad");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        DisplayPanel panel = new DisplayPanel();
		
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
	}

}
