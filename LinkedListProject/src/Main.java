import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.insertNode(3);
		ll.insertNode(1);
		ll.insertNode(5);
		ll.insertNode(9);
		LinkedList l2 = new LinkedList();

		l2.insertNode(2);
		l2.insertNode(4);
		l2.insertNode(6);

////		deleteDups(ll);
////		nthLastElement(9ll, 2);
		addSameNode(ll, l2, 7);
		addSameNode(ll, l2, 2);
		addSameNode(ll, l2, 1);
		Node n = findIntersection(ll, l2);
		System.out.println(n);
//		System.out.println(ll.size);
//		System.out.println(l.size);
//		l.traversalLL();
	}

	static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
		Node newNode = new Node();
		newNode.value = nodeValue;
		llA.tail.next = newNode;
		llA.tail = newNode;
		llB.tail.next = newNode;
		llB.tail = newNode;

	}

	private static void deleteDups(LinkedList ll) {
		Node node = ll.head;
		Set s = new HashSet();
		int count = 0;
		for (int i = 0; i < ll.size; i++) {
			if (node.next != null && !s.contains(node.next.value)) {
				s.add(node.next.value);
				node = node.next;
			} else {
				if (node.next != null) {
					node.next = node.next.next;
					count++;
				}
			}

		}
		ll.size -= count;

	}

	public static void nthLastElement(LinkedList ll, int count) {
		Node node = ll.head;
		if (count > ll.size) {
			System.out.println(node.value);
		}
		for (int i = 0; i < ll.size - count; i++) {
			node = node.next;
		}
		System.out.println(node.value);
	}

	public static LinkedList partition(LinkedList l, int value) {

		Node currentNode = l.head;
		l.tail = l.head;

		while (currentNode != null) {
			Node next = currentNode.next;
			if (currentNode.value < value) {
				currentNode.next = l.head;
				l.head = currentNode;
			} else {
				l.tail.next = currentNode;
				l.tail = currentNode;
			}
			currentNode = next;
		}
		l.tail.next = null;

		return l;

	}

	public static LinkedList sum(LinkedList l1, LinkedList l2) {
		LinkedList l3 = new LinkedList();
		int size = l1.size > l2.size ? l1.size : l2.size;
		Node list1Node = l1.head;
		Node list2Node = l2.head;
		int sum = 0;
		int carry = 0;
		int l1Value = 0;
		int l2Value = 0;

		for (int i = 0; i < size; i++) {
			if (list1Node != null) {
				l1Value = list1Node.value;
				list1Node = list1Node.next;
			} else {
				l1Value = 0;
			}

			if (list2Node != null) {
				l2Value = list2Node.value;
				list2Node = list2Node.next;
			} else {
				l2Value = 0;
			}
			sum = l1Value + l2Value + carry;

			carry = sum / 10;
			sum = sum % 10;

			l3.insertNode(sum);

		}
		return l3;
	}

	public static Node findIntersection(LinkedList llA, LinkedList llB) {
		int dA = 0;
		int dB = 0;

		if (llA.head == null || llB.head == null) {
			return null;
		}
		if (llA.tail != llB.tail) {
			return null;
		}
		if (llA.size > llB.size) {
			dA = llA.size - llB.size;

		} else {
			dB = llB.size - llA.size;

		}
		Node startingNodeA = llA.head;
		Node startingNodeB = llB.head;
		if (dA > 0) {
			for (int i = 0; i < dA; i++) {
				startingNodeA = startingNodeA.next;
			}
		} else {
			for (int i = 0; i < dB; i++) {
				startingNodeB = startingNodeB.next;
			}
		}

		while (startingNodeA != startingNodeB) {
			startingNodeA = startingNodeA.next;
			startingNodeB = startingNodeB.next;
		}
		return startingNodeA;
	}

}
