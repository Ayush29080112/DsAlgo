import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	Map<Character, TrieNode> children;
	boolean endOfString;

	public TrieNode() {
		// TODO Auto-generated constructor stub
		children = new HashMap<Character, TrieNode>();
		endOfString = false;
	}
}
