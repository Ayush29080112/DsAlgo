
public class LinearProbingMain {

	public static void main(String[] args) {
		LinearProbing linearProbing = new LinearProbing(13);
		linearProbing.insertInHashTable("Ayush");
		linearProbing.insertInHashTable("Mili");
		linearProbing.insertInHashTable("yushA");
		linearProbing.insertInHashTable("Vinay");
		linearProbing.insertInHashTable("Archana");
		linearProbing.insertInHashTable("Raji");

		linearProbing.display();

		linearProbing.searchInHashTable("Ayush");
	}
}
