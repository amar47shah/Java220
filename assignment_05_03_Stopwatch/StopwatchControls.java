package assignment_05_03_Stopwatch;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StopwatchControls extends JPanel 
{
	private StopwatchPanel	display;
	private JButton			startButton, resetButton;

	public StopwatchControls(StopwatchPanel display)
	{
		this.display = display;

		startButton = new JButton("Start");
		startButton.setEnabled(true);
		startButton.addActionListener(new StartListener());

		resetButton = new JButton("Reset");
		resetButton.setEnabled(false);
		resetButton.addActionListener(new ResetListener());

		setBackground(Color.black);
		add(startButton);
		add(resetButton);
	}
	private class StartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getActionCommand().equals("Stop"))
			{
				startButton.setText("Start");
				display.stopTimer();
				resetButton.setEnabled(true);
			}
			else if (event.getActionCommand().equals("Start"))
			{
				startButton.setText("Stop");
				display.startTimer();
			}
			
		}
	}

	private class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			resetButton.setEnabled(false);
			display.resetTimer();
		}
	}
}
