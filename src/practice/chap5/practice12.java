package practice.chap5;

import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}
class Line extends Shape{
	public Line() {
		super();
	}
	public void draw() {
		System.out.println("Line");
	}
}
class Circle extends Shape{
	public Circle() {
		super();
	}
	public void draw() {
		System.out.println("Circle");
	}
}
class Rect extends Shape{
	public Rect() {
		super();
	}
	public void draw() {
		System.out.println("Rect");
	}
}
class GraphicEditor{
	Scanner sc=new Scanner(System.in);
	int menu=0;
	Shape head=null;
	int num=0;
	public void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>");
			menu=sc.nextInt();
			switch(menu) {
				case 1:
					create();
					break;
				case 2:
					delete();
					break;
				case 3:
					print();
					break;
				case 4:
					System.out.println("�����մϴ�.");
					System.exit(0);
				default:
					System.out.println("�߸��� �޴� �Է�");
			}
		}
	}
	private boolean create() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int pick=sc.nextInt();
		Shape tmp=null;
		Shape temp=head;
		switch(pick) {
			case 1:
				tmp=new Line();
				break;
			case 2:
				tmp=new Rect();
				break;
			case 3:
				tmp=new Circle();
				break;
			default:
				System.out.println("�߸��� �޴� �Է�");
				return false;
		}
		if(head==null) {
			head=tmp;
		}
		else {
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(tmp);
		}
		num++;
		return true;
	}
	private void delete() {
		Shape temp=head;
		Shape tmp=null;
		Shape prev=null;
		System.out.print("������ ������ ��ġ>>");
		int pick=sc.nextInt();
		if(pick>num)
			System.out.println("������ �� �����ϴ�.");
		else {
			if(head==null){
				System.out.println("������ ������ �����ϴ�.");
			}
			else {
				for(int i=1;i<pick;i++) {
					prev=temp;
					temp=temp.getNext();
				}
				tmp=temp.getNext();
				prev.setNext(tmp);
			}
		}
		
	}
	private void print() {
		Shape temp=head;
		if(head==null){
			System.out.println("������ �����ϴ�.");
		}
		else {
			while(temp.getNext()!=null) {
				temp.draw();
				temp=temp.getNext();
			}
			temp.draw();
		}
	}
}
public class practice12 {

	public static void main(String[] args) {
		GraphicEditor one1=new GraphicEditor();
		one1.run();

	}

}
