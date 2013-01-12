package assignment_04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DisplayPanel extends JPanel
{
	private JTextField displayField = new JTextField(15);
	private KeypadPanel keypad = new KeypadPanel();
	private JButton clear = new JButton("clear");
	
	public DisplayPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.yellow);
		
		clear.addActionListener(new ActionListener() 
			{ public void actionPerformed(ActionEvent e) 
		    	{ displayField.setText(""); } });
		
		displayField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		keypad.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		clear.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		
		add(displayField, BorderLayout.NORTH);
		add(keypad, BorderLayout.CENTER);
		add(clear, BorderLayout.EAST);
	}

	public class KeypadPanel extends JPanel 
	{
		public KeypadPanel ()
		{
			setLayout(new GridLayout(4, 3));
			setBackground(Color.GRAY);
			ArrayList<JButton> b = new ArrayList<JButton>();
			
			// Create buttons.
			for (int i = 0; i < 10; i++) {
				b.add(new JButton("" + i));
			}
			b.add(new JButton("end"));
			b.add(new JButton("call"));
			
			// Add listener to each button.
			b.get(0).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"0"); } });
			b.get(1).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"1"); } });
			b.get(2).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"2"); } });
			b.get(3).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"3"); } });
			b.get(4).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"4"); } });
			b.get(5).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"5"); } });
			b.get(6).addActionListener( new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"6"); } });
			b.get(7).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"7"); } });
			b.get(8).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"8"); } });
			b.get(9).addActionListener(	new ActionListener()
			{ public void actionPerformed(ActionEvent e) 
	    	{ displayField.setText(displayField.getText()+"9"); } });

			// Add the buttons to the Keypad panel
			for (int i = 1; i <= 9; i++)
			{
				add(b.get(i));
			}
			add(b.get(10));
			add(b.get(0));
			add(b.get(11));		
		} // end KeypadPanel constructor
	} // end class KeypadPanel
} // end class DisplayPanel