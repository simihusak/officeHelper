package autoClicker;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList; // import the ArrayList class

public class AutoClicker {
	
	public static int b;
	public static int c;
	public static int d;
	public static int n;
	
    public static ArrayList<Coord> coords = new ArrayList<Coord>();
    public AutoClicker() {
    	main(null);
    }
	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		userInterface.userInterface();
	}
	public void go(String o, String p, String q, String m) throws InterruptedException {
		b = Integer.parseInt(o);
		c = Integer.parseInt(p);
		d = Integer.parseInt(q);
		n = Integer.parseInt(m);
		if (n == 0) {
			n = 9999999;
		}
		else {
			n = n - 1;
		}
		Frame frame = new Frame();
	    frame.Start();
	}
	public void write(int x, int y) throws InterruptedException {
		if (AutoClicker.coords.size()/2 < b) {
			Coord coord = new Coord(x, y);
			AutoClicker.coords.add(coord);
		}
		if(AutoClicker.coords.size() == b) {
			Frame frame = new Frame();
			frame.Close();
			AutoClicker.sClicking();
		}
	}
	public static void sClicking() throws InterruptedException {
		for (int z = 0; z < c; z++) {
			for(int i = 0; i < b; i++) {
					if (n == i) {
						TimeUnit.SECONDS.sleep(d);
						Click click = new Click();
						click.rightClick(AutoClicker.coords.get(i).x, AutoClicker.coords.get(i).y);
						
					}
					else {
						TimeUnit.SECONDS.sleep(d);
						Click click = new Click();
						click.leftClick(AutoClicker.coords.get(i).x, AutoClicker.coords.get(i).y);
					}
				
			}
		}
		UserInterface userInterface = new UserInterface();
		userInterface.echoDone();
		
	}
}