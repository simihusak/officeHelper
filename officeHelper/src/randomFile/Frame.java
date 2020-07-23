package randomFile;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame {

	
	
	public static void jWindow(){
		JFrame frame = new JFrame("Random file");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("Folder path: ");
		textLabel.setBounds(20, 10, 50, 50);
		textLabel.setHorizontalAlignment(JLabel.LEFT);
		
		JTextField textField = new JTextField();
		textField.setBounds(80, 15, 210, 40); 
		
		
		
		JButton button = new JButton("Run random");
		button.setBounds(300,15,130, 40); 
		
		
		
		button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			String path = textField.getText();
			Process process = new Process();
			process.run(path);
		  }
		});
		
		
		
		textField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               button.doClick();
	            }
	         }
	      });
		
		
		
		frame.add(button);
		frame.add(textField);
		frame.add(textLabel);
		
		frame.setResizable(false);
		frame.setSize(450, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
		
		
	}
	

}
