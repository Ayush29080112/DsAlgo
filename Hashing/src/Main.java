
public class Main {

	public static void main(String[] args) {
		DirectChaining chaining = new DirectChaining(15);
		chaining.insertHashTable("Ayush");
		chaining.insertHashTable("Mili");
		chaining.insertHashTable("yushA");
		chaining.insertHashTable("Vinay");
		chaining.insertHashTable("Archana");
		chaining.insertHashTable("Raji");

		chaining.display();

		chaining.search("Ayush");
		chaining.search("ox");

		chaining.insertHashTable("Buddy");

		chaining.delete("yushA");

		chaining.display();
	}
}
