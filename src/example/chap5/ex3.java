package example.chap5;

class Point_ {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public Point_() {
		this.x = this.y = 0;
	}
	public Point_(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}
class ColorPoint_ extends Point_ {
	private String color; // ���� ��
	public ColorPoint_(int x, int y, String color) {
		super(x,y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}
public class ex3 {

	public static void main(String[] args) {
		ColorPoint_ cp = new ColorPoint_(5, 6, "blue");
		cp.showColorPoint();
	}

}
