package practice.chap5;

interface Shape1{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}
class Circle1 implements Shape1{
	int radius;
	public Circle1(int num) {
		radius=num;
	}
	public void draw() {
		System.out.println("�������� "+ radius+"�� ���Դϴ�.");
	}
	public double getArea() {
		return (double)radius*(double)radius*PI;
	}
}
class Rect1 implements Shape1{
	int w,h;
	public Rect1(int num1,int num2) {
		w=num1;
		h=num2;
	}
	public void draw() {
		System.out.println(w+"x"+h+"ũ���� �簢���Դϴ�.");
	}
	public double getArea() {
		return (double)w*(double)h;
	}
}
class Oval implements Shape1 {
	private int a, b;
	public Oval(int a, int b) {
		this.a  = a;
	    this.b = b;
	}
	public void draw() {
	    System.out.println(a+"x"+b+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea() {
	    return PI*a*b;
	}
}
public class practice14 {

	public static void main(String[] args) {
		Shape1 [] list = new Shape1[3];
		list[0]=new Circle1(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect1(10,40);
		
		for(int i=0;i<list.length;i++)list[i].redraw();
		for(int i=0;i<list.hashCode();i++)System.out.println("������ "+ list[i].getArea());

	}

}
