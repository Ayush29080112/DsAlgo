
public class SingleLinkedList<T> {

	public Node<T> head;
	
	public Node<T> tail;
	
	public int size;
	
	
	//Time Complexity of Creating single linked list is O(1)
	//Space Complexity is O(1)
	public Node<T> createSinglyLinkedList(T value){
	
		Node node = new Node<T>();
		node.setNext(null);
		node.setValue(value);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	//TimeComplexity o(N)
	//Space Complexity O(1)
	public void insert(T value, int location) {
		Node<T> node = new Node<T>();
		node.setValue(value);
		
		if(head == null) {
			createSinglyLinkedList(value);
			return;
		} 
		if (location == 0) {
			node.setNext(head);
			head = node;
			size ++;
			
		}else {
			if (location >= size) {
				node.setNext(null);
				tail.setNext(node);
				tail = node;
				size ++;
				
			}else {
				Node tempNode = head;
				int index = 0;
				while(index < location-1) {
					tempNode = tempNode.getNext();
					index++;
				}
				Node nextNode = tempNode.getNext();
				node.setNext(nextNode);
				tempNode.setNext(node);
				size ++;
			}
		}
		
		
	}
	
	//Time COmplexity O(N)
	//Space Complexity O(1)
	public void traverse() {
		if(head == null) {
			System.out.println("Linked List is empty!!!");
		}
		Node temp = head;
		while(temp.getNext()!= null) {
			System.out.print(temp.getValue() + "->");
			temp = temp.getNext();
		}
		System.out.println(temp.getValue());
	}
	
	//TIme Complexity O(N)
	//Space Complexity O(1)

		public boolean search(T value) {
			if(head != null) {
				Node temp  = head;
				for(int i = 0; i<size; i++) {
					if(temp.getValue().equals(value)) {
						System.out.println("Value found at index"+ i);
						return true;
					}
					temp = temp.getNext();
				}
				System.out.println("Node not found!!!");
				return false;
			}
			System.out.println("No data present in LL!!!");
			return false;
			
		}
		// Time complexity is O(N)
		//SpaceComplexity is O(1)
		public void delete(int location) {
			if(head == null) {
				System.out.println("Linked list is empty!!1");
				return;
			}
			
			
		if (location == 0) {

			Node temp = head.getNext();
			head.setNext(null);
			head = temp;
			size--;
			if (size == 0) {
				tail = null;
			}

		}else {
				if(location>=size) {
					Node temp = head;
					for(int i = 1; i < size-1; i++) {
						 temp = temp.getNext(); 
					}
					if(temp == head) {
						tail = head = null;
						size--;
						return;
					}
					temp.setNext(null);
					tail = temp;
					size --;
				}else {
					if(location < size) {
						Node temp = head;
						for(int i = 0; i < location-1; i++) {
							 temp = temp.getNext(); 
						}
						Node toBeDeleted = temp.getNext();
						temp.setNext(toBeDeleted.getNext());
						toBeDeleted.setNext(null);
						size --;
					}
				}
			}
		}
		
		public void deleteSLL() {
			head = null;
			tail = null;
			
			System.out.println("Linked List deleted !!!");
		}
}
