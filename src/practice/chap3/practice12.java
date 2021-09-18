package practice.chap3;

public class practice12 {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		for (i=0; i<args.length; i++) {
			try {
				int j = Integer.parseInt(args[i]);
				sum+=j;
			}
		
			catch (NumberFormatException e) {
				continue;
			}
		}
				
		System.out.println(sum);
	}
}
