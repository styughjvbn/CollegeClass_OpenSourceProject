package practice.chap4;

import java.util.Scanner;

class Phone{
	String name, tel;
	Phone(String str1,String str2){
		name=str1;
		tel=str2;
	}
}
public class practice8 {

	public static void main(String[] args) {
		String search;
		boolean is_search;
		Scanner scanner=new Scanner(System.in);
		System.out.print("인원수>>");
		int num=scanner.nextInt();
		Phone p[]=new Phone[num];
		for(int i=0;i<p.length;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			p[i]=new Phone(scanner.next(),scanner.next());
		}
		System.out.println("저장되었습니다....");

		while(true){
			int i;
			System.out.print("검색할 이름>>");
			search=scanner.next();
			is_search=false;
			if(search.equals("그만"))
				break;
			for(i=0;i<p.length;i++) 
				if(p[i].name.equals(search)){
					is_search=true;
					System.out.println(p[i].name+"의 번호는 "+p[i].tel+"입니다");
				}
					
			if(!is_search)
				System.out.println(search+"이 없습니다.");
		}
		scanner.close();
		
	}

}
