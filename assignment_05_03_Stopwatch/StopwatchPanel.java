package assignment_05_03_Stopwatch;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.text.DecimalFormat;

public class StopwatchPanel extends JPanel 
{
	private final int DELAY = 10;
	
	private boolean	freshStart = true;
	private JLabel		timeLabel;
	private Timer      timer;
	//start and stop are System millisec readings 
	private long       start, stop;
	//pause = the accumulated millisecs that the stopwatch is paused
	private long       pause = 0; 

	public StopwatchPanel()
	{
		super();
		
		timer = new Timer(DELAY, new TimeListener());
		timeLabel = new JLabel("00:00:00.00");
		timeLabel.setForeground(Color.white);
		
		setBackground(Color.black);
		add(timeLabel);
	}
	
	public void startTimer()
	{
		if (freshStart) 
			start = System.currentTimeMillis();
		else
			pause += System.currentTimeMillis() - stop;
		timer.start();
	}
	
	public void stopTimer()
	{
		freshStart = false;
		stop = System.currentTimeMillis();
		timer.stop();
	}
		
	public void resetTimer()
	{
		freshStart = true;
		pause = 0;
		timeLabel.setText("00:00:00.00");
	}
	
	private class TimeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			DecimalFormat fmt = new DecimalFormat("#00.###");
			
			int milli = (int)(System.currentTimeMillis()-start-pause);
			int seconds = milli/1000;
			int days = seconds / 86400;
			
			int hours = (seconds / 3600) - (days * 24);
			int min = (seconds / 60) - (days * 1440) - (hours * 60);
			int sec = seconds % 60;
			int dec = (milli%1000) / 10;
			
			String str = new String(""+fmt.format(hours)+":" +fmt.format(min)+ ":"+fmt.format(sec)+"."+fmt.format(dec));
			timeLabel.setText(str);
		}
	}
}
