
public class Fibonnaci {
	
	public static void main(String[] args) {
		fibonnaci(10);
	}

	private static int fibonnaci(int i) {
		if(i==0 || i ==1) {
			return(i);
		}else {
			return fibonnaci(i-1)+fibonnaci(i-2);
		}
		
	}

}
