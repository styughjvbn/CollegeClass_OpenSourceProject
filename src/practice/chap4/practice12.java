package practice.chap4;

import java.util.Scanner;

class seat{
	String name;
	boolean is_full;
	seat(){
		name="";
		is_full=false;
	}
}
class Reservation{
	seat res[][]=new seat[3][10];
	Scanner sc1=new Scanner(System.in);
	
	Reservation() {
		for(int i=0;i<res.length;i++)
			for(int j=0;j<res[i].length;j++)
				res[i][j]=new seat();
	}
	static void menu() {
		System.out.print("����:1, ��ȸ:2, ���:3, ������:4>> ");
	}
	boolean cancle() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int i=sc1.nextInt();
		if(i==1)
			System.out.print("S>>");
		else if (i==2)
			System.out.print("A>>");
		else
			System.out.print("B>>");
		for(int j=0;j<10;j++) {
			if(!res[i-1][j].is_full)
				System.out.print(" �ѤѤ� ");
			else
				System.out.print(" "+res[i-1][j].name+" ");
		}
		System.out.println();
		System.out.print("�̸�>>");
		String name=sc1.next();
		for(int k=0;k<res[i-1].length;k++) {
			if(res[i-1][k].name.equals(name)) {
				res[i-1][k].name="";
				res[i-1][k].is_full=false;
				return true;
			}
		}
		return false;
	}
	void choice() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int i=sc1.nextInt();
		if(i==1)
			System.out.print("S>>");
		else if (i==2)
			System.out.print("A>>");
		else
			System.out.print("B>>");
		for(int j=0;j<10;j++) {
			if(!res[i-1][j].is_full)
				System.out.print(" �ѤѤ� ");
			else
				System.out.print(" "+res[i-1][j].name+" ");
		}
		System.out.println();
		System.out.print("�̸�>>");
		String name=sc1.next();
		System.out.print("��ȣ>>");
		int num=sc1.nextInt();
		if(num>10||num<1||res[i-1][num-1].is_full)
			System.out.println("���� �¼��̰ų� �¼��� �̹� ����Ǿ��ֽ��ϴ�.");
		else {
			res[i-1][num-1].name=name;
			res[i-1][num-1].is_full=true;
		}
	}
	void show() {
		System.out.print("S>>");
		for(int j=0;j<10;j++) {
			if(!res[0][j].is_full)
				System.out.print(" �ѤѤ� ");
			else
				System.out.print(" "+res[0][j].name+" ");
		}
		System.out.printf("\nA>>");
		for(int j=0;j<10;j++) {
			if(!res[1][j].is_full)
				System.out.print(" �ѤѤ� ");
			else
				System.out.print(" "+res[1][j].name+" ");
		}
		System.out.printf("\nB>>");
		for(int j=0;j<10;j++) {
			if(!res[2][j].is_full)
				System.out.print(" �ѤѤ� ");
			else
				System.out.print(" "+res[2][j].name+" ");
		}
		System.out.println();
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>");
	}
}

public class practice12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int menu;
		Reservation oper=new Reservation();
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true) {
			Reservation.menu();
			menu=sc.nextInt();
			switch(menu) {
				case 1:
					oper.choice();
					break;
				case 2:
					oper.show();
					break;
				case 3:
					if(!oper.cancle())
						System.out.println("�ش�Ǵ� �̸��� �����ϴ�.");
					break;
				case 4:
					sc.close();
					System.exit(0);
				default:
					System.out.println("���� �޴��Դϴ�.");
					break;
			}	
		}
		
	}
}
