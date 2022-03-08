import java.util.ArrayList;

//Value is inserted into nearest empty cell
public class LinearProbing {

	String[] hashTable;
	int usedCellNumber;

	public LinearProbing(int size) {
		// TODO Auto-generated constructor stub
		hashTable = new String[size];
		usedCellNumber = 0;
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

	public double getLoadFactor() {

		double loadFactor = usedCellNumber * 1.0 / hashTable.length;
		return loadFactor;
	}

	public void rehashkeys(String word) {
		usedCellNumber = 0;
		ArrayList<String> data = new ArrayList<String>();
		for (String s : hashTable) {
			if (s != null) {
				data.add(s);
			}
		}
		data.add(word);
		hashTable = new String[hashTable.length * 2];
		for (String s : data) {
			// Insert in Hash Table
			insertInHashTable(s);
		}
	}

	public void insertInHashTable(String word) {
		double loadFactor = getLoadFactor();
		if (loadFactor >= 0.75) {
			rehashkeys(word);
		} else {
			int index = modASCIIHash(word, hashTable.length);
			for (int i = index; i < index + hashTable.length; i++) {
				int newIndex = i % hashTable.length;
				if (hashTable[newIndex] == null) {
					hashTable[newIndex] = word;
					System.out.println("Word inserted successfully!!!!");
					break;
				} else {
					System.out.println("Index is occupied!!!");
				}
			}
		}
		usedCellNumber++;
	}

	public boolean searchInHashTable(String word) {
		int index = modASCIIHash(word, hashTable.length);
		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				System.out.println(word + " found at index " + newIndex);
				return true;
			}
		}
		System.out.println("Word not found!!!");
		return false;
	}

	public void deleteKeyHashTable(String word) {
		int index = modASCIIHash(word, hashTable.length);
		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				hashTable[newIndex] = null;
				System.out.println("Word has been deleted from hash table!!!");
				return;
			}
		}
		System.out.println("Valuse not found in hash table");
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

}
