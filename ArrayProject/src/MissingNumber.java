public class MissingNumber {
	
	public void missingNumber(int[] intArray) {
		//Assuming we will have just one missing number
		int sumArray = 0;
		for (int i : intArray) {
			sumArray += i;
		}
		int sumFirstTenNumbers = (10*11)/2;
		
		int missingNumber = sumFirstTenNumbers-sumArray;
		if(missingNumber>0) {
			System.out.println((missingNumber));
		}
	}
	
	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		missingNumber.missingNumber(new int[]{1,2,3,4,5,7,8,9,10});
	}

}
