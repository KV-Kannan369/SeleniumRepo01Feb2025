package week1.day2.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, and 13
		int input = 8;
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1+" "+n2);
		for (int i = 2; i < input; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
