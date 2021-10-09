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
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
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
					System.out.println("종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못된 메뉴 입력");
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
				System.out.println("잘못된 메뉴 입력");
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
		System.out.print("삭제할 도형의 위치>>");
		int pick=sc.nextInt();
		if(pick>num)
			System.out.println("삭제할 수 없습니다.");
		else {
			if(head==null){
				System.out.println("삭제할 도형이 없습니다.");
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
			System.out.println("도형이 없습니다.");
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
