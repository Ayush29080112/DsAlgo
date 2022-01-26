
public class BinaryTreeLLMain {

	public static void main(String[] args) {
		BinaryNode root = new BinaryNode();
		root.data = "Drinks";
		BinaryNode hot = new BinaryNode();
		hot.data = "Hot";
		BinaryNode tea = new BinaryNode();
		tea.data = "Tea";
		BinaryNode coffee = new BinaryNode();
		coffee.data = "Coffee";
		hot.leftChild = tea;
		hot.rightChild = coffee;
		root.leftChild = hot;

		BinaryNode cold = new BinaryNode();
		cold.data = "Cold";
		BinaryNode coke = new BinaryNode();
		coke.data = "Coke";
		BinaryNode fanta = new BinaryNode();
		fanta.data = "Fanta";
		cold.leftChild = coke;
		cold.rightChild = fanta;
		root.rightChild = cold;
		BinaryTreeUsingLinkedList b = new BinaryTreeUsingLinkedList();
		b.root = root;
		b.preOrder(b.root);

		System.out.println();

		b.inOrder(b.root);

		System.out.println();

		b.postOrder(b.root);

		System.out.println();

		b.levelOrder();

		System.out.println();

		b.search("Fanta");

		b.search("Ayush");

		b.levelOrder();
		System.out.println();

		System.out.println(b.getDeepest().data);
		b.deleteDeepestNode();

		b.levelOrder();

	}
}
