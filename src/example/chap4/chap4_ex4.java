package example.chap4;

public class chap4_ex4 {
	String title;
	String author;
	public chap4_ex4(String t) { // 생성자
		title = t; author = "작자미상";
	}
	public chap4_ex4(String t, String a) { // 생성자
		title = t; author = a;
	}
	public static void main(String [] args) {
		chap4_ex4 littlePrince = new chap4_ex4("어린왕자", "생텍쥐페리");
		chap4_ex4 loveStory = new chap4_ex4("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
