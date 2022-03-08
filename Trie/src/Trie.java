
public class Trie {

	TrieNode root;

	// TimeComplexity O(1)
	// Space Complexity O(1)
	public Trie() {
		// TODO Auto-generated constructor stub
		root = new TrieNode();
		System.out.println("Trie created successfully!!!");
	}

	// TimeComplexity O(n)
	// Space Complexity O(n)
	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.endOfString = true;
		System.out.println("Word Successfully Inserted!!!");
	}

	// TimeComplexity O(n)
	// Space Complexity O(1)
	public boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				System.out.println("Word does not exist!!!");
				return false;

			}
			current = node;

		}
		if (current.endOfString) {
			System.out.println("Word exist!!!");
			return true;
		}
		System.out.println("Word is a Prefix!!!");
		return false;
	}

	public void delete(String word) {
		if (search(word)) {
			delete(root, word, 0);
		}

	}

	// TimeComplexity O(n)
	// Space Complexity O(n)
	private boolean delete(TrieNode parentNode, String word, int index) {

		char ch = word.charAt(index);
		TrieNode current = parentNode.children.get(ch);
		boolean canThisNodeBeDeleted;

		if (current.children.size() > 1) {
			delete(current, word, index + 1);
			return false;
		}
		if (index == word.length() - 1) {
			if (current.children.size() >= 1) {
				current.endOfString = false;
				return false;
			} else {
				parentNode.children.remove(ch);
				return true;
			}
		}
		if (current.endOfString) {
			delete(current, word, index + 1);
			return false;
		}

		canThisNodeBeDeleted = delete(current, word, index + 1);
		if (canThisNodeBeDeleted) {
			parentNode.children.remove(ch);
			return true;
		} else {
			return false;
		}
	}
}
