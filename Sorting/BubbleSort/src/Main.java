
public class Main {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = { 10, 20, 1, 2, -1, 60, 50 };
		bubbleSort.sort(arr);
		bubbleSort.display(arr);
	}
}
