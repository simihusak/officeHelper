package autoClicker;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
public class UserInterface {
    public static String b;
    public static String c;
    public static String d;
    public static String m;
   public static void userInterface() {
      JFrame frame = new JFrame("Autoclicker - by �imon Hus�k");
      JPanel panel = new JPanel();
      
      frame.getContentPane();
      
      JLabel label0 = new JLabel("!!!CLICS ENTER ONLY IN FULLSCREEN!!!");
      JLabel label = new JLabel("How many clicks?");
      JLabel label2 = new JLabel("How many repetitions?");
      JLabel label3 = new JLabel("Time gab between clicks in seconds");
      JLabel label4 = new JLabel("Which click will be right?");
      
      JTextField textField1 = new JTextField();
      textField1.setBounds(30, 50, 50, 30);
      
      JTextField textField2 = new JTextField();
      textField2.setBounds(240, 50, 50, 30);
      
      JTextField textField3 = new JTextField();
      textField3.setBounds(470, 50, 50, 30);
      
      JTextField textField4 = new JTextField();
      textField4.setBounds(240, 150, 50, 30);
      
      Dimension size0 = label0.getPreferredSize();
      label0.setBounds(200, 10, 400, size0.height);
      
      Dimension size = label.getPreferredSize();
      label.setBounds(10, 30, size.width, size.height);
      
      Dimension size2 = label2.getPreferredSize();
      label2.setBounds(200, 30, 200, size.height);
      
      Dimension size3 = label3.getPreferredSize();
      label3.setBounds(400, 30, 250, size.height);
      
      Dimension size4 = label4.getPreferredSize();
      label4.setBounds(180, 130, 250, size.height);
      
      JButton button = new JButton("Start");
		button.setBounds(220,200,100, 50); 
		
		
		
		
		textField1.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               button.doClick();
	            }
	         }
	      });
		textField2.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               button.doClick();
	            }
	         }
	      });
		textField3.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               button.doClick();
	            }
	         }
	      });
		textField4.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               button.doClick();
	            }
	         }
	      });
		button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			
			b = textField1.getText();
			c = textField2.getText();
			d = textField3.getText();
			m = textField4.getText();
			AutoClicker main = new AutoClicker();
			frame.dispose();
			try {
				main.go(b, c, d, m);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		  }
		});
      
      
      panel.setLayout(null);
      panel.add(label0);
      panel.add(label);
      panel.add(label2);
      panel.add(label3);
      panel.add(label4);
      
      panel.add(textField1);
      panel.add(textField2);
      panel.add(textField3);
      panel.add(textField4);
      panel.add(button);
      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(630, 300);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
   }
   public static void echoDone() {
	   JFrame frame = new JFrame("Autoclicker - by �imon Hus�k");
	   JLabel label = new JLabel("Clicking done");
	   frame.setSize(50, 70);
	   frame.add(label);
	      frame.setVisible(true);
	      frame.setResizable(false);
	      frame.setLocationRelativeTo(null);
   }
}
