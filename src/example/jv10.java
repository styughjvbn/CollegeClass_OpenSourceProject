package example;
import java.util.Scanner;

public class jv10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		scanner.close();
	}

}