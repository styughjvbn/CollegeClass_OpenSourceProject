package practice.chap5;

class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	private int color_num;
	public ColorTV(int num1,int num2) {
		super(num1);
		color_num=num2;
	}
	protected void printProperty() {
		System.out.println(super.getSize()+"인치 "+color_num+"컬러");
	}
	protected int getnum() {return color_num;}
}
class IPTV extends ColorTV{
	private String str;
	public IPTV(String str,int num1,int num2) {
		super(num1,num2);
		this.str=str;
	}
	protected void printProperty() {
		System.out.println("나의 IPTV는 "+ str+"주소의 "+super.getSize()+"인치 "+super.getnum()+"컬러");
	}
}
public class practice2 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV("192.1.1.2",342,2048);
		
		iptv.printProperty();

	}
}
