package week3.day1.homeassignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "stoss";
		String str1 = "";
		String str2 = "";
		// int length = charArray.length;
		// int length2 = charArray2.length;
		int length = text1.length();
		int length2 = text2.length();
		if (length == length2) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray.length; i++) {
				str1 = str1 + charArray[i];
			}
			System.out.println("Str1: " + str1);
			for (int i = 0; i < charArray2.length; i++) {
				str2 = str2 + charArray2[i];
			}
			System.out.println("Str2: " + str2);
			if (str1.equals(str2))
				System.out.println("Anagram");
			else
				System.out.println("NOT ANAGRAM");
		} else {
			System.out.println("Not Anagram");
		}

	}
}
