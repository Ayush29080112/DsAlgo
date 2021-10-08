
public class SearchInArray {

	public int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0 ; i <intArray.length ; i++){
            if(intArray[i] == valueToSearch){
                return i;
            }
        }
        return -1;
    }
	
	
	public static void main(String[] args) {
		SearchInArray s = new SearchInArray();
		System.out.println(s.searchInArray(new int[] {1,2,3,5,4}, 5));
	}
}
