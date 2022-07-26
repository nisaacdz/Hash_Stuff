package edit2;

class Solution {

	public static void main(String[] args) {

		Solution sol = new Solution();
		long time1 = System.currentTimeMillis();
		int x = sol.divide(-2147483648, 2);
		long time2 = System.currentTimeMillis();
		double time = (double) (time2 - time1) / 1000;
		System.out.println("Answer is : " + x + ". Time taken : " + time + " seconds");
	}

	public int divide(int dividend, int divisor) {

		boolean negatable = dividend < 0 ^ divisor < 0;

		int index = 0;

		if (dividend == Integer.MIN_VALUE && (divisor == 1 || divisor == -1)) {
			if (negatable) {
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;

		}

		if (dividend == Integer.MIN_VALUE) {
			if (divisor > 0) {
				dividend += divisor;
			} else {
				dividend -= divisor;
			}
			index++;
		}

		divisor = Math.abs(divisor);
		dividend = Math.abs(dividend);

		while (dividend > 0) {
			index++;
			dividend = dividend - divisor;
		}

		if (dividend != 0) {
			index--;
		}

		if (negatable) {
			return -index;
		}
		return index;
	}
}
