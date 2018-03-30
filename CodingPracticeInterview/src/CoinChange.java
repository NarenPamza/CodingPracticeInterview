import java.util.Arrays;

public class CoinChange {
	
	static long countWays(int S[], int m, int n)
    {
        int a[]= new int[n+1];
        
        Arrays.fill(a, 0);
        
        a[0] = 1;
        
        for (int i = 0; i < m; i++) {
			
        	System.out.println("Combination---start--");
        	for (int j = S[i]; j <= n; j++) {
        		
				a[j] += a[j-S[i]];
				System.out.println(a[j]);
			}
        	System.out.println("Combination---End--");
		}
        
        return a[n];
    }
	
	// Driver Function to test above function
    public static void main(String args[])
    {
        int arr[] = {5,3, 6,2};
        int m = arr.length;
        int n = 10;
        System.out.println(countWays(arr, m, n));
    }

}
