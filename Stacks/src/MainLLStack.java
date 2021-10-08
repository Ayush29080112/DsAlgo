
public class MainLLStack {

	public static void main(String[] args) {
		StackLL stack = new StackLL();
		System.out.println(stack.l.head);
		stack.push(10);
		stack.push(12);
		stack.push(13);
		System.out.println(stack.l.head.getValue());
		System.out.println(stack.pop());
		System.out.println(stack.l.head.getValue());
	}
}
