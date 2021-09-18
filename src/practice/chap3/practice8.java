package practice.chap3;
import java.util.Random;
import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Á¤¼ö ¸î°³?");
		int num=scanner.nextInt();
		int flag=0;
		int array[]=new int[num];
		Random random = new Random(); // ·£´ý °´Ã¼ »ý¼º random.setSeed(System.currentTimeMillis());
		random.setSeed(System.currentTimeMillis());

		for(int i=0;i<num;i++) {
			int tmp=random.nextInt(100)+1;
			flag=0;
			for(int j=0;j<i;j++) 
				if(array[j]==tmp)
					flag++;
			if(flag!=0)
				i--;
			else
				array[i]=tmp;
		}
		for(int i=0;i<array.length;i++) {
			System.out.printf("%2d ",array[i]);
			if((i+1)%10==0)
				System.out.println();
		}
		scanner.close();
	}
}
