package practice.chap2;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("�� (x1,y1)�� (x2,y2)�� �Է��Ͻÿ�>>");
		int x1=scanner.nextInt();
		int x2=scanner.nextInt();
		int y1=scanner.nextInt();
		int y2=scanner.nextInt();
		if(inRect(x1,y1,100,100,200,300)||inRect(x2,y2,100,100,200,300))
			System.out.println("�浹�մϴ�.");
		else if(overRect(x1,y1,x2,y2))
			System.out.println("�浹�մϴ�.");
		else
			System.out.println("�浹�����ʽ��ϴ�.");
		
		
		scanner.close();
	}
	public static boolean inRect(int x, int y, int x1,int y1,int x2,int y2) {
		if(((x>=x1&&x<=x2)&&(y>=y1&&y<=y2)))
				return true;
		else
			return false;
	}
	public static boolean overRect(int x1,int y1,int x2,int y2) {
		if(((x1<=100&&y1<=100)&&(x2>=200&&y2>=200)))
				return true;
		else
			return false;
	}

}
