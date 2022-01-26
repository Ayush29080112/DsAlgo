import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	BinaryNode root;

	// Time Complexity O(1)
	// Space complexity O(1)
	public BinarySearchTree() {
		this.root = null;
		System.out.println("Enpty BST created!!!");
	}

	// Time Complexity O(log n)
	// Space complexity O(log n)
	public void insert(int value) {
		root = insert(root, value);
	}

	private BinaryNode insert(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("Value successfully inserted!!!");
			return newNode;
		} else if (currentNode.value >= value) {
			currentNode.leftSubtree = insert(currentNode.leftSubtree, value);
			return currentNode;
		} else {
			currentNode.rightSubtree = insert(currentNode.rightSubtree, value);
			return currentNode;
		}

	}

	// Time Complexity O(n)
	// Space complexity O(n)
	public void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		preOrder(node.leftSubtree);
		preOrder(node.rightSubtree);

	}

	// Time Complexity O(n)
	// Space complexity O(n)
	public void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.leftSubtree);
		postOrder(node.rightSubtree);
		System.out.println(node.value);

	}

	// Time Complexity O(n)
	// Space complexity O(n)
	public void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.leftSubtree);
		System.out.println(node.value);
		inOrder(node.rightSubtree);

	}

	// Time Complexity O(n)
	// Space complexity O(n)
	public void levelOrder(BinaryNode node) {
		Queue<BinaryNode> q = new LinkedList<BinaryNode>();
		if (root == null) {
			return;
		}
		q.add(root);
		while (!q.isEmpty()) {
			BinaryNode presentNode = q.remove();
			System.out.println(presentNode.value);
			if (presentNode.leftSubtree != null) {
				q.add(presentNode.leftSubtree);
			}
			if (presentNode.rightSubtree != null) {
				q.add(presentNode.rightSubtree);
			}
		}
	}

	public String search(BinaryNode node, int value) {
		if (node == null) {
			return "Not found";
		} else if (node.value == value) {
			return "Found";
		} else {
			if (node.value < value) {
				return search(node.rightSubtree, value);
			} else {
				return search(node.leftSubtree, value);
			}
		}

	}

	public BinaryNode findMinimum(BinaryNode root) {
		if (root.leftSubtree == null) {
			return root;
		} else {
			return findMinimum(root.leftSubtree);
		}
	}

	public BinaryNode deleteANode(BinaryNode root, int value) {
		if (root == null) {
			System.out.println("Value not found");
			return null;
		} else {
			if (root.value < value) {

				root.rightSubtree = deleteANode(root.rightSubtree, value);
			} else if (root.value > value) {
				root.leftSubtree = deleteANode(root.leftSubtree, value);
			} else {
				if (root.leftSubtree != null && root.rightSubtree != null) {
					BinaryNode temp = root;
					BinaryNode min = findMinimum(temp.rightSubtree);
					root.value = min.value;
					root.rightSubtree = deleteANode(root.rightSubtree, min.value);
				} else if (root.leftSubtree != null) {
					root = root.leftSubtree;
				} else if (root.rightSubtree != null) {
					root = root.rightSubtree;
				} else {
					root = null;
				}

			}
			return root;
		}
	}
}
