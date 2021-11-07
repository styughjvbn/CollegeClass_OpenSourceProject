package practice.chap8;

import java.io.*;
import java.util.*;

public class practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> phone = new HashMap<String, String>();
		try {
			Scanner fScanner = new Scanner(new FileReader("C:\\Temp\\phone.txt"));
			while (fScanner.hasNext()) {
				String line = fScanner.nextLine(); // �� ���� �а�
				String s[] = line.split(" "); // �̸��� ��ȭ��ȣ �и�
				phone.put(s[0], s[1]);
			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		System.out.println("�� " + phone.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
		while (true) {
			System.out.print("�̸�>>");
			String name = sc.next();
			if (name.equals("�׸�"))
				break;
			if (phone.containsKey(name))
				System.out.println(phone.get(name));
			else
				System.out.println("ã�� �̸��� �����ϴ�.");
		}
		sc.close();
	}
}
