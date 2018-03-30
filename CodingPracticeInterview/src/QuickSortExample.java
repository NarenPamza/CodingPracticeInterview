
public class QuickSortExample {
	
	public static void main(String[] args) {
		
	}
	
	void sort(int[] arr, int l, int r){
		
		
		if(l<=r){
			
			
			int partition = partion(arr, l,r);
			
			sort(arr, l, partition );
			sort(arr, partition +1, r);
		}
	}

	private int partion(int[] arr, int l, int r) {
		
		int pivot = arr[r];
		
		for (int i = l; i < r; i++) {
			
			if(arr[i] <= pivot){
				//Swap a[i] and a[j]
				
			}
			
		}
		
		
		
		return 0;
	}

}
