package example.chap4;

public class chap4_ex1 {
	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�
	public chap4_ex1() { } // ���� ������
	public double getArea() { // ���� ���� ��� �޼ҵ�
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		chap4_ex1 pizza;
		pizza = new chap4_ex1(); // Circle ��ü ����
		pizza.radius = 10; // ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		
		chap4_ex1 donut = new chap4_ex1(); // Circle ��ü ����
		donut.radius = 2; // ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);
	}

}
