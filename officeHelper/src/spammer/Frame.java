package spammer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Frame {
	static JTextField textField2 = new JTextField();
	static JTextField textField1 = new JTextField();

	public void run() {

		JFrame frame = new JFrame("Spammer");
		JPanel panel = new JPanel();

		frame.getContentPane();

		JLabel label = new JLabel("Spam text: ");
		JLabel label2 = new JLabel("How many repetitions? ");
		JLabel label3 = new JLabel("Press ENTER to start!");

		JTextField textField1 = new JTextField();
		textField1.setBounds(30, 50, 150, 30);

		textField2.setBounds(240, 50, 50, 30);

		Dimension size = label.getPreferredSize();
		label.setBounds(70, 30, size.width, size.height);

		label2.setBounds(200, 30, 200, size.height);

		label3.setBounds(100, 100, 250, size.height);

		textField1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				StringSelection stringSelection = new StringSelection(textField1.getText());
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					pressed();
				}
			}
		});
		textField2.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					StringSelection stringSelection = new StringSelection(textField1.getText());
					Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
					clpbrd.setContents(stringSelection, null);
					pressed();
				}
			}
		});

		panel.setLayout(null);

		panel.add(label);
		panel.add(label2);
		panel.add(label3);

		panel.add(textField1);
		panel.add(textField2);

		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

	}

	public static void pressed() {
		try {

			Thread.sleep(3000);

			Coords cords = new Coords();
			int[] cods = cords.get();

			String repes = textField2.getText();
			int reps = Integer.parseInt(repes);

			Spam spam = new Spam();
			spam.run(cods[0], cods[1], reps);
		} catch (Exception e1) {

		}
	}
}
