package practice.chap2;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int[] num=new int[3];
		int max=0;
		System.out.print("정수 3개 입력>>");
		for(int repeat=0;repeat<3;repeat++) {
			num[repeat]=scanner.nextInt();
		}
		max=0;
		if(num[1]>num[0])
			if(num[2]>num[1])
				max=1;
			else if(num[2]>num[0])
				max=2;
			else
				max=0;
		else
			if(num[2]>num[0])
				max=0;
			else if(num[2]>num[1])
				max=2;
			else
				max=1;
		System.out.printf("중간 값은 %d",num[max]);
		scanner.close();
	}

}
