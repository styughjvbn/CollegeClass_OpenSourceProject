package practice.chap2;
import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1=scanner.nextDouble();
		String exp=scanner.next();
		double num2=scanner.nextDouble();	
		double result=0;
		if(exp.equals("+"))
			result=num1+num2;
		else if(exp.equals("*"))
			result=num1*num2;
		else if(exp.equals("/"))
			if(num2==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
			result=num1/num2;
		else if(exp.equals("-"))
			result=num1-num2;
		System.out.printf("%f%s%f�� ��� ����� %f",num1,exp,num2,result);
		scanner.close();
	}

}
