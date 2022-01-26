import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	BinaryNode root;

	AVL() {
		this.root = null;
	}

	public int search(BinaryNode root, int value) {
		if (root == null) {
			System.out.println("Value does not exist!!!");
			return -1;
		} else {
			if (root.value > value) {
				return search(root.left, value);
			} else if (root.value < value) {
				return search(root.right, value);
			} else {
				System.out.println("Value found!!!!");
				return root.value;
			}
		}
	}

	public void preOrder(BinaryNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.value);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(BinaryNode root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.value);
	}

	public void inOrder(BinaryNode root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.println(root.value);
		inOrder(root.right);

	}

	public void levelOrder(BinaryNode root) {
		if (root == null) {
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode temp = queue.remove();
			System.out.println(temp.value);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	public int getHeight(BinaryNode node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	public BinaryNode rotateRight(BinaryNode disbalancedNode) {
		if (disbalancedNode == null) {
			return disbalancedNode;
		} else {
			BinaryNode newroot = disbalancedNode.left;
			disbalancedNode.left = disbalancedNode.left.right;
			newroot.right = disbalancedNode;
			disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
			newroot.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
			return newroot;
		}
	}

	public BinaryNode rotateLeft(BinaryNode disbalancedNode) {
		if (disbalancedNode == null) {
			return disbalancedNode;
		} else {
			BinaryNode newroot = disbalancedNode.right;
			disbalancedNode.right = disbalancedNode.right.left;
			newroot.left = disbalancedNode;
			disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
			newroot.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
			return newroot;
		}
	}

	public int getBalance(BinaryNode node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	private BinaryNode insert(BinaryNode node, int insertValue) {
		if (node == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = insertValue;
			newNode.height = 1;
			return newNode;
		} else if (node.value > insertValue) {
			node.left = insert(node.left, insertValue);
		} else {
			node.right = insert(node.right, insertValue);
		}
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		int balance = getBalance(node);
		if (balance > 1 && insertValue < node.left.value) {
			return rotateRight(node);
		}
		if (balance > 1 && insertValue > node.left.value) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		if (balance < 1 && insertValue > node.right.value) {
			return rotateLeft(node);
		}
		if (balance < 1 && insertValue < node.right.value) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		return node;
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public BinaryNode findMinimum(BinaryNode root) {
		if (root.left == null) {
			return root;
		} else {
			return findMinimum(root.left);
		}
	}

	private BinaryNode delete(BinaryNode node, int value) {
		if (node == null) {
			System.out.println("Node not found!!!");
			return node;
		} else {
			if (node.value > value) {
				delete(node.left, value);
			} else if (node.value < value) {
				delete(node.right, value);
			} else {
				if (node.left != null && node.right != null) {
					BinaryNode temp = node;
					BinaryNode min = findMinimum(temp.right);
					node.value = min.value;
					node.right = delete(node.right, min.value);
				} else if (node.left != null) {
					node = node.left;
				} else if (node.right != null) {
					node = node.right;
				} else {
					node = null;
				}
			}

			int balance = getBalance(node);

			if (balance > 1 && getBalance(node.left) >= 0) {
				return rotateRight(node);
			}
			if (balance > 1 && getBalance(node.left) < 0) {
				node.left = rotateLeft(node.left);
				return rotateRight(node);
			}

			if (balance < -1 && getBalance(node.right) <= 0) {
				return rotateLeft(node);
			}
			if (balance < -1 && getBalance(node.right) > 0) {
				node.right = rotateRight(node.right);
				return rotateLeft(node);
			}
			return node;
		}
	}

	public void delete(int value) {
		root = delete(root, value);
	}

}
