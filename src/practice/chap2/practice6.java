package practice.chap2;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num=scanner.nextInt();
		int clab=0;
		if(num<1||num>99)
			System.out.println("�߸��� �� �Է�");
		if(num/10!=0&&(num/10)%3==0)
			clab++;
		if(num%10!=0&&(num%10)%3==0)
			clab++;
		if(clab==1)
			System.out.println("�ڼ�¦");
		else if(clab==2)
			System.out.println("�ڼ�¦¦");
		
		scanner.close();
	}

}
