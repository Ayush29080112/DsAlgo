
public class Main {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		HeapSort heapSort = new HeapSort(arr);
		heapSort.heapSort();
		heapSort.display(arr);
	}
}
