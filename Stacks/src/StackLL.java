public class StackLL {

	SingleLinkedList<Integer> l;

	// Time Complexity O(1)
	// space complexity O(1)
	public StackLL() {
		l = new SingleLinkedList<Integer>();
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public void push(Integer i) {
		l.insert(i, 0);
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public boolean isEmpty() {
		return !(l.size > 0);
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public Integer peek() {
		if (isEmpty()) {
			System.out.println("List is empty!!!");
			return -1;
		} else {
			return l.head.getValue();
		}
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public Integer pop() {
		if (isEmpty()) {
			System.out.println("List is empty!!!");
			return -1;
		} else {
			Integer i = peek();
			l.delete(0);
			return i;

		}
	}
}
