
public class Demo {
	public static void main(String[] args) {
		String a = "123";
		
		char[] charArray = a.toCharArray();
		
		int num = 0;
		for (int i = 0; i < charArray.length; i++) {
			num *= 10;
			
			System.out.println((int)charArray[i]);
			num += (charArray[i] - '0');
		}
		
		System.out.println(num);
	}
}
