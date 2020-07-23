package spammer;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class Coords {

	public int[] get() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		int[] cods = {x, y};
		return(cods);
	}

}
