// We select the shortest element from the unsorted array and move it to the left most element in unsorted array and increment the sorted array index by 1
public class SelectionSort {

	// Time Complexity(O(n*n))
	// Space Complexity O(1)
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}
			if (minimum != i) {
				int temp = arr[i];
				arr[i] = arr[minimum];
				arr[minimum] = temp;
			}
		}
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
