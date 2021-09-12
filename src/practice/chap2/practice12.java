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
				System.out.println("0으로 나눌 수 없습니다.");
			else
			result=num1/num2;
		else if(exp.equals("-"))
			result=num1-num2;
		System.out.printf("%f%s%f의 계산 결과는 %f",num1,exp,num2,result);
		scanner.close();
	}

}
