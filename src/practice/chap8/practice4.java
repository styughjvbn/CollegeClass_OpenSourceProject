package practice.chap8;

import java.io.*;
import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		System.out.println("c:\\windows\\system.ini�� �о� ����մϴ�.");
		FileReader fin = null;
		int i = 1; // �� ��ȣ
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			Scanner fScanner = new Scanner(fin);
			while (fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%2d: ", i);
				System.out.println(line);
				i++;
			}
			fin.close();
			fScanner.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
