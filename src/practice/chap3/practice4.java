package practice.chap3;
import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >>");
		String s=scanner.next();
		char c= s.charAt(0);

		int num=(int)c-96;

		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.printf("%c",(char)(97+j));
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
