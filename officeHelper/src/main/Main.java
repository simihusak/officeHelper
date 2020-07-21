package main;

public class Main {
	public static Frame frame = new Frame();
	public static void main(String[] args) {
		
		Listener listen = new Listener();
		frame.frame.addKeyListener(listen);
		
		frame.run();
	}

}
