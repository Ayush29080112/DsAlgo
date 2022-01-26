
public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(70);
		b.insert(90);
		b.insert(50);
		b.insert(30);
		b.insert(60);
		b.insert(80);
		b.insert(100);
		b.insert(20);
		b.insert(40);

		b.preOrder(b.root);

		System.out.println("Starting post order!!!");
		b.postOrder(b.root);

		System.out.println("Starting in order!!!");
		b.inOrder(b.root);

		System.out.println("Starting level order!!!");
		b.levelOrder(b.root);
		System.out.println(b.search(b.root, 70));
		System.out.println(b.search(b.root, 5));
		b.deleteANode(b.root, 40);

		b.levelOrder(b.root);

		System.out.println("delete");
		b.deleteANode(b.root, 90);

		b.levelOrder(b.root);
		System.out.println("delete");

		b.deleteANode(b.root, 70);

		b.levelOrder(b.root);
	}
}
