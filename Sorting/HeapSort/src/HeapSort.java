
public class HeapSort {

	int[] arr = null;

	public HeapSort(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// TimeComplexity O(nLogn)
	// Space Complexity O(1)
	public void heapSort() {
		BinaryHeap binaryHeap = new BinaryHeap(arr.length);
		for (int i = 0; i < arr.length; i++) {
			binaryHeap.insert(arr[i], "Min");
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = binaryHeap.extract("Min");
		}
	}
}
