
public class BinaryTreeUsingArray {

	String[] treeArray;
	int lastUsedIndex;

	// Time Complexity O(1)
	// Space Complexity O(1)
	public BinaryTreeUsingArray(int size) {
		treeArray = new String[size + 1];
		lastUsedIndex = 0;

		System.out.println("Tree of size " + size + " created successfully!!!");
	}

	boolean isFull() {
		return lastUsedIndex == treeArray.length - 1;
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	void insert(String value) {
		if (!isFull()) {
			treeArray[lastUsedIndex + 1] = value;
			lastUsedIndex++;
			System.out.println("Value inserted successfully!!!!");
		} else {
			System.out.println("Tree is full!!!");
		}
	}

	// Time Complexity O(N)
	// Space Complexity O(N)
	void preOrder(int index) {
		if (index > treeArray.length - 1) {
			return;
		}
		System.out.println(treeArray[index]);
		preOrder(2 * index);
		preOrder(2 * index + 1);
	}

	// Time Complexity O(N)
	// Space Complexity O(N)
	void inOrder(int index) {
		if (index > treeArray.length - 1) {
			return;
		}

		inOrder(2 * index);
		System.out.println(treeArray[index]);
		inOrder(2 * index + 1);
	}

	// Time Complexity O(N)
	// Space Complexity O(N)
	void postOrder(int index) {
		if (index > treeArray.length - 1) {
			return;
		}

		postOrder(2 * index);
		postOrder(2 * index + 1);
		System.out.println(treeArray[index]);

	}

	// Time Complexity O(N)
	// Space Complexity O(1)
	void levelOrder() {
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.println(treeArray[i]);
		}
	}

	// Time Complexity O(N)
	// Space Complexity O(1)
	void search(String value) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (value.equalsIgnoreCase(treeArray[i])) {
				System.out.println("Value found at index " + i);
				break;
			}
		}
		System.out.println("No Value found!!!");
	}

	// Time Complexity O(N)
	// Space Complexity O(1)
	void delete(String value) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (value.equalsIgnoreCase(treeArray[i])) {
				treeArray[i] = treeArray[lastUsedIndex];
				treeArray[lastUsedIndex] = null;
				lastUsedIndex--;
				break;
			}
		}
		System.out.println("No match  found!!!");
	}

	// Time Complexity O(1)
	// Space Complexity O(1)
	void deleteBT() {
		lastUsedIndex = -1;
		treeArray = null;
	}
}
