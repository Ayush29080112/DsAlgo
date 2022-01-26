
public class MainCQ {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(10);
		System.out.println(cq.isEmpty());
		cq.enqueue(10);
		cq.enqueue(11);

		cq.enqueue(12);
		cq.enqueue(13);
		cq.enqueue(14);
		System.out.println(cq.dequeue());
		System.out.println(cq.peek());
		System.out.println(cq.dequeue());

	}
}
