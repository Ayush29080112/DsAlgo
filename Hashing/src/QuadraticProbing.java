import java.util.ArrayList;

public class QuadraticProbing {

	String[] hashTable;
	int usedCellNumber;

	public QuadraticProbing(int size) {
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
		// TODO Auto-generated method stub
		double loadFactor = getLoadFactor();
		if (loadFactor >= 0.75) {
			rehashkeys(word);
		} else {
			int index = modASCIIHash(word, hashTable.length);
			int counter = 0;
			for (int i = index; i < index + hashTable.length; i++) {
				int newIndex = (index + (counter * counter)) % hashTable.length;
				if (hashTable[newIndex] == null) {
					hashTable[newIndex] = word;
					System.out.println("Word Inserted successfully!!!");
					break;
				} else {
					System.out.println("New Index already occupied, trying next one!!!");
					counter++;
				}
			}
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
}
