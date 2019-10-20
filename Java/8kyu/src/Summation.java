

public class Kata {
	
	public static void main(String[] args) {
		System.out.println(summation(8));
	}
	
	public static int summation(int n) {
		int fact = 0;
		
		for(int i = 1; i <= n; i++) {
			fact += i;
		}
		return fact;
		
	}
	
}