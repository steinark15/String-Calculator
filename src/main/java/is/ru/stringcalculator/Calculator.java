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

//Converst string array into string
	private static String stringArrayToString(String[] arr) {
		String string = "";
		for(int i = 0; i < arr.length; i++) {
			string += arr[i];
		}
		return string;
	}

	//Recursively removes , and \n from string text and returns string []
	private static String[] splitNumbers(String text) {

		if (text.contains(",")) {
			text = stringArrayToString(text.split(","));
			return splitNumbers(text);
		}
		else if (text.contains("\n")) {
			text = stringArrayToString(text.split("\n"));
			return splitNumbers(text);
		}
		else {
			return text.split("");
		}
	}

	//returns the sum of a clean string array
	private static int sum(String[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
				sum = sum + stringToInt(arr[i]);
		}
		return sum;
	}

	//returns the sum string
  private static int sumOfString(String text) {
		String arr[] = splitNumbers(text);
		return sum(arr);
	}

	//converts string to int
	private static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
