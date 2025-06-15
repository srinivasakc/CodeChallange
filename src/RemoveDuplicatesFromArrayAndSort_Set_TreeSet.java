import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArrayAndSort_Set_TreeSet {
	public static void main(String[] args) {
		int a[] = { 12, 2, 3, 4, 34, 37, 23, 45, 6, 6, 79, 10, 46, 46, 12 };

		// adding array elements to set to remove duplicates
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		// sort the elements in the set
		TreeSet<Integer> sortedset = new TreeSet<Integer>(set);

		System.out.println(sortedset);

		// fill all the elements in the a[] with zero
		Arrays.fill(a, 0);
		// fill all the digits in the set to a[]
		int i = 0;
		for (Integer integer : set) {
			a[i++] = integer;
		}

		System.out.println(Arrays.toString(a));

	}
}
