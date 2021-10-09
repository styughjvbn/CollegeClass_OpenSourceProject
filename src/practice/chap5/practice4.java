package practice.chap5;
import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");;
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val =scanner.nextDouble();
		double res=convert(val);
		System.out.println("��ȯ ��� : " + res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}
class Km2Mile extends Converter{
	public Km2Mile(double num) {
		super.ratio=num;
	}
	protected double convert(double src) {
		return src/super.ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "Mile";
	}
}
public class practice4 {
	
	public static void main(String[] args) {
		Km2Mile toMile =new Km2Mile(1.6);
		toMile.run();
	}
}
