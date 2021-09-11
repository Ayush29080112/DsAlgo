import java.util.Arrays;
import java.util.stream.Stream;

public class SomeRecursive {
	
	public static void main(String[] args) {
		someRecursive(new int[] {1,2,3,4});
		
	}

	private static void someRecursive(int[] is) {
		int[] b =Arrays.copyOfRange(is, 1,is.length);
		Arrays.stream(b).forEach(s->System.out.println(s));
	}

}
