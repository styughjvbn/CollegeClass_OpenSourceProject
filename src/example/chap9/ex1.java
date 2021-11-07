package example.chap9;

import javax.swing.*;

public class ex1 extends JFrame {
	public ex1() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}

	public static void main(String[] args) {
		ex1 frame = new ex1();
	}
}