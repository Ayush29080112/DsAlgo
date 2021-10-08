
public class Stack {

	Object[] arr;
	int top;

	// Time Complexity O(1)
	// space complexity O(N)
	public Stack(int size) {
		this.arr = new Object[size];
		this.top = -1;
		System.out.println("Empty stack created successfully!!!");
	}

	// isEmpty
	// Time Complexity O(1)
	// space complexity O(1)
	public boolean isEmpty() {
		return this.top == -1;
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public boolean isFull() {
		return this.top == this.arr.length - 1;
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public void push(Object o) {
		if (isFull()) {
			System.out.println("Stack is full!!!");
		} else {
			arr[top + 1] = o;
			top++;
			System.out.println("Value inserted successfully");
		}
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!!!");
			return null;
		} else {
			Object o = arr[top];
			arr[top] = null;
			top--;
			return o;
		}
	}

	// Time Complexity O(1)
	// space complexity O(1)
	public Object peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty!!!");
			return null;
		} else {
			Object o = arr[top];
			return o;
		}
	}

	public void delete() {
		arr = null;
		top = -1;
		System.out.println("Stack deleted");
	}
}
