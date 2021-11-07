package practice.chap9;

import javax.swing.*;

import java.awt.*;

import java.util.*;

public class practice4 extends JFrame {

	practice4() {

		setSize(500, 200);

		setTitle("Ten Buttons Frame");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 10));

		Color color;

		for (Integer i = 0; i < 10; i++) {

			Component comp = add(new JButton(i.toString()));

			Random ran = new Random();

			int r = ran.nextInt(256);

			int g = ran.nextInt(256);

			int b = ran.nextInt(256);

			color = new Color(r, g, b);

			comp.setBackground(color);

		}

		setVisible(true);

	}

	public static void main(String[] args) {

		new practice4();

	}

}