
public class Fibonacci {

	public static void main(String[] args) {

		int n = 1;
		getFibonacci(n+1);
	}

	private static void getFibonacci(int n) {
		int a[] = new int[n];
		a[0]= 0;
		a[1]= 1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		if( n > 2){
			
			for (int i = 2; i < n; i++) {
				a[i]= a[i-2] + a[i-1];
				System.out.println(a[i]);
			}
		}
	}
}
