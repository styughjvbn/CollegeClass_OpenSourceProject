package example.chap4;

public class chap4_ex5 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	public chap4_ex5() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	public chap4_ex5(String title) {
		this("bible", "���ڹ̻�");// - this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���� ������ �˰� �ִµ� ���⼭ title �� "bible"�ΰ��� �³���
	}
	public chap4_ex5(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String [] args) {
		chap4_ex5 littlePrince = new chap4_ex5("�����", "�������丮");
		chap4_ex5 loveStory = new chap4_ex5("������");
		chap4_ex5 emptyBook = new chap4_ex5();
		loveStory.show();
		//bible.show(); - � �� ������ �����ϴ� �ڵ����� �𸣰ڽ��ϴ�
	}
}