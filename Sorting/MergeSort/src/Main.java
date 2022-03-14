
public class Main {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		mergeSort.mergeSort(arr, 0, arr.length - 1);
		mergeSort.display(arr);
	}
}
