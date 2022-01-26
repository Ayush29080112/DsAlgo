
public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(6);
		System.out.println(queue.isFull());
		System.out.println(queue.isEmpty());
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(17);
		int result = queue.dequeue();
		System.out.println(result);
		queue.enqueue(10);
	}
}
