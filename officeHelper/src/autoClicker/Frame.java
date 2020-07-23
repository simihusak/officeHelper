package autoClicker;
import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class Frame {

	static JFrame frame = new JFrame();
  public static void Start() throws InterruptedException {
    
    frame.getContentPane().addMouseListener((MouseListener) new Listen());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setUndecorated(true);
    frame.setBackground(new Color(0, 0, 0, 0.5f));
    frame.setSize(1920, 1080);
    frame.setVisible(true);
  }
  public void Close() {
	  frame.dispose();
  }
}
