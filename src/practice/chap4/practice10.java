package practice.chap4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor={"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0;i<5;i++) {
			if(kor[i].equals(word))
				return eng[i];
		}
		System.out.println(word+"�� ���� ������ �����ϴ�.");
		return "false";
	}
}

public class practice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word;
		String str;
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word=sc.next();
			if(word.equals("�׸�"))
				break;
			str=Dictionary.kor2Eng(word);
			if(!str.equals("false"))
				System.out.println(word+"�� "+str);
		}
		sc.close();
	}
	

}
