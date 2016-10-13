package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {

		if(!text.equals("")) {
				return sumOfString(text);
		}
		else {
				return 0;
		}

	}

	private static String[] splitNumbers(String text) {
		if (text.contains(",")) {
			return text.split(",");
		}
		else {
			return text.split("");
		}
	}

  private static int sumOfString(String text) {
		String arr[] = splitNumbers(text);
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
				sum = sum + stringToInt(arr[i]);
		}
		return sum;
	}

	private static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
