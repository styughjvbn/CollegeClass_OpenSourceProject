package practice.chap3;
import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score [] = {95,88,76,62,55};
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목 이름>>");
		String s=scanner.next();
		int i=0;
		while(!s.equals("그만")) {
			for(i=0;i<5;i++) {
				if(course[i].equals(s)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
			}
			if(i==5)
				System.out.println("없는 과목입니다.");
			System.out.print("과목 이름>>");
			s=scanner.next();
		}

		
		scanner.close();
	}
}
