package example.chap4;

public class chap4_ex4 {
	String title;
	String author;
	public chap4_ex4(String t) { // ������
		title = t; author = "���ڹ̻�";
	}
	public chap4_ex4(String t, String a) { // ������
		title = t; author = a;
	}
	public static void main(String [] args) {
		chap4_ex4 littlePrince = new chap4_ex4("�����", "�������丮");
		chap4_ex4 loveStory = new chap4_ex4("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
