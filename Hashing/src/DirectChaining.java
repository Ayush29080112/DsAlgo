import java.util.LinkedList;

public class DirectChaining {

	LinkedList<String>[] hashTable;
	int maximumChainSize = 5;

	public DirectChaining(int size) {
		// TODO Auto-generated constructor stub
		hashTable = new LinkedList[size];
	}

	public int modASCIIHash(String word, int M) {
		char ch[];
		ch = word.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < word.length(); i++) {
			sum += ch[i];
		}
		return sum % M;
	}

	public void insertHashTable(String word) {
		int newIndex = modASCIIHash(word, hashTable.length);

		if (hashTable[newIndex] == null) {
			hashTable[newIndex] = new LinkedList<String>();
			hashTable[newIndex].add(word);
		} else {
			hashTable[newIndex].add(word);
		}
	}

	public void display() {
		if (hashTable == null) {
			System.out.println("Hash Table does not exist");
			return;
		} else {
			System.out.println("-------------HashTable-------------");
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index" + i + ", key: " + hashTable[i]);
			}
		}
	}

	public boolean search(String word) {
		int index = modASCIIHash(word, hashTable.length);
		if (hashTable[index] != null && hashTable[index].contains(word)) {
			System.out.println(word + " found in hash table at index" + index);
			return true;
		} else {
			System.out.println("Word not found !!!!");
			return false;
		}
	}

	public void delete(String word) {
		int index = modASCIIHash(word, hashTable.length);
		if (search(word)) {
			hashTable[index].remove(word);
			System.out.println(word + " has been deleted!!!");
		} else {
			System.out.println("Word not found!!!!");
		}
	}
}
