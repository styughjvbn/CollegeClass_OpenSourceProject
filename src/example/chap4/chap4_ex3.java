package example.chap4;

public class chap4_ex3 {
	int radius;
	String name;
	public chap4_ex3() { // �Ű� ���� ���� ������
		radius = 1; 
		name = ""; // radius�� �ʱⰪ�� 1
	}
	public chap4_ex3(int r, String n) { // �Ű� ������ ���� ������
		radius = r; 
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		chap4_ex3 pizza = new chap4_ex3(10, "�ڹ�����"); // Circle ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		chap4_ex3 donut = new chap4_ex3(); // Circle ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
