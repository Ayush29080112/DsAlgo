
public class Queue {

	int[] arr;
	int top;
	int beginning;

	// Time Complexity O(1)
	// Space Complexity O(n)
	public Queue(int size) {
		arr = new int[size];
		top = -1;
		beginning = -1;
		System.out.println("Queue Created Successfully!!!");
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public boolean isFull() {
		return top == arr.length - 1;
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public boolean isEmpty() {
		return beginning == arr.length || beginning == -1;
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full!!!");
		} else if (isEmpty()) {
			beginning = 0;
			top++;
			arr[top] = value;
			System.out.println("Successfully inserted the value in queue!!!");
		} else {
			beginning = 0;
			top++;
			arr[top] = value;
			System.out.println("Successfully inserted the value in queue!!!");

		}
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		} else {
			int value = arr[beginning];
			beginning++;
			if (beginning > top) {
				beginning = top = -1;
			}
			return value;
		}
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		} else {
			int value = arr[beginning];

			return value;
		}
	}

	public void delete() {
		arr = null;
		System.out.println("Queue has been deleted!!!");
	}
}
