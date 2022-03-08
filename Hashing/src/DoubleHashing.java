import java.util.ArrayList;

public class DoubleHashing {

	String[] hashTable;
	int usedCellNumber;

	public DoubleHashing(int size) {
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

	public void insertInHashTable(String s) {
		double loadFactor = getLoadFactor();
		if (loadFactor >= 0.75) {
			rehashkeys(s);
		} else {
			int index = modASCIIHash(s, hashTable.length);
			int y = secondHashFunction(s, hashTable.length);
			for (int i = 0; i < hashTable.length; i++) {
				int newIndex = (index + i * y) % hashTable.length;
				if (hashTable[newIndex] == null) {
					hashTable[newIndex] = s;
					System.out.println("Word Inserted Successfully!!!");
					break;
				} else {
					System.out.println("Cell Occupied, trying new index!!!");
				}
			}
		}
		usedCellNumber++;

	}

	private int addAllDigits(int sum) {
		int value = 0;
		while (sum > 0) {
			value = sum % 10;
			sum = sum / 10;
		}
		return value;
	}

	public int secondHashFunction(String x, int M) {
		char ch[];
		ch = x.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < x.length(); i++) {
			sum += ch[i];
		}
		while (sum > hashTable.length) {
			sum = addAllDigits(sum);
		}
		return sum % M;
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
