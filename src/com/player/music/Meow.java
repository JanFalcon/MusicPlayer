package com.player.music;

public class Meow {
	
	Window window;
	
	public Meow(Window window) {
		this.window = window;
		new Window(this);
	}
}
