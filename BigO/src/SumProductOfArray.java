
public class SumProductOfArray {
	
	
	public static void main(String[] args) {
		
		SumProductOfArray sp = new SumProductOfArray();
		sp.spOfArray(new int[] {1,2,3,4,5});
	}

	
	//BigO(N)  ---- Time complexity
	//O(1) -> Space complexity
	
	void spOfArray(int[] i){
		int sum = 0;  //O(1)
		int prod = 1; //O(1)
		
		for (int j : i) {//O(N)
			sum += j;//O(1)
			prod *= j;//O(1)
		}
		System.out.println(sum);//O(1)
		System.out.println(prod);//O(1)
	}
}
