package practice.chap5;

class Point{
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) { this.x=x; this.y=y;}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0, 0);
		color="Black";
	}
	public ColorPoint(int num1,int num2) {
		super(num1, num2);
		color="Black";
	}
	public String toString() {
		String temp=color+"색의 ("+super.getX()+", "+super.getY()+")의 점";
		return temp;
	}
	public void setColor(String str) {
		color=str;
	}
	public void setXY(int num1,int num2) {
		super.move(num1, num2);
	}
}
public class practice6 {

	public static void main(String[] args) {
		ColorPoint zeroPoint=new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cp=new ColorPoint(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
		

	}

}
