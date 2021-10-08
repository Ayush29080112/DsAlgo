
public class CLLMain {

	public static void main(String[] args) {
		CircularSinglLinkedList<String> cll = new CircularSinglLinkedList<String>();
		cll.search("Ayush");
		cll.createCircularSingleLinkedList("Vinay");

		cll.insert("Archana", 0);
		cll.insert("Mili", 2);
		cll.insert("Raji", 1);
		cll.insert("Buddy", 3);
		cll.insert("Ayush", 9);

		cll.traverse();
		cll.search("Ayush");
		cll.search("Vinay");
		cll.search("Test");

		cll.delete(3);
		cll.traverse();
	}
}
