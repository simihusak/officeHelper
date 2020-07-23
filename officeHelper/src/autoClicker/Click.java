package autoClicker;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Click {


	public void leftClick(int x, int y) {
		
		try {
			Robot bot = new Robot(); 
			bot.mouseMove(x, y); 
			bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	    
	}
	@SuppressWarnings("deprecation")
	public void rightClick(int x, int y) {
		try {
			Robot bot = new Robot();
			bot.mouseMove(x, y);
			bot.mousePress(InputEvent.BUTTON3_MASK);
			bot.mouseRelease(InputEvent.BUTTON3_MASK);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}

}
