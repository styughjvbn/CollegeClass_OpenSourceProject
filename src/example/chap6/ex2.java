package example.chap6;

class Point1 {
	int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ex2 {
	public static void main(String[] args) {
		Point1 p = new Point1(2, 3);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString() + "�Դϴ�"�� �ڵ� ��ȯ
	}
}