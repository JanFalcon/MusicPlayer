package com.player.music;

import javax.swing.JFrame;

public class Window {
	
	private JFrame frame;
	
	public Window(Meow meow) {
		AddJFrame();
	}
	
	public void AddJFrame() {
		frame = new JFrame("Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(700, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
