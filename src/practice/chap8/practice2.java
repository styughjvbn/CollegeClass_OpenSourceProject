package practice.chap8;

import java.io.*;

public class practice2 {
	public static void main(String[] args) {
		System.out.println("c:\\Temp\\phone.txt�� ����մϴ�.");
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\phone.txt");
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
