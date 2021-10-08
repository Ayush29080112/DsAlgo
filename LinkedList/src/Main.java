
public class Main {
	
	public static void main(String[] args) {
		SingleLinkedList<String> s = new SingleLinkedList<String>();
		s.createSinglyLinkedList("Ayush");
		System.out.println(s.head.getValue());
		s.insert("Vinay", 1);
		System.out.println(s.head.getNext().getValue());
		s.insert("Archana", 2);
		System.out.println(s.head.getNext().getValue());
		s.insert("Mili", 2);
		System.out.println(s.head.getNext().getValue());
		s.insert("Raji", 2);
		System.out.println(s.head.getNext().getValue());
		s.insert("Buddy", 2);
		System.out.println(s.tail.getValue());
		s.traverse();
		System.out.println(s.search("Mili"));
		
		s.delete(2);
		
		s.traverse();
	}
	

}
