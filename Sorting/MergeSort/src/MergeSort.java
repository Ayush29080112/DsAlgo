
public class MergeSort {

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void merge(int[] A, int left, int middle, int right) {

		int n1 = middle - left + 1;
		int n2 = right - middle;
		int[] leftTmpArray = new int[n1];
		int[] rightTmpArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftTmpArray[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			rightTmpArray[i] = A[middle + 1 + i];
		}

		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftTmpArray[i] <= rightTmpArray[j]) {
				A[k] = leftTmpArray[i];
				i++;
			} else {
				A[k] = rightTmpArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			A[k] = leftTmpArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			A[k] = rightTmpArray[j];
			j++;
			k++;
		}

	}

	// Time Complexity O(NlogN)
	// Space Complexity O(N)
	public void mergeSort(int[] Array, int left, int right) {
		if (right > left) {
			int m = (left + right) / 2;
			mergeSort(Array, left, m);
			mergeSort(Array, m + 1, right);
			merge(Array, left, m, right);
		}
	}

}
