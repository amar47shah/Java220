package lab_04;

import javax.swing.JFrame;

public class Lab_04 {

	/**
	 * @param argso
	 */
	public static void main(String[] args) 
	{
		JFrame mainWindow = new JFrame("My App");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserLoginPanel userLogin = new UserLoginPanel();
		mainWindow.getContentPane().add(userLogin);
		mainWindow.pack();
		mainWindow.setVisible(true);
	}

}
