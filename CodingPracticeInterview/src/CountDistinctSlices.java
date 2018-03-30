import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {

	public static void main(String[] args) {

		int arr[] = {1, 2, 1, 3, 4, 2, 3};
		
		int k = 4;
		countDistinct(arr,k,0);
		
		
	}
	
	static void countDistinct(int[] arr, int k, int i){
		
		if(arr.length - i >= k){
			Set<Integer> set = new HashSet<Integer>();
			for (int j = i; j < i+k; j++) {
				set.add(arr[j]);
			}
			System.out.println(set.size());
			i++;
			countDistinct(arr, k, i);
		}
	}
}
