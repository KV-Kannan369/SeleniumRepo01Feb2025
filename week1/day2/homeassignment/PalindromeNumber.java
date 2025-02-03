package week1.day2.homeassignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = 969;
		int digit = 3;
		int remainder;
		int output;
		int reverse = 0;
		int temp = input;

		for (int i = 1; i <= digit; i++) {

			remainder = temp % 10;
			reverse = (reverse * 10) + remainder;
			temp = temp / 10;
			System.out.println("Reverse: " + reverse);

		}
		System.out.println("Reverse final : " + reverse);
		System.out.println("Input original :" + input);
		if (reverse == input)
			System.out.println("Palindrome");
		else
			System.out.println("NOT");
	}

}
