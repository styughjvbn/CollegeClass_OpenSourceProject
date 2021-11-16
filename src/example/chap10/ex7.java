package example.chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex7 extends JFrame {
	private JLabel la = new JLabel();

	public ex7() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			if (e.getKeyChar() == '%')
				getContentPane().setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				getContentPane().setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new ex7();
	}
}