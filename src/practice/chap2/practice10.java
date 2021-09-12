package practice.chap2;
import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] circle1=new int[3];
		int[] circle2=new int[3];
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		for(int i=0;i<3;i++)
			circle1[i]=scanner.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		for(int i=0;i<3;i++)
			circle2[i]=scanner.nextInt();

		int distance1=(circle1[0]-circle2[0])*(circle1[0]-circle2[0])+(circle1[1]-circle2[1])*(circle1[1]-circle2[1]);
		if(Math.sqrt(distance1)<(double)(circle1[2]+circle2[2]))
			System.out.println("두 원이 겹칩니다.");
		
		scanner.close();
	}

}
