
public class Main {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		insertionSort.sort(arr);
		insertionSort.display(arr);
	}
}
