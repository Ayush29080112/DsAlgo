
public class MaxProduct {

	
	public String maxProduct(int[] intArray) {
        int max = intArray[0];
        int secondMax = intArray[1];
        
        for(int i=2;i<intArray.length;i++) {
        	if(intArray[i]>secondMax) {
        		secondMax = intArray[i];
        	}
        	if(secondMax>max) {
        		int temp = max;
        		max = secondMax;
        		secondMax = temp;
        		
        	}
        }
        int product = secondMax*max;
        
        System.out.println(product);
        return Integer.toString(product);
    }
	
	public static void main(String[] args) {
		MaxProduct max= new MaxProduct();
		
		max.maxProduct(new int[] {6,5,1,4,2,3});
	}
}
