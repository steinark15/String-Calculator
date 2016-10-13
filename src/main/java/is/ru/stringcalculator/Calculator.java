package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {

		if(!text.equals("")) {

				if(text.length() == 1) {
					return stringToInt(text);
				}

				else if(text.contains(",")) {
					 return getIntegersFromCommaString(text);
				}
				else {
					return -1;
				}
		}
		else {
			return 0;
		}
		
	}

	private static String[] splitNumbers(String text) {
		return text.split(",");
	}

  private static int getIntegersFromCommaString(String text) {
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
