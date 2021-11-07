package practice.chap8;

import java.io.*;
import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream src = null;
		FileInputStream dst = null;
		FileOutputStream app = null;
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù ��° ���� �̸��� �Է��ϼ���>>");
		String first = sc.next();
		System.out.print("�� ��° ���� �̸��� �Է��ϼ���>>");
		String second = sc.next();
		try {
			src = new FileInputStream(first);
			dst = new FileInputStream(second);
			app = new FileOutputStream("append.txt");
			byte[] buf = new byte[1024 * 10];
			byte[] buf2 = new byte[1024 * 10];
			while (true) {
				int n = src.read(buf);
				app.write(buf, 0, n);
				if (n < buf.length)
					break; // ���� ũ�⺸�� ���� -> ���� ��
			}
			while (true) {
				int n = dst.read(buf2);
				app.write(buf2, 0, n);
				if (n < buf2.length)
					break;
			}
			src.close();
			dst.close();
			app.close();
			System.out.println("������Ʈ ���� �ؿ� append.txt. ���Ͽ� �����߽��ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		sc.close();
	}
}
