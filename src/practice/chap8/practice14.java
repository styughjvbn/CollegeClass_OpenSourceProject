package practice.chap8;

import java.util.*;
import java.io.File;

public class practice14 {
	public static void main(String[] args) {
		System.out.println("****���� Ž�����Դϴ�****");
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\");
		while (true) {
			File subFiles[] = file.listFiles();
			System.out.println("[" + file.getPath() + "]");
			for (int i = 0; i < subFiles.length; i++) {
				String res = "";
				File f = subFiles[i];
				if (f.isFile())
					res = "file";
				else if (f.isDirectory())
					res = "dir";
				System.out.print(res + "\t");
				System.out.printf("%-10s����Ʈ\t\t", f.length());
				System.out.printf("%s\n", f.getName().trim());
			}
			System.out.print(">>");
			String dir = sc.nextLine();
			try {
				StringTokenizer st = new StringTokenizer(dir);
				String newDir = file.getPath();
				if (st.countTokens() == 1) {
					if (dir.equals("�׸�"))
						break;
					if (dir.equals(".."))
						newDir = file.getParent(); // ���� ���丮�� �̵�
					else
						newDir = file.getPath().concat("\\" + dir); // ���� ���丮�� �̵�
				} else {
					String operation = st.nextToken();
					String name = st.nextToken();
					if (operation.equals("mkdir")) {
						File f = new File(file.getPath().concat("\\" + name));
						f.mkdir();
						System.out.println(name + "���丮�� �����߽��ϴ�.");
					}
					else if (operation.equals("rename")) {
						String dest = st.nextToken();
						File f = new File(file.getPath().concat("\\" + name));
						f.renameTo(new File(file.getPath().concat("\\" + dest)));
						System.out.println("���ϸ��� �����߽��ϴ�.");
					}
				}
				file = new File(newDir);
			} catch (NoSuchElementException e) {
				System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�!");
			}
		}
		sc.close();
	}
}
