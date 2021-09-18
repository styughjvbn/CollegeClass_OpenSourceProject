package practice.chap3;
import java.util.Random;

public class practice10 {

	public static void main(String[] args) {
		Random random = new Random(); 
		random.setSeed(System.currentTimeMillis());
		int array[][]=new int[4][4];
		int tmp=random.nextInt(9)+1;
		int x=random.nextInt(4);
		int y=random.nextInt(4);
	
		for(int j=0;j<10;j++) {
			tmp=random.nextInt(10)+1;
			array[x][y]=tmp;
			while(array[x][y]!=0) {
				x=random.nextInt(4);
				y=random.nextInt(4);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("%5d ",array[i][j]);
			}
			System.out.println();
		}
	}
}
