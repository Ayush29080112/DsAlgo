
public class Main {

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		selectionSort.sort(arr);
		selectionSort.display(arr);
	}
}
