package mouseLock;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

import java.awt.event.KeyEvent;

public class Mover extends Thread {
	public boolean check = true;

	public void run() {

		Robot robot;
		try {
			
			robot = new Robot();
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			//int height = screenSize.height;
			int width = screenSize.width;
			
			while (check == true) {
				/*robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);*/

				robot.mouseMove(width, 0);

				robot.keyPress(KeyEvent.VK_ESCAPE);
				Thread.sleep(10);
				robot.keyRelease(KeyEvent.VK_ESCAPE);

			}
		} catch (AWTException | InterruptedException e) {
		}

	}

	public void cancel() {
		check = false;

	}
}
