
public class FizzBuzz {
public static void main(String[] args) {
	
	int n = 100;
	
	for (int i = 1; i <= n; i++) {
		
		String value =  "";
		
		if(i % 3 == 0){
			value = "Fizz";
		}
		
		if( i %5 == 0){
			value = value+ "Buzz";
		}
		
		if(value.length() > 0 ){
			System.out.println(value);
		}else {
			System.out.println(i);
		}
	}
}
}
