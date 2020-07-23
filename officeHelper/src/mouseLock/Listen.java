package mouseLock;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listen implements KeyListener {
	private Mover mover = null;
	public boolean can = true;

	@Override
	public void keyPressed(KeyEvent e) {
		if (can == true) {
			if (e.getID() == KeyEvent.KEY_PRESSED && e.getModifiers() == KeyEvent.CTRL_MASK
					&& e.getKeyCode() == KeyEvent.VK_O) {

				if (mover == null) {
					this.mover = new Mover();
					Thread thread = new Thread(this.mover);
					thread.start();
				}

			} else if (e.getID() == KeyEvent.KEY_PRESSED && e.getModifiers() == KeyEvent.CTRL_MASK
					&& e.getKeyCode() == KeyEvent.VK_P) {
				if (mover != null) {
					MouseLock.frame.canClose();
					this.mover.cancel();
					this.mover = null;
				}
			} else if (e.getID() == KeyEvent.KEY_PRESSED && e.getModifiers() == KeyEvent.CTRL_MASK
					&& e.getKeyCode() == KeyEvent.VK_I
					|| e.getID() == KeyEvent.KEY_PRESSED && e.getModifiers() == KeyEvent.CTRL_MASK
							&& e.getKeyCode() == KeyEvent.VK_K || e.getID() == KeyEvent.KEY_PRESSED && e.getModifiers() == KeyEvent.CTRL_MASK
							&& e.getKeyCode() == KeyEvent.VK_L) {
				try {
					MouseLock.frame.add();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void sleep() {
		can = false;
	}

	public void back() {
		can = true;
	}

}
