
public class Main {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 1, 2, 60, 50 };
		BucketSort bucketSort = new BucketSort(arr);
		bucketSort.display(bucketSort.arr);
		bucketSort.bucketSort();
		bucketSort.display(bucketSort.arr);
	}

}
