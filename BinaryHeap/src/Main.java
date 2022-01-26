
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap binaryHeap = new BinaryHeap(20);

		binaryHeap.insert(10, "Max");
		binaryHeap.insert(20, "Max");
		binaryHeap.insert(30, "Max");
		binaryHeap.insert(0, "Max");
		binaryHeap.insert(5, "Max");
		binaryHeap.insert(15, "Max");
		binaryHeap.insert(1, "Max");
		binaryHeap.traverse();

		System.out.println(binaryHeap.extract("Max"));
		binaryHeap.traverse();
	}

}
