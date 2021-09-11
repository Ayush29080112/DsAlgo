
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = factorial(10);
		System.out.println( n);

	}

	private static int factorial(int i) {
		if(i==1) {
			return 1;
		}else {
			return i * factorial(i-1);
		}
	}
	


}
