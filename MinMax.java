import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// Stream 사용
		int[] array1 = new int[]{27, 35, 92, 75, 42};
		int min1 = Arrays.stream(array1).min().getAsInt();
		int max1 = Arrays.stream(array1).max().getAsInt();
		System.out.println(min1 + ", " + max1);

		// Arrays.sort 사용
		int[] array2 = new int[]{85, 42, 79, 95, 37, 11, 72, 32};
		Arrays.sort(array2);
		int min2 = array2[0];
		int max2 = array2[array2.length-1];
		System.out.println(min2 + ", " + max2);
	}
}
