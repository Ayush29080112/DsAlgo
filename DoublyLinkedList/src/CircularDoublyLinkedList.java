
public class CircularDoublyLinkedList<T> {

	Node<T> head;
	Node<T> tail;
	int size;

	// Time Complexity O(1)
	// Space Complexity O(1)
	public Node<T> createCircularDLL(T value) {
		Node<T> node = new Node();
		node.setValue(value);
		head = node;
		tail = node;
		node.setNext(node);
		node.setPrev(node);
		size = 1;
		return head;
	}

	// Time Complexity O(N)
	// Space Complexity O(1)
	public void insert(T value, int location) {
		if (head == null) {
			createCircularDLL(value);
			return;
		}
		Node node = new Node();
		node.setValue(value);
		if (location == 0) {
			node.setNext(head);
			node.setPrev(tail);
			head.setPrev(node);
			tail.setNext(node);
			head = node;
			size++;
		} else {
			if (location >= size) {
				System.out.println(size);
				node.setNext(head);
				node.setPrev(tail);
				tail.setNext(node);
				head.setPrev(node);
				tail = node;
				size++;
			} else {
				Node temp = head;
				for (int i = 0; i < location - 1; i++) {
					temp = temp.getNext();
				}
				node.setNext(temp.getNext());
				node.setPrev(temp);
				temp.getNext().setPrev(node);
				temp.setNext(node);
				size++;
			}
		}
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void traverse() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.getValue());
			temp = temp.getNext();
			if (i != size - 1) {
				System.out.print("->");
			}
		}
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void reverseTraverse() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.getValue());
			temp = temp.getPrev();
			if (i != size - 1) {
				System.out.print("->");
			}
		}
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void search(T value) {
		if (head == null) {
			System.out.println("Linked List is empty!!!");
		} else {
			Node node = head;
			for (int i = 0; i < size; i++) {
				if (node.getValue().equals(value)) {
					System.out.println("Found value at index " + i);
					return;
				}
				node = node.getNext();
			}
			System.out.println("No match found");
		}

	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void delete(int location) {
		System.out.println(size);
		if (head == null) {
			System.out.println("Linked List is empty");
		}

		if (size == 1) {
			head.setNext(null);
			head.setPrev(null);
			head = null;
			tail = null;
			size--;
			return;
		}
		if (location == 0) {

			head = head.getNext();

			head.setPrev(tail);
			tail.setNext(head);
			size--;
		} else {
			if (location >= size - 1) {

				tail = tail.getPrev();
				tail.setNext(head);
				head.setPrev(tail);
				size--;

			} else {
				Node temp = head;
				for (int i = 0; i < location - 1; i++) {
					temp = temp.getNext();
				}

				temp.setNext(temp.getNext().getNext());
				temp.getNext().setPrev(temp);
				size--;
			}
		}
	}

	public void deleteEntireLinkedList() {
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		Node temp = head;
		head.setPrev(null);
		tail.setNext(null);
		for (int i = 0; i < size; i++) {
			temp.setPrev(null);
			temp = temp.getNext();
		}
		head = null;
		tail = null;
	}
}
