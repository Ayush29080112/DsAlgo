
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(13));

	}

	private static int decimalToBinary(int i) {
		if(i == 0) {
			return 0;
		}else {
			return (i%2)+decimalToBinary(i/2)*10;
		}
		
	}

}
