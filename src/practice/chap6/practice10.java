package practice.chap6;

import java.util.Scanner;
class Person1 {
	private int num1, num2, num3;
	public String name;
	public Person1(String name) {
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
public class practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1��° ���� �̸�>>");
		String name = sc.next();
		Person1 person1 = new Person1(name);
		System.out.print("2��° ���� �̸�>>");
		name =sc.next();
		Person1 person2 = new Person1(name);
		String buffer = sc.nextLine();
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
		}
		sc.close();
	}
}