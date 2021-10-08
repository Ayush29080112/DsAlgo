
public class CircularSinglLinkedList<T> {

	public Node<T> head;
	public Node<T> tail;

	public int size;

	// Time Complexity O(1)
	// Space Complexity O(1)
	public Node<T> createCircularSingleLinkedList(T value) {
		Node<T> node = new Node<T>();

		node.setValue(value);
		node.setNext(node);

		head = node;
		tail = node;
		size = 1;

		return node;
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void insert(T value, int location) {
		if (head == null && tail == null) {
			System.out.println("Linked list is empty, hence creating a new linked list");
			createCircularSingleLinkedList(value);
			return;
		}

		Node node = new Node();
		node.setValue(value);

		if (location == 0) {

			node.setNext(head);
			head = node;
			tail.setNext(head);
			size++;
		} else {
			if (location >= size) {

				node.setNext(head);
				tail.setNext(node);
				tail = node;
				size++;

			} else {

				Node temp = head;
				for (int i = 0; i < location - 1; i++) {
					temp = temp.getNext();
				}
				node.setNext(temp.getNext());
				temp.setNext(node);
				size++;
			}
		}

	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void traverse() {
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		Node temp = head;
		int index = 0;
		while (index < size) {
			if (index != size - 1) {
				System.out.print(temp.getValue() + "->");
			} else {
				System.out.println(temp.getValue());
			}
			temp = temp.getNext();
			index++;
		}
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void search(T value) {
		if (head != null) {
			int index = 0;
			Node temp = head;
			while (index < size) {
				if (temp.getValue().equals(value)) {
					System.out.println("Element found at node : " + index);
					return;
				} else {
					temp = temp.getNext();
					index++;
				}

			}
		}
		System.out.println("Node not found");
	}

	// Time Complexity O(N)
	// Space complexity O(1)
	public void delete(int location) {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {

			Node temp = head;
			if (size == 1) {
				temp.setNext(null);
				head = null;
				tail = null;
				size--;
			} else {
				if (location == 0) {

					head = head.getNext();
					tail.setNext(head);
					temp.setNext(null);
					size--;

				} else {
					if (location >= size - 1) {
						for (int i = 0; i < size - 2; i++) {
							temp = temp.getNext();
						}
						Node toDelete = temp.getNext();
						temp.setNext(toDelete.getNext());
						toDelete.setNext(null);
						size--;
					} else {
						for (int i = 0; i < location - 1; i++) {
							temp = temp.getNext();
						}
						Node toDelete = temp.getNext();
						temp.setNext(toDelete.getNext());
						toDelete.setNext(null);
						size--;
					}
				}
			}
		}
	}

	// Time Complexity O(1)
	// Space COmplexity O(1)
	public void deleteCSL() {

		if (head == null) {
			System.out.println("Circular linked list does not exist!!!");
		}

		head = null;
		tail.setNext(null);
		tail = null;
	}

}
