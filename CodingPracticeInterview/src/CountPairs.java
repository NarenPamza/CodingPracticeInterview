import java.util.HashSet;
import java.util.Set;

public class CountPairs {

	public static void main(String[] args) {
		
	
		int[] arr = { 6,6,3,9,3,5,1 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		Object[] array = set.toArray();

		long sum = 12;

		int count = 0;// Initialize result

		// Consider all possible pairs and check their sums
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if ((int) array[i] + (int) array[j] == sum)
					count++;

		System.out.println(count);
	}

	
}
