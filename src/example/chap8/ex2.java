package example.chap8;

import java.io.*;

public class ex2 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
		fin = new FileInputStream("c:\\Temp\\hangul.txt");
		in = new InputStreamReader(fin, "utf-8");
		int c;
		System.out.println("���ڵ� ���� ������ " + in.getEncoding());
		while ((c = in.read()) != -1) {
		System.out.print((char)c);
		}
		in.close();
		fin.close();
		} catch (IOException e) {
		System.out.println("����� ����");
		}
		}


}