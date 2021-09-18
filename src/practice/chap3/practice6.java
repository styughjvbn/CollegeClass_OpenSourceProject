package practice.chap3;
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		int [] money=new int[8];
		int num=scanner.nextInt();
		for(int i=0;i<unit.length;i++) {
			money[i]=num/unit[i];
			num-=money[i]*unit[i];
			if(money[i]!=0)
				System.out.printf("%d원 짜리 : %d개\n",unit[i],money[i]);
		}
		
		scanner.close();
	}
}
