
public class TestComparator {
	
	public static void main(String[] args) {
		
		int x = 3 | 5;
		System.out.println(x);
	}

	
	
	class Comparator  {

		public boolean compare(int a, int b) {
			return (a == b);
		}

		public boolean compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.equalsIgnoreCase(o2);
		}

		public boolean compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub

			boolean result = false;

			if (o1.length == o2.length) {
				for (int i = 0; i < o2.length; i++) {
					if (o1[i] != o2[i]) {
						return false;
					}
				}
				return true;
			}

			return result;
		}
	}
}
