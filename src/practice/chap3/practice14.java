package practice.chap3;
import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score [] = {95,88,76,62,55};
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �̸�>>");
		String s=scanner.next();
		int i=0;
		while(!s.equals("�׸�")) {
			for(i=0;i<5;i++) {
				if(course[i].equals(s)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
			}
			if(i==5)
				System.out.println("���� �����Դϴ�.");
			System.out.print("���� �̸�>>");
			s=scanner.next();
		}

		
		scanner.close();
	}
}
