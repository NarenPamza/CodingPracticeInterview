import java.util.Arrays;

public class ReplaceString {

	public static void main(String[] args) {
		String test = "nar e n";
		replaceString(test);
	}

	private static void replaceString(String test) {
		char[] charArray = test.toCharArray();

		int space = 0;
		for (char c : charArray) {
			if (c == ' ') {
				space++;
			}
		}

		int newLength = charArray.length + (space * 2);
		char[] newArray = new char[newLength];

		int length = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				newArray[length] = '%';
				newArray[length + 1] = '2';
				newArray[length + 2] = '0';
				length = length + 3;
			} else {
				newArray[length] = charArray[i];
				length++;
			}
		}
		
		System.out.println(Arrays.toString(newArray));
	}

}
