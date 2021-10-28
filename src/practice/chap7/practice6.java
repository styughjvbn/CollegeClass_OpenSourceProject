package practice.chap7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	String city;
	int longitude;
	int latitude;
	
	Location(String str1,int str2,int str3){
		city=str1;
		longitude=str2;
		latitude=str3;
	}
	String get_city() {
		return city;
	}
	int get_longitude() {
		return longitude;
	}
	int get_latitude() {
		return latitude;
	}
	void find_location(String city) {
		System.out.println(city+"  "+longitude+"  "+latitude);
	}
}
public class practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Location[] location = new Location[4];
		HashMap<String, Location> manage = new HashMap<String, Location>();
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i=0; i<location.length; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());
			location[i] = new Location(city, longitude, latitude);
			manage.put(city, location[i]); // ArrayList�� ����
		}
		Set<String> key = manage.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("----------------------------------");
		while(it.hasNext()) {
			String city = it.next();
			Location s = manage.get(city);
			System.out.println(s.get_city() +" "+s.get_longitude()+" "+s.get_latitude());
		}
		System.out.println("----------------------------------");
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = sc.next();
			if(city.equals("�׸�"))
				break;
			Location s = manage.get(city);
			if( s == null)
				System.out.println(city+"�� �����ϴ�.");
			else
				s.find_location(city);
		}
		sc.close();
	}
}