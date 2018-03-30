import java.util.Stack;

public class bd {
	
	public static void main(String[] args) {
		int x =5, y=10;
		x = x ^ y ^ (y=x);
		
		System.out.println(x);
		System.out.println(y);
	}
}


