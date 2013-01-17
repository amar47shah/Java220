package lab_03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessagePanel extends JPanel {

	private JLabel toLabel, ccLabel, bccLabel, subjectLabel, bodyLabel;
	private JTextField toField, ccField, bccField, subjectField, bodyField;
	private JButton sendButton;
	
	public MessagePanel() {
		toLabel = new JLabel ("To:");
		ccLabel = new JLabel ("Cc:");
		bccLabel = new JLabel ("Bcc:");
		subjectLabel = new JLabel ("Subject:");
		bodyLabel = new JLabel ("Message:");
		
		toField = new JTextField (20);
		ccField = new JTextField (20);
		bccField = new JTextField (20);
		subjectField= new JTextField (20);
		bodyField = new JTextField (20);
		
		sendButton = new JButton ("SEND");
	    sendButton.addActionListener (new ButtonListener());

	
		add(toLabel);
		add(toField);
	    add(ccLabel);
		add(ccField);
		add(bccLabel);
		add(bccField);
		add(subjectLabel);
		add(subjectField);
		add(bodyLabel);
		add(bodyField);
		add(sendButton);
		
        setPreferredSize (new Dimension(250, 300));
	    setBackground (Color.YELLOW);
	}	
	private class ButtonListener implements ActionListener
	{
	    public void actionPerformed (ActionEvent event)
	    {
	    	System.out.println("To: " + toField.getText());
	    	System.out.println("Cc: " + ccField.getText());
	    	System.out.println("Bcc: " + bccField.getText());
	    	System.out.println("Subject: " + subjectField.getText());
	    	System.out.println("Message: " + bodyField.getText());
	   
	    }
	}
}
