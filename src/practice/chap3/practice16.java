package practice.chap3;
import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위","바위","보"};
		int n =(int)(Math.random()*3);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String s;
		while(true) {
			n =(int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			s=scanner.next();
			if(s.equals("그만"))
				break;
			if(str[n].equals(s))
				System.out.println("사용자 = "+s+", 컴퓨터 + "+str[n]+", 비겼습니다.");
			else if((s.equals("바위")&&str[n].equals("가위"))||(s.equals("보")&&str[n].equals("주먹"))
					||(s.equals("가위")&&str[n].equals("보")))
					System.out.println("사용자 = "+s+", 컴퓨터 + "+str[n]+", 사용자가 이겼습니다.");
			else
				System.out.println("사용자 = "+s+", 컴퓨터 + "+str[n]+", 컴퓨터가 이겼습니다.");
		}
		
		
		scanner.close();
	}
}
