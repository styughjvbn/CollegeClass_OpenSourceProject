package practice.chap4;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x,double y, int radius) {
		this.x=x;this.y=y;this.radius=radius;
	}
	public void show() {
		System.out.printf("(%.1f,%.1f)%d\n",x,y,radius);
	}
	double area(){
		
		return 3.14*radius*radius;
	}
}

public class practice6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Circle c[]=new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double num1=scanner.nextDouble();
			double num2=scanner.nextDouble();
			int num3=scanner.nextInt();
			c[i]=new Circle(num1,num2,num3);
		}
		scanner.close();
		double area[]= {c[0].area(),c[1].area(),c[2].area()};
		int max=0;
		if(area[1]>area[max])max=1;
		if(area[2]>area[max])max=2;
		System.out.print("가장 면적이 큰 원은 ");
		c[max].show();
		
	}

}
