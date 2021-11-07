package practice.chap9;

import javax.swing.*;

import java.awt.*;

public class practice2 extends JFrame {
	practice2() {
		setTitle("BorderLayout Practice");
		setSize(400, 200);
		setLayout(new BorderLayout(5, 7));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("East"), BorderLayout.EAST);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice2();
	}
}