package practice.chap6;

public class practice2 {

		private int x, y, radius;
		
		public practice2(int x, int y, int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		public String toString() {
			return "Circle("+x+","+y+")������"+radius;
		}
		
		public boolean equals(Object obj) {
			practice2 p = (practice2)obj;
			if(p.x == x && p.y == y)
				return true;
			else 
				return false;
		}
		
		public static void main(String[] args) {
			practice2 a = new practice2(2, 3, 5); 
			practice2 b = new practice2(2, 3, 30); 
			System.out.println("�� a : " + a);
			System.out.println("�� b : " + b);
			if(a.equals(b))
				System.out.println("���� ��");
			else 
				System.out.println("���� �ٸ� ��");
		}
	}
