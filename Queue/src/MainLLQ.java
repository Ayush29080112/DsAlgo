
public class MainLLQ {
	public static void main(String[] args) {
		LinkedListQueue linkedListQueue = new LinkedListQueue();
		System.out.println(linkedListQueue.isEmpty());
		linkedListQueue.enQueue(10);
		linkedListQueue.enQueue(20);
		linkedListQueue.enQueue(30);
		System.out.println(linkedListQueue.isEmpty());
		System.out.println(linkedListQueue.peek());
		System.out.println(linkedListQueue.peek());
		System.out.println(linkedListQueue.deQueue());
		System.out.println(linkedListQueue.deQueue());
		linkedListQueue.delete();
	}
}
