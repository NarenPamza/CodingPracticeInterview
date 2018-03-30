import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestB {

	

	public static void SubString(String str, int n) {
		SortedSet<String> sets = new TreeSet<String>();
		for (int i = 0; i < n; i++){
			
			for (int j = i + 1; j <= n; j++){
				
				// Please refer below article for details
				// of substr in Java
				// https://www.geeksforgeeks.org/java-lang-string-substring-java/
				sets.add(str.substring(i, j));
			}
		}
		
		System.out.println(sets.last());

	}

	public static void main(String[] args) {
		String str = "aaa";
		SubString(str, str.length());
	}

}