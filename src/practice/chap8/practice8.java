package practice.chap8;

import java.io.File;

public class practice8 {
	public static void main(String[] args) {
		File f = new File("C:\\");
		File[] subFiles = f.listFiles();
		long max = 0;
		String name = "";
		for (int i = 0; i < subFiles.length; i++) {
			File temp = subFiles[i];
			if (max < temp.length()) {
				max = temp.length();
				name = temp.getName();
			}
		}
		System.out.println("���� ū ������ " + name + " " + max + "����Ʈ");
	}
}
