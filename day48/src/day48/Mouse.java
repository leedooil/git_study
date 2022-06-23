package day48;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse extends JFrame {
	JPanel Jp = new JPanel();
	JLabel la;

	Mouse() {
		setTitle("mouse 이벤트 창");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Jp);
		Jp.addMouseListener(new MouseListener1());
		Jp.addMouseMotionListener(new MouseListener1());
		la = new JLabel("마우스를 올려보세요!");
		Jp.add(la);
		setSize(300, 300);
		setVisible(true);
	}

	class MouseListener1 implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("마우스 클릭횟수: " + e.getClickCount());
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.red);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel) e.getSource();
			p.setBackground(Color.yellow);

		}
	}

	public static void main(String[] args) {
		new Mouse();
	}

}
