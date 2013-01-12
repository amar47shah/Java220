package assignment_04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HousePanel extends JPanel {

	private final int NUM_SLATS = 12, SLAT_WIDTH = 5, SLAT_GAP = 15;
	
	
	public HousePanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(500, 300));
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		// Grass
		page.setColor(Color.GREEN);
		page.fillRect(0, 250, 500, 50);
		
		// Main House
		page.setColor(Color.WHITE);
		page.fillRect(225, 150, 100, 100);
		
		// Door
		page.setColor(Color.RED);
		page.fillRect(275, 210, 30, 40);
		
		// Windows
		page.setColor(Color.GRAY);
		for (int x = 235; x < 310; x += 30)
			page.fillRect(x, 170, 20, 20);
		page.fillRect(235, 210, 20, 30);
		
		// Roof
		page.setColor(Color.RED);
		int[] x = {225, 275, 325};
		int[] y = {150, 100, 150};
		page.fillPolygon(x, y, 3);
		
		// Fence
		page.setColor(Color.DARK_GRAY);
		for (int i = 0; i < NUM_SLATS; i++) {
			page.fillRect(142 + i * (SLAT_WIDTH + SLAT_GAP), 220, SLAT_WIDTH, 30);
		}
		page.fillRect(142, 226, (NUM_SLATS - 1) * (SLAT_WIDTH + SLAT_GAP), 6);
		page.fillRect(142, 238, (NUM_SLATS - 1) * (SLAT_WIDTH + SLAT_GAP), 6);		
	}

}
