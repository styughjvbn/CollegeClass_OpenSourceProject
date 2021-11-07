package practice.chap8;

import java.io.*;
import java.util.*;

public class practice12 {
	public static void main(String[] args) {
		Vector<String> lineVector = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>>");
		String filename = sc.next();
		try {
			Scanner fScanner = new Scanner(new FileReader(filename));
			while (fScanner.hasNext()) {
				String line = fScanner.nextLine(); // �� ���� �а�
				lineVector.add(line);
			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		while (true) {
			System.out.print("�˻��� �ܾ ����>>");
			String search = sc.next();
			if (search.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			Iterator<String> it = lineVector.iterator();
			while (it.hasNext()) {
				String temp = it.next();
				if (temp.contains(search))
					System.out.println(temp);
			}
		}
		sc.close();
	}
}
