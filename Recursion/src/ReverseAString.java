
public class ReverseAString {
	
	
	public static void main(String[] args) {
		System.out.println(reverse("Ayush"));
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		if(str.length()==1) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}

}
