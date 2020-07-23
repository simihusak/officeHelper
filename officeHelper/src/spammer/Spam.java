package spammer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Spam {

	public void run(int x, int y, int reps) throws InterruptedException {
		
		try {
			Robot robot = new Robot();
			int z = 0;
			while(z < reps) {
				robot.mouseMove(x, y);
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
				robot.keyPress(KeyEvent.VK_CONTROL);
				
				Thread.sleep(100);
				
				robot.keyPress(KeyEvent.VK_V);
				
				Thread.sleep(10);
				
				robot.keyRelease(KeyEvent.VK_V);
				
				Thread.sleep(10);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				Thread.sleep(100);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				
				Thread.sleep(10);
				
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(500);
				
				z++;
			}
			
		} catch (AWTException e) {
			
		}
		
		
	}

}
