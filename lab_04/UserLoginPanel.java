package lab_04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLoginPanel extends JPanel implements ActionListener
{
    private JTextField		userIdField			= new JTextField();
    private JPasswordField	passwordField		= new JPasswordField();
    private	 JLabel			userIdLabel			= new JLabel("Id: ", JLabel.RIGHT);
    private JLabel			userPasswordLabel	= new JLabel("Password: ", JLabel.RIGHT);
    private JButton			logonButton			= new JButton("Logon");
    private JButton			cancelButton		= new JButton("Cancel");
    public UserLoginPanel()
    {
    	GridLayout gLayout = new GridLayout(3, 2);
    	gLayout.setHgap(2);
    	gLayout.setVgap(5);
    	setLayout(gLayout);
    	setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
    	
    	logonButton.setDefaultCapable(true);
    	
    	add(userIdLabel);
    	add(userIdField);
    	add(userPasswordLabel);
    	add(passwordField);
    	add(logonButton);
    	add(cancelButton);
    	cancelButton.addActionListener(this);
    	logonButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    	String selection = e.getActionCommand();
    	if (selection.equals("Cancel"))
    	{
    		if (JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
    		{
    			close();
    		}
    	}
    	if (selection.equals("Logon"))
    	{
    		String name = userIdField.getText();
    		JOptionPane.showMessageDialog(this, "Hello " + name + ", I will try to log you on.");
    	}
    }
    public void close()
    {
    	System.out.println("I am leaving.");
    }
}
	