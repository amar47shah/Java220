package assignment_04;

// This class was not used in the assignment
// Instead, KeypadPanel was made a nested class of DisplayPanel

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeypadPanel extends JPanel 
{
	public KeypadPanel ()
	{
		setLayout(new GridLayout(4, 3));
		setBackground(Color.GRAY);
		ArrayList<JButton> b = new ArrayList<JButton>();
		KeypadListener listen = new KeypadListener();
		
		// Create buttons.
		for (int i = 0; i < 10; i++) {
			b.add(new JButton("" + i));
		}
		b.add(new JButton("end"));
		b.add(new JButton("call"));
		
		// Add listener to each button.
		for (int i = 0; i < 12; i++) {
			b.get(i).addActionListener(listen);
		}
		
		// Add the buttons to the Keypad panel
		for (int i = 1; i <= 9; i++)
		{
			add(b.get(i));
		}
		add(b.get(10));
		add(b.get(0));
		add(b.get(11));		
	}

	private class KeypadListener implements ActionListener
	{
        public void actionPerformed (ActionEvent event)
	    {
	    }
	}
}