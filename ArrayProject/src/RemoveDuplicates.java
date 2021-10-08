import java.util.Collections;
import java.util.HashSet;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static int[] removeDuplicates(int[] arr) {
	    //   TODO
	    HashSet<Integer> s = new HashSet();
	    for(int i : arr){
	        s.add(i);
	    }
	    int[] a = new int[s.size()];
	    int index =0;
	    for (int i : s) {
			a[index] = i;
			index++;
		}
	    return a;
	  }
}
