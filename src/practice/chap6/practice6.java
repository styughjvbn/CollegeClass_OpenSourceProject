package practice.chap6;
import java.util.Scanner;
import java.util.Calendar;
class Person {
	Calendar now = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	private String name, buffer;
	private int sec1, sec2;
	
	public Person(String name) {
		this.name = name;
	}
	
	public int game() {
		System.out.print(name+" ���� <Enter>Ű  >>");
		sec1 = enter();
		System.out.print("10�� ���� �� <Enter>Ű  >>");
		sec2 = enter();
		if(sec1 < sec2)
			return sec2-sec1;
		else 
			return (60-sec1) + sec2;
	}
	
	public int enter() {
		buffer = sc.nextLine();
		now = Calendar.getInstance();		
		System.out.println("\t���� �� �ð� = "+ now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
}
public class practice6 {
	public static void main(String[] args) {
		Person person1 = new Person("Ȳ����");
		Person person2 = new Person("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1 = person1.game();
		int result2 = person2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� ���繮");
	}
}