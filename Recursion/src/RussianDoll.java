
public class RussianDoll {

	public static void main(String[] args) {
		openDoll(10);

	}

	private static void openDoll(int i) {
		if(i==1) {
			System.out.println("All Dolls Opened");
		}else {
			System.out.println("Currently opening");
			openDoll(i-1);
		}
		
	}
	
	

}
