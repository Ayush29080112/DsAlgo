
public class CircularQueue {

	int[] arr;
	int top;
	int beginning;
	int size;

	// Time Complexity O(1)
	// Space Complexity O(N)
	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		this.size = size;
		top = -1;
		beginning = -1;
		System.out.println("Circular queue created successfully!!!");
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public boolean isEmpty() {
		return top == -1;
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public boolean isFull() {
		if (top + 1 == beginning) {
			return true;
		}
		if (beginning == 0 && top == arr.length - 1) {
			return true;
		}

		return false;
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full!!!");
			return;
		}
		if (isEmpty()) {
			beginning = 0;
			top++;
			arr[top] = value;
			System.out.println("Value successfully Inserted!!!");
		} else {
			if (top == arr.length - 1) {
				top = 0;

			} else {
				top++;
			}
			arr[top] = value;
			System.out.println("Value inserted successfully!!!");
		}

	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		} else {
			int result = arr[beginning];
			arr[beginning] = Integer.MIN_VALUE;
			if (beginning == top) {
				beginning = top = -1;
			} else if (beginning + 1 == size) {
				beginning = 0;
			} else {
				beginning++;
			}

			return result;
		}

	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		} else {
			int result = arr[beginning];

			return result;
		}

	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public void delete() {
		arr = null;
		top = -1;
		beginning = -1;
	}

}
