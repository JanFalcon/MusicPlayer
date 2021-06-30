package com.player.music;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	private JFrame frame;
	private JPanel panel;
	
	public Window() {
		frame = new JFrame("Music Player");
		AddJPanel();
		AddJFrame();
	}
	
	public void AddJPanel() {
		panel = new JPanel();
		panel.setBackground(Color.black);
		frame.add(panel);
		
	}
	
	public void AddJFrame() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(700, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
