
public class Power {
	
	public static void main(String[] args) {
		System.out.println(power(10,3));
		
	}

	private static int power(int i, int j) {
		if(j<0) {
			return -1;
		}
		if(j==0) {
			return 1;
		}
		return i * power(i,j-1);
	}

}
