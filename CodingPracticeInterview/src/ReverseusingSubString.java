
public class ReverseusingSubString {
	public static void main(String[] args) {
		String reverseMe = "naren";
		for (int i = 0; i < reverseMe.length(); i++) {
			
			reverseMe = reverseMe.substring(1, reverseMe.length() - i) + 
					reverseMe.substring(0, 1)
					+ reverseMe.substring(reverseMe.length() - i, reverseMe.length());
			System.out.println(reverseMe);	
		}
		System.out.println(reverseMe);
	}
}
