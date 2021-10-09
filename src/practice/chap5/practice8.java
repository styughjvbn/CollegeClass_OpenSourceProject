package practice.chap5;

class PositivePoint extends Point{
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int num1, int num2) {
		super(0,0);
		move(num1,num2);
	}
	protected void move(int num1, int num2) {
		if(num1>=0&&num2>=0)
			super.move(num1, num2);
	}
	public String toString() {
		String temp="("+super.getX()+", "+super.getY()+")�� ��";
		return temp;
	}
}
public class practice8 {

	public static void main(String[] args) {
		PositivePoint p= new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"�Դϴ�.");
	}
}
