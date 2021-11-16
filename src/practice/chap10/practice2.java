package practice.chap10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//����Ʈ���� ������ �ʷϻ����� �ϰ� ���콺�� �巡���ϴ� ���ȸ� ��������� �����ϴ� ���� ���� ���α׷��� �ۼ��϶�.
public class practice2 extends JFrame{
	JPanel contentPane = new JPanel(); // ����Ʈ������ ����� �г�
	practice2(){
		setTitle("�巡�뵿�� YELLO"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		// JPanel�� MouseMotionListener �߰�
		contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
		// JPanel�� MouseListener �߰�
		contentPane.addMouseListener(new MyMouseAdapter2());
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice2();
	}
	//MouseMotionAdapter�� ��� �޴� MyMouseMotionAdapter Ŭ����
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			// ���콺�� �巡�׵Ǵ� ����
			contentPane.setBackground(Color.YELLOW);
		}
	}
	//MouseAdapter�� ��� �޴� MyMouseAdapter2 Ŭ����
	class MyMouseAdapter2 extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			// ������ ���콺 ��ư�� ������ ��
			contentPane.setBackground(Color.GREEN);
		}
	}
}