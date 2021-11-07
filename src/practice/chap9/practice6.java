package practice.chap9;

import javax.swing.*;

import java.awt.*;

import java.util.*;

public class practice6 extends JFrame {

	practice6() {

		setSize(300, 300);

		setTitle("Random Labels");

		Container con = getContentPane();

		setLayout(null);

		for (int i = 0; i < 20; i++) {

			int x = (int) (Math.random() * 200) + 50;

			int y = (int) (Math.random() * 200) + 50;

			JLabel label = new JLabel("");

			label.setOpaque(true);

			label.setBounds(x, y, 10, 10);

			label.setBackground(Color.BLUE);

			add(label);

		}

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new practice6();

	}

}