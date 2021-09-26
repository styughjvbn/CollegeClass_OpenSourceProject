package example.chap4;

public class chap4_ex5 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	public chap4_ex5() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public chap4_ex5(String title) {
		this("bible", "작자미상");// - this()는 같은 클래스의 다른 생성자를 호출할 때 쓰는 것으로 알고 있는데 여기서 title 이 "bible"인것이 맞나요
	}
	public chap4_ex5(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String [] args) {
		chap4_ex5 littlePrince = new chap4_ex5("어린왕자", "생텍쥐페리");
		chap4_ex5 loveStory = new chap4_ex5("춘향전");
		chap4_ex5 emptyBook = new chap4_ex5();
		loveStory.show();
		//bible.show(); - 어떤 것 때문에 존재하는 코드인지 모르겠습니다
	}
}