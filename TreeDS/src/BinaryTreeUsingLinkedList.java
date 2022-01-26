import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLinkedList {

	public BinaryNode root;

	// Time Complexity O(1)
	// SpaceComplexity O(1)
	public BinaryTreeUsingLinkedList() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}

	// TimeCOmplexity O(n)
	// SpaceComplexity O(n)
	void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + "->");
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}

	// TimeCOmplexity O(n)
	// SpaceComplexity O(n)
	void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.leftChild);
		System.out.print(node.data + "->");
		inOrder(node.rightChild);
	}

	// TimeCOmplexity O(n)
	// SpaceComplexity O(n)
	void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.print(node.data + "->");
	}

	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.data + "-> ");
			if (presentNode.leftChild != null) {
				queue.add(presentNode.leftChild);
			}
			if (presentNode.rightChild != null) {
				queue.add(presentNode.rightChild);
			}
		}
	}

	void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		boolean isPresent = false;
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();

			if (presentNode.data.equalsIgnoreCase(value)) {
				isPresent = true;
				break;
			}
			if (presentNode.leftChild != null) {
				queue.add(presentNode.leftChild);
			}
			if (presentNode.rightChild != null) {
				queue.add(presentNode.rightChild);
			}
		}
		if (isPresent) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
	}

	void insert(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode toInsert = new BinaryNode();
		toInsert.data = value;
		toInsert.leftChild = null;
		toInsert.rightChild = null;

		if (root == null) {
			root = toInsert;
			return;
		}
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();

			if (presentNode.leftChild == null) {
				presentNode.leftChild = toInsert;
				break;
			} else {
				if (presentNode.rightChild == null) {
					presentNode.rightChild = toInsert;
					break;
				} else {
					queue.add(presentNode.leftChild);
					queue.add(presentNode.rightChild);
				}
			}

		}

	}

	BinaryNode getDeepest() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.leftChild != null) {
				queue.add(presentNode.leftChild);
			}
			if (presentNode.rightChild != null) {
				queue.add(presentNode.rightChild);
			}
		}
		return presentNode;
	}

	void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		BinaryNode previousNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.leftChild == null) {
				previousNode.rightChild = null;
				return;
			} else {
				if (presentNode.rightChild == null) {
					presentNode.leftChild = null;
					return;
				}
			}
			queue.add(presentNode.leftChild);
			queue.add(presentNode.rightChild);
		}
	}

	void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.data.equalsIgnoreCase(value)) {
				presentNode.data = getDeepest().data;
				deleteDeepestNode();
				break;
			}
			if (presentNode.leftChild != null) {
				queue.add(presentNode.leftChild);
			}
			if (presentNode.rightChild != null) {
				queue.add(presentNode.rightChild);
			}
		}
	}

	void deleteBT() {
		this.root = null;

		System.out.println("BT deleted!!!");
	}
}
