package practice.chap10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice6 extends JFrame{
	JLabel label; 
	practice6(){
		setTitle("Ŭ�� ������ �������α׷�"); // ���� ����
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		label.setSize(100,50);
		label.setLocation(100,100);
		label.addMouseListener(new MyMouseAdapter());
		// Jabel ������Ʈ ���� �� MouseListener�� �ܴ�.
		
		add(label);
		setSize(500,500);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice6();
	}
	
	class MyMouseAdapter extends MouseAdapter{
		int x,y;
		public void mousePressed(MouseEvent e) {
			x = (int)(Math.random()*400); // ������ ���� ����� ���� 400���� ����
			y = (int)(Math.random()*400); // ������ ���� ����� ���� 400���� ����
			label.setLocation(x,y);
		}
	}
}
