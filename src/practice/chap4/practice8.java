package practice.chap4;

import java.util.Scanner;

class Phone{
	String name, tel;
	Phone(String str1,String str2){
		name=str1;
		tel=str2;
	}
}
public class practice8 {

	public static void main(String[] args) {
		String search;
		boolean is_search;
		Scanner scanner=new Scanner(System.in);
		System.out.print("�ο���>>");
		int num=scanner.nextInt();
		Phone p[]=new Phone[num];
		for(int i=0;i<p.length;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			p[i]=new Phone(scanner.next(),scanner.next());
		}
		System.out.println("����Ǿ����ϴ�....");

		while(true){
			int i;
			System.out.print("�˻��� �̸�>>");
			search=scanner.next();
			is_search=false;
			if(search.equals("�׸�"))
				break;
			for(i=0;i<p.length;i++) 
				if(p[i].name.equals(search)){
					is_search=true;
					System.out.println(p[i].name+"�� ��ȣ�� "+p[i].tel+"�Դϴ�");
				}
					
			if(!is_search)
				System.out.println(search+"�� �����ϴ�.");
		}
		scanner.close();
		
	}

}
