package lab_02;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class TwoPanels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ImageIcon pic11 = new ImageIcon("books.jpg");
		ImageIcon pic12 = new ImageIcon("couple.jpg");
		ImageIcon pic21 = new ImageIcon("dog.jpg");
		ImageIcon pic22 = new ImageIcon("lightbulb.jpg");
		
		JLabel label11 = new JLabel(pic11);
		JLabel label12 = new JLabel(pic12);
		JLabel label21 = new JLabel(pic21);
		JLabel label22 = new JLabel(pic22);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel primary = new JPanel();
		
		panel1.setBackground(Color.green);
		panel1.setPreferredSize(new Dimension(400, 300));
		panel2.setBackground(Color.blue);
		
		panel1.add(label11);
		panel1.add(label12);
		panel2.add(label21);
		panel2.add(label22);
		primary.add(panel1);
		primary.add(panel2);
		
		JFrame frame = new JFrame("Pictures");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(primary);

		frame.pack();
		frame.setVisible(true);
		
	}

}
