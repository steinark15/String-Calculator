package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {

		if(text.equals("")) {
			return 0;
		}
		else if(text.contains(",")) {
			 return getIntegersFromCommaString(text);
		}
		else {
			return 1;
		}

	}
  public static int getIntegersFromCommaString(String text) {
		String arr[] = text.split(",");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
				sum = sum + stringToInt(arr[i]);
		}
		return sum;
	}

	public static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
