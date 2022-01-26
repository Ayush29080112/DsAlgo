
public class LinkedListQueue {

	SingleLinkedList<Integer> s;

	// Time COmplexity O(1)
	// space complexity O(1)
	public LinkedListQueue() {
		s = new SingleLinkedList<Integer>();
		System.out.println("Queue created successfully!!!");
	}

	// Time COmplexity O(1)
	// space complexity O(1)
	public boolean isEmpty() {
		return s.head == null;
	}

	// Time COmplexity O(1)
	// space complexity O(1)
	public void enQueue(int value) {
		s.insert(value, s.size);

		System.out.println("Value inserted successfully");
	}

	// Time COmplexity O(1)
	// space complexity O(1)
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		}
		int value = s.head.getValue();
		s.delete(0);
		return value;
	}

	// Time COmplexity O(1)
	// space complexity O(1)
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -1;
		}
		int value = s.head.getValue();

		return value;
	}

	public void delete() {
		s.deleteSLL();
		s = null;
		System.out.println("Deleted the queue");
	}

}
