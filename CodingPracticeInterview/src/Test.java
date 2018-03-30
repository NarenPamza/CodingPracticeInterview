import java.util.Arrays;

public class Test {

	static int numbers[];
	static int length;

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 3, 4 };

		quicksort(a);

		System.out.println(Arrays.toString(numbers));

	}

	private static void quicksort(int[] a) {
		numbers = a;
		length = a.length;
		sort(0, length - 1);

	}

	private static void sort(int low, int high) {
		int pivot = numbers[low + (high - low) / 2];

		int i = low;
		int j = high;

		while (i <= j) {

			while (numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(i, j);
			}

			i++;
			j--;
		}

		if (low < j) {
			sort(low, j);
		}

		if (i < high) {
			sort(i, high);
		}
	}

	private static void swap(int i, int j) {
		int temp = numbers[j];
		numbers[j] = numbers[i];
		numbers[i] = temp;

	}
}
