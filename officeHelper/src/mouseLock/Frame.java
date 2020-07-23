package mouseLock;


import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {
	public JFrame frame;
	public JLabel textLabel2 = new JLabel();
	public void draw() {
		frame = new JFrame("Mouse lock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel textLabel = new JLabel("You know what to do :)");
		textLabel.setHorizontalAlignment(JLabel.CENTER);

		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.add(textLabel);

		frame.setResizable(false);
		frame.setSize(250, 50);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public void add() throws InterruptedException {
		frame.setSize(250, 100);
		textLabel2.setText("Program is on cooldown (10s)");
		textLabel2.setHorizontalAlignment(JLabel.CENTER);
		frame.add(textLabel2);
		
		Timer timer = new Timer();
		MouseLock.listen.sleep();
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
				MouseLock.listen.back();
			    back();
			  }
			}, 10000);
		
	}
	public void back() {
		textLabel2.setText(null);
		frame.setSize(250, 50);
	}
	public void canClose() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
