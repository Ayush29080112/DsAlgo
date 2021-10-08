
public class DoublyLinkedList<T> {

	Node<T> head;
	Node<T> tail;
	int size;

	// Time COmplexity O(1)
	// SPace Complexity O(1)
	public Node<T> createDLL(T value) {

		Node<T> node = new Node<T>();
		node.setValue(value);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail = node;

		size = 1;
		return head;
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void insert(T value, int location) {
		if (head == null) {
			System.out.println("CLL is empty!!!");
			createDLL(value);
		} else {
			Node node = new Node();
			node.setValue(value);

			if (location == 0) {
				node.setPrev(null);
				node.setNext(head);
				head.setPrev(node);
				head = node;
				size++;

			} else {
				if (location >= size - 1) {
					node.setNext(null);
					tail.setNext(node);
					node.setPrev(tail);
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
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void traverse() {

		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty!!!");
		}
		for (int i = 0; i < size; i++) {
			System.out.print(temp.getValue());
			temp = temp.getNext();
			if (i != size - 1) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void reverseTraverse() {

		Node temp = tail;
		if (tail == null) {
			System.out.println("Linked list is empty!!!");
		}
		for (int i = 0; i < size; i++) {
			System.out.print(temp.getValue());
			temp = temp.getPrev();
			if (i != size - 1) {
				System.out.print("->");
			}
		}
		System.out.println("");
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
		if (head == null) {
			System.out.println("Linked list is empty!!!");
			return;
		}
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			if (location == 0) {
				head = head.getNext();
				head.setPrev(null);
				size--;
			} else {
				if (location >= size) {
					tail = tail.getPrev();
					tail.setNext(null);
					size--;
				} else {
					Node temp = head;
					for (int i = 0; i < location - 1; i++) {
						temp = temp.getNext();
					}
					Node toDelete = temp.getNext();
					temp.setNext(toDelete.getNext());
					toDelete.getNext().setPrev(temp);
					toDelete.setNext(null);
					toDelete.setPrev(null);
					size--;
				}
			}
		}
	}
}
