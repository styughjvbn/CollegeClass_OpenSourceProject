package example.chap4;

public class chap4_ex9 {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;//Good의 링크가 사라지기때문에 가비지 생성
		d = c;
		c = null;
	}

}
