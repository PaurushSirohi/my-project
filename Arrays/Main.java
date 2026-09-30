package Arrays;

public class Main{
	public static int largestDigit(int n) {
		long value = Math.abs((long) n);
		int largest = 0;

		do {
			largest = Math.max(largest, (int) (value % 10));
			value /= 10;
		} while (value > 0);

		return largest;
	}
}
