package practice.chap4;

import java.util.Scanner;

class Grade{
	private int math;
	private int science;
	private int english;
	
	Grade(int num1,int num2,int num3){
		math=num1;
		science=num2;
		english=num3;
	}
	public int average() {
		return (math+science+english)/3;
	}
}
public class practice2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� "+me.average());
		
		scanner.close();
	}

}
