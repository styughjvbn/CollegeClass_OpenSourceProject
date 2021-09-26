package practice.chap4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor={"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0;i<5;i++) {
			if(kor[i].equals(word))
				return eng[i];
		}
		System.out.println(word+"는 저의 사전에 없습니다.");
		return "false";
	}
}

public class practice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word;
		String str;
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			word=sc.next();
			if(word.equals("그만"))
				break;
			str=Dictionary.kor2Eng(word);
			if(!str.equals("false"))
				System.out.println(word+"은 "+str);
		}
		sc.close();
	}
	

}
