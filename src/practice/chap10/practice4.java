package practice.chap10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice4 extends JFrame{

	JLabel label; 
	String text = "Love Java";
	practice4(){
		setTitle("Left Ű�� ���ڿ� �ٲٱ� ����"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		
		// Jabel ������Ʈ ���� �� KeyListener�� �ܴ�.
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice4();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) { // �Է¹��� �ڵ尡
				case KeyEvent.VK_LEFT: //<Left> Ű �϶�
					label.setText(text); // text ��ĭ�� ������ ���
					text = text.substring(1)+text.substring(0, 1);
					break;
				default:
					break;
			}
		}
	}

}