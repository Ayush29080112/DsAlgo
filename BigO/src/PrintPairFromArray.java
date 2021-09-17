
public class PrintPairFromArray {
	
	public static void main(String[] args) {
		
		PrintPairFromArray ppa = new PrintPairFromArray();
		ppa.printPair(new int[] {1,2,3,4,5,6,7});
	}
	
	
	void printPair(int[] i) {
		//O(N^2)
		for (int j : i) {//O(N)
			for (int k : i) { //O(N)
				System.out.print(""+j+""+k + " ");
			}
			System.out.println();
		}
	}

}

