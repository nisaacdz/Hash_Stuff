package edit3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf('-'));
	}

	public static String timeConversion(String s) {
		// Write your code here

		int hour = Integer.parseInt(s.substring(0, s.indexOf(':')));

		String newS = s.substring(s.indexOf(':') + 1);

		String minute = newS.substring(0, newS.indexOf(':'));

		String thirdS = newS.substring(newS.indexOf(':') + 1);

		String m = thirdS.substring(thirdS.lastIndexOf('M') - 1);

		String second = thirdS.substring(0, thirdS.lastIndexOf('M') - 1);

		if (m.equals("PM") && hour != 12) {
			hour += 12;
		}
		if (m.equals("AM") && hour == 12) {
			hour = 0;
		}

		String i = ":";
		return b(String.valueOf(hour)) + i + b(minute) + i + b(second);
	}

	public static String b(String value) {
		if (value.length() == 1) {
			StringBuilder sb = new StringBuilder(value);
			sb.insert(0, '0');
			value = sb.toString();
		}
		System.out.println(value);
		return value;
	}

}
