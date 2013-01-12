package assignment_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class TextStatsPanel extends JPanel 
{
    private JTextArea textArea;
    private JLabel wordCountLabel, wordLengthLabel;
    private JButton calculate;
    
    public int wordCount = 0;
    public double wordLength = 0.0;
    
    public TextStatsPanel() 
    {
    	textArea = new JTextArea(10, 20);
    	wordCountLabel = new JLabel("Number of Words: " + Integer.toString(wordCount));
    	wordLengthLabel = new JLabel("Average Word Length: " + Double.toString(wordLength));
    	
    	WordListener listener = new WordListener();
    	calculate = new JButton("Calculate");
    	calculate.addActionListener(listener);
    	
    	add(textArea);
    	add(wordCountLabel);
    	add(wordLengthLabel);
    	add(calculate);
    	
        setPreferredSize (new Dimension(300, 200));
        setBackground (Color.orange);
    	
    }
    private class WordListener implements ActionListener
    {
       public void actionPerformed (ActionEvent event)
       {
    	   String contents = textArea.getText();
    	   Scanner wordScan = new Scanner(contents);
     	   int totalCharacters = 0;
    	   wordCount = 0;
    	  
           while (wordScan.hasNext())
    	   {
    		   wordCount++;
    		   totalCharacters += wordScan.next().length();
    	   }
    	   if (wordCount > 0)
    		   wordLength = 1.0 * totalCharacters / wordCount;
    	   else
    		   wordLength = 0.0;
    	   
           wordCountLabel.setText ("Number of Words: " + Integer.toString (wordCount));
           wordLengthLabel.setText("Average Word Length: " + Double.toString (wordLength));
       }
    }
}
