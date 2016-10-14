package is.ru.stringcalculator;


public class Calculator {

	public static int add(String text) {
		if(!text.equals("")) {
			if (containsNegative(splitNumbers(text))) {
				throw new IllegalArgumentException("Negative numbers not allowed. Found: " + getNegativeNumbers(splitNumbers(text)));
			}
				return sumOfString(text);
		}
		else {
				return 0;
		}
	}

	private static boolean containsNegative(String[] arr) {
		for (String number : arr) {
			if (stringToInt(number) < 0) {
				return true;
			}
		}
		return false;
	}

	private static String getNegativeNumbers(String[] arr) {
		String negatives = "";
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
				if (stringToInt(arr[i]) < 0) {
					if(counter == 0) {
						negatives = arr[i];
						counter ++;
					}
					else {
						negatives += "," + arr[i];
					}
			}
		}
		return negatives;
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

		if (text.contains("\n")) {
			return text.split("\n");
		}
		else {
			return text.split(",");
		}

	}

	//returns the sum of a clean string array
	private static int sum(String[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(stringToInt(arr[i]) <= 1000) {
				sum = sum + stringToInt(arr[i]);
			}
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
