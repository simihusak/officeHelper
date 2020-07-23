package exchange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {
	
	public JFrame frame;
	
	private JTextField czef= new JTextField("0");
	private JTextField eurf= new JTextField("0");
	private JTextField usdf= new JTextField("0");
	
	public void run() {
		frame = new JFrame("Exchanger");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel cze = new JLabel("CZE: ");
		
		
		JLabel eur = new JLabel("EUR: ");
		
		
		JLabel usd = new JLabel("USD: ");
		
		JButton confirm = new JButton("Confirm");
		
		this.czef.setBounds(30, 10, 260, 30);
		this.eurf.setBounds(30, 50, 260, 30);
		this.usdf.setBounds(30, 95, 260, 30);
		
		confirm.setBounds(50,130,200,50);
		
		cze.setBounds(0, 0, 50, 50);
		eur.setBounds(0, 40, 50, 50);
		usd.setBounds(0, 80, 50, 50);
		
		frame.add(this.czef);
		frame.add(this.eurf);
		frame.add(this.usdf);
		
		frame.add(confirm);
		
		frame.add(cze);
		frame.add(eur);
		frame.add(usd);

		frame.setResizable(true);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		this.czef.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               confirm.doClick();
	            }
	         }
	      });
		this.eurf.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               confirm.doClick();
	            }
	         }
	      });
		this.usdf.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	               confirm.doClick();
	            }
	         }
	      });
		
		confirm.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			
			  getText();
			
		  }
		});
		
		
		
	}
	
	public void getText() {
		String cz = this.czef.getText();
		String eu = this.eurf.getText();
		String us = this.usdf.getText();
		
		double cze = Double.parseDouble(cz);
		double eur = Double.parseDouble(eu);
		double usd = Double.parseDouble(us);
		
		Exchange.calc.run(cze, eur, usd);
				
	}
	
	public void write(double cz, double eu, double us) {
		
		String cze;
		String eur;
		String usd;
		
		if(cz == 0 && eu == 0 && us == 0) {
			cze = "You've set more than one currency";
			eur = "or you didn't set any currency!";
			usd = "Error!";
			
			this.czef.setText(cze);
			this.eurf.setText(eur);
			this.usdf.setText(usd);
			
		} else {
			
			cze = String.valueOf(cz);
			eur = String.valueOf(eu);
			usd = String.valueOf(us);
			
			
			this.czef.setText(cze);
			this.eurf.setText(eur);
			this.usdf.setText(usd);
			
		}
	}
}