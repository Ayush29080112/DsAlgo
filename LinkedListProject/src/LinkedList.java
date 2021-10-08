
public class LinkedList {

	public Node head;
	public Node tail;
	public int size;

	public void createLinkedList(int value) {
		Node node = new Node();
		node.value = value;

		node.next = null;
		head = node;
		tail = node;
		size = 1;
	}

	public void insertNode(int nodeValue) {
		if (head == null) {
			createLinkedList(nodeValue);
			return;
		}

		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = null;
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public void traversalLL() {
		Node tempNode = head;
		for (int i = 0; i < size; i++) {
			System.out.print(tempNode.value);
			if (i != size - 1) {
				System.out.print("->");
			} else {
				System.out.println();
			}
			tempNode = tempNode.next;
		}
	}
}
