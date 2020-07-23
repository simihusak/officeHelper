package autoClicker;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Listen extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		  AutoClicker main = new AutoClicker();
		  try {
			main.write(e.getX(), e.getY());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}
		/*public void keyPressed(KeyEvent g) {
			System.out.println("Key pressed code=" + g.getKeyCode() + ", char=" + g.getKeyChar());
		}*/

}
