package practice.chap6;

import java.util.Scanner;
class Person2 {
	private int num1, num2, num3;
	public String name;
	public Person2(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1 == num2 && num2 == num3)
			return true;
		else 
			return false;
	}
}
public class practice12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int num = sc.nextInt();
		Person2[] person = new Person2[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name = sc.next();
			person[i] = new Person2(name);
		}
		String buffer = sc.nextLine();
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(person[i].game()) {
					System.out.println(person[i].name+"���� �̰���ϴ�!");
					sc.close();
					return;
				}
				System.out.println("�ƽ�����!");
			}
		}
	}
}
