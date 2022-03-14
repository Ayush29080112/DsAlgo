
public class BinaryHeap {

	int[] arr;
	int size;

	// Time Complexity O(1)
	// Space Complexity O(n)
	public BinaryHeap(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size + 1];
		size = 0;
		System.out.println("Binary Heap Created!!!");
	}

	// TimeComplexity O(1)
	// Space Complexity O(1)
	public int peek() {
		if (size == 0) {
			return -1;
		}
		return arr[1];
	}

	// TimeComplexity O(1)
	// Space Complexity O(1)
	public int size() {
		return size;
	}

	// TimeComplexity O(N)
	// Space Complexity O(1)
	public void traverse() {
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i] + "->");
		}
	}

	// TimeComplexity O(logN)
	// Space Complexity O(logN)
	public void heapifyBottomToTop(int index, String type) {
		int parent = index / 2;
		if (index <= 1) {
			return;
		}
		if (type.equalsIgnoreCase("Min")) {
			if (arr[index] < arr[parent]) {
				int temp = arr[parent];
				arr[parent] = arr[index];
				arr[index] = temp;

			}
		} else if (type.equalsIgnoreCase("Max")) {
			if (arr[index] > arr[parent]) {
				int temp = arr[parent];
				arr[parent] = arr[index];
				arr[index] = temp;
			}
		}
		heapifyBottomToTop(parent, type);
	}

	// TimeComplexity O(logN)
	// Space Complexity O(logN)
	public void insert(int value, String type) {
		arr[size + 1] = value;
		size++;
		heapifyBottomToTop(size, type);

		System.out.println("Value inserted successfully!!!");
	}

	// TimeComplexity O(logN)
	// Space Complexity O(logN)
	public void heapifyTopToBottom(int index, String type) {
		int left = index * 2;
		int right = index * 2 + 1;
		int swapChild;
		if (size < left) {
			return;
		}

		if (type.equalsIgnoreCase("Max")) {
			if (size == left) {
				if (arr[index] < arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;
			} else {
				if (arr[left] > arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}
				if (arr[index] < arr[swapChild]) {
					int temp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = temp;
				}
			}
		} else {
			if (size == left) {
				if (arr[index] > arr[left]) {
					int temp = arr[index];
					arr[index] = arr[left];
					arr[left] = temp;
				}
				return;
			} else {
				if (arr[left] < arr[right]) {
					swapChild = left;
				} else {
					swapChild = right;
				}
				if (arr[index] > arr[swapChild]) {
					int temp = arr[index];
					arr[index] = arr[swapChild];
					arr[swapChild] = temp;
				}
			}
		}
		heapifyTopToBottom(swapChild, type);
	}

	// TimeComplexity O(logN)
	// Space Complexity O(logN)
	public int extract(String type) {
		int extracted = arr[1];
		arr[1] = arr[size];
		arr[size] = Integer.MIN_VALUE;
		size--;

		heapifyTopToBottom(1, type);
		return extracted;
	}

	// TimeComplexity O(1)
	// Space Complexity O(1)
	public void delete() {
		arr = null;
		size = 0;
		System.out.println("Deleted Successfully!!!");
	}

}
