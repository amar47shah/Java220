package assignment_05_03_Stopwatch;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Stopwatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StopwatchPanel display = new StopwatchPanel();
		StopwatchControls controls = new StopwatchControls(display);
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		panel.add(display);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		panel.add(controls);
		panel.add(Box.createRigidArea(new Dimension(0, 10)));
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
