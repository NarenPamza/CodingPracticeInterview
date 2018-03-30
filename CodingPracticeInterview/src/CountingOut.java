import java.util.ArrayList;
import java.util.List;

public class CountingOut {
	public static void main(String[] args) {
		int m = 3;
		int n = 5;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}

		findCountingOut(m, list);
	}

	private static void findCountingOut(int m, List<Integer> list) {
		int n = list.size();
		
		int count = 0;
		int i = 0;
		while( n >=1){
			
			if(n ==1){
				System.out.println(list.get(0));
				break;
			}
			
			if(count > list.size() -1){
				count = 0;
			}
			
			if(i == (m -1)){
				System.out.println(list.get(count));
				list.remove(count);
				count--;
				i = -1;
				n = list.size();
			}
			count ++;
			i++;
		}
	}
}
