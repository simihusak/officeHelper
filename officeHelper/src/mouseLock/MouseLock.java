package mouseLock;

import java.awt.event.KeyListener;

public class MouseLock {
	public static Frame frame = new Frame();
	public static Listen listen = new Listen();
	public MouseLock() {
		frame.draw();
			
		
		frame.frame.addKeyListener((KeyListener) listen);
	}
	
}
