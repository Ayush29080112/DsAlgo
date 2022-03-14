//We repeatedly compare adjacent element and swap them if they are in wrong order
public class BubbleSort {

	// Time COnplexity(O(n*n))
	// Space Complexity O(1)
	public void sort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
