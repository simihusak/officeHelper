package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import autoClicker.AutoClicker;
import exchange.Exchange;
import mouseLock.MouseLock;
import randomFile.RandomFile;
import spammer.Spammer;

public class Frame {
	public JFrame frame = new JFrame("Office helper");;
	public static Help jhelp = new Help();
	public boolean helpcheck = true;
	public void run() {
		
		GridLayout layout = new GridLayout(3,2);
		
		frame.setLayout(layout);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton autoClicker = new JButton("Auto clicker");
		JButton exchange = new JButton("Exchanger");
		JButton lockMouse = new JButton("Mouse locker");
		JButton randomFile = new JButton("Random file picker");
		JButton spammer = new JButton("Spammer");
		JButton help = new JButton("Help");
		
		frame.add(autoClicker);
		frame.add(exchange);
		frame.add(lockMouse);
		frame.add(randomFile);
		frame.add(spammer);
		frame.add(help);
		
		frame.setResizable(false);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		autoClicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AutoClicker();
			}
		});
		
		exchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Exchange();
			}
		});
		
		lockMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MouseLock();
			}
		});
		randomFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RandomFile();
			}
		});
		
		spammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Spammer();
			}
		});
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(helpcheck == true) {
					jhelp.run();
					helpcheck = false;
				}
			}
		});
		
	}
	public void helpchek() {
		helpcheck = true;
	}
	

}
