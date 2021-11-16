package example.chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex3 extends JFrame {
	public ex3() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex3();
	}
}