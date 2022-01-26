
public class BinaryTreeArrayMain {

	public static void main(String[] args) {
		BinaryTreeUsingArray b = new BinaryTreeUsingArray(5);
		b.insert("Vinay");
		b.insert("Archana");
		b.insert("Samridhi");
		b.insert("Ayush");
		b.insert("Mili");

		b.preOrder(1);

		System.out.println(b.lastUsedIndex);

		System.out.println("Will Start Printing in Order");
		b.inOrder(1);
		System.out.println("Will Start Printing post Order");
		b.postOrder(1);
	}
}
