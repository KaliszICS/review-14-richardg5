public class PracticeProblem {
	private static final int MAXIMUM = 10;
	public static void main(String args[]) {

	}

	public static int calculate(int in1, int in2, char operate) {
		switch (operate) {
			case '+':
				return in1 + in2;
			case '-':
				return in1 - in2;
			case '*':
				return in1 * in2;
			case '/':
				return in1 / in2;
			case '%':
				return in1 % in2;
			default:
				return (int) Math.pow((double) in1, (double) in2);
		}
	}

	public static boolean totalWordsChecker(String check) {
		return check.split("[^A-Za-z'_]+").length <= MAXIMUM;
	}

	public static String minString(String s1, String s2, String s3) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s3 = s3.toLowerCase();
		if (s1.compareTo(s2) <= 0) {
			if (s1.compareTo(s3) <= 0) {
				return s1;
			} else {
				return s3;
			}
		} else {
			if (s2.compareTo(s3) <= 0) {
				return s2;
			} else {
				return s3;
			}
		}
	}
}
