package example.chap4;

class Sample {
	public int a;
	private int b;
	int c;
}
public class chap4_ex10{
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;//private는 오로지 해당 클래스에서만 접근가능
		aClass.c = 10;
	}
}
