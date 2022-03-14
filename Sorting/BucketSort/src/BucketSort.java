import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

	int[] arr;

	public BucketSort(int[] arr) {
		this.arr = arr;
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void printBuckets(ArrayList<Integer>[] buckets) {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println("Bucket: " + i);
			for (int j = 0; j < buckets[i].size(); j++) {
				System.out.println(buckets[i].get(j) + " ");
			}
		}
	}

	// TimeCOmplexity O(nlogn)
	// SpaceComplexity O(n)
	public void bucketSort() {
		int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));

		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}

		ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];

		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}

		for (int value : arr) {
			int bucketNumber = (int) Math.ceil((float) value * numberOfBuckets / (float) max);
			buckets[bucketNumber - 1].add(value);
		}

		printBuckets(buckets);

		for (ArrayList<Integer> arrayList : buckets) {
			Collections.sort(arrayList);
		}

		System.out.println("Printing Buckets after sorting:::");
		printBuckets(buckets);

		int index = 0;
		for (ArrayList<Integer> bucket : buckets) {
			for (int value : bucket) {
				arr[index] = value;
				index++;
			}
		}
	}
}
