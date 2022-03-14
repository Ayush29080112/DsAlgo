
public class InsertionSort {

	// Time COnplexity(O(n*n))
	// Space Complexity O(1)
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i], j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
