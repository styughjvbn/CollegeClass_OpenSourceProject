package practice.chap4;

class Rectangle{
	private int x,y,width,height;
	Rectangle(int num1,int num2,int num3, int num4){
		x=num1;y=num2;width=num3;height=num4;
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.printf("(%d,%d)���� ũ�Ⱑ %dx%d�� �簢��\n",x,y,width,height);
	}
	boolean contains(Rectangle r) {
		return (r.x>x&&r.x+r.width<x+width)&&(r.y>y&&r.y+r.width<y+width);
	}
}

public class practice4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r))System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))System.out.println("t�� s�� �����մϴ�.");
	}

}
