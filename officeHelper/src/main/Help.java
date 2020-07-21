package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Help {

	public void run() {
		JFrame help = new JFrame("Help");
		
		JLabel text = new JLabel("ahojky", SwingConstants.CENTER);
		
		help.add(text);
		
		help.setResizable(false);
		help.setSize(150, 150);
		help.setLocationRelativeTo(null);
		help.setVisible(true);
		
		help.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		        Main.frame.helpchek();
		    }
		});
	}

}
