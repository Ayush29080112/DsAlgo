import java.util.Stack;

public class QueueViaStack {
	Stack<Integer> deQueueStack;
	Stack<Integer> enqueueStack;

	public QueueViaStack() {
		this.deQueueStack = new Stack<Integer>();
		this.enqueueStack = new Stack<Integer>();
	}

	public static void main(String[] args) {
		QueueViaStack q = new QueueViaStack();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(15);
		q.enqueue(16);
		q.enqueue(17);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

	public void enqueue(int i) {
		enqueueStack.push(i);
	}

	public int dequeue() {
		if (enqueueStack.isEmpty() && deQueueStack.isEmpty()) {
			System.out.println("Queue is Empty!!!");
			return -1;
		} else {
			if (deQueueStack.isEmpty()) {
				while (!enqueueStack.isEmpty()) {
					deQueueStack.push(enqueueStack.pop());
				}
			}
		}
		return deQueueStack.pop();
	}

}
