
public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(5);
		stack.push(6);
		stack.push(1);
		stack.push(2);

		System.out.println(stack.pop());
		System.out.println(stack.top);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}

}
