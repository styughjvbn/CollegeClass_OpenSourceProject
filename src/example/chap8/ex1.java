package example.chap8;

import java.io.*;

public class ex1 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) { // �� ���ھ� ���� ������ �б�
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}