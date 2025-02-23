package week3.day1.homeassignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String text = "changeme";

		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if ((i % 2) == 1) {

				charArray[i] = Character.toUpperCase(charArray[i]);

			}

		}
		System.out.println(charArray);
	}

}
