
public class Staircase {
	public static void main(String[] args) {

		
		
		int n = 5;
		int spaceCount = n-1;
		for (int i = 0; i < n; i++) {
			printSpace(spaceCount);
			printHash(i+1);
			System.out.println("");
			spaceCount--;
		}
	}
	
	static void printHash(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("#");

		}
	}
	
	static void printSpace(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");

		}
	}
}
