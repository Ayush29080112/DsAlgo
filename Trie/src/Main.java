
public class Main {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("API");
		trie.insert("Ayush");

		trie.search("API");
		trie.search("AP");
		trie.search("Ayush");

		trie.search("Ayusd");

		trie.delete("API");

		trie.search("API");
	}
}
