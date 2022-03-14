
public class Main {

	public static void main(String[] args) {
		QuickSort mergeSort = new QuickSort();
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		mergeSort.quickSort(arr, 0, arr.length - 1);
		mergeSort.display(arr);
	}
}
