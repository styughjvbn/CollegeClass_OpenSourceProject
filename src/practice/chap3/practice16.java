package practice.chap3;
import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����","����","��"};
		int n =(int)(Math.random()*3);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String s;
		while(true) {
			n =(int)(Math.random()*3);
			System.out.print("���� ���� ��!>>");
			s=scanner.next();
			if(s.equals("�׸�"))
				break;
			if(str[n].equals(s))
				System.out.println("����� = "+s+", ��ǻ�� + "+str[n]+", �����ϴ�.");
			else if((s.equals("����")&&str[n].equals("����"))||(s.equals("��")&&str[n].equals("�ָ�"))
					||(s.equals("����")&&str[n].equals("��")))
					System.out.println("����� = "+s+", ��ǻ�� + "+str[n]+", ����ڰ� �̰���ϴ�.");
			else
				System.out.println("����� = "+s+", ��ǻ�� + "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
		}
		
		
		scanner.close();
	}
}
