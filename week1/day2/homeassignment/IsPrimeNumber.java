package week1.day2.homeassignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		checkPrime(0);
		checkPrime(1);
		checkPrime(2);
		checkPrime(3);
		checkPrime(4);
		checkPrime(5);
		checkPrime(6);
		checkPrime(7);
		checkPrime(8);
		checkPrime(9);
		checkPrime(10);
											
}
	static void checkPrime(int n)
	{
		int i,m=0,flag=0;
		m = n/2;
		if(n==0||n==1)
		{
			System.out.println(n+ " ==> is Not a Prime Number");
		}
		else {
		for (i = 2; i <=m; i++) {
			if(n%i==0)
			{
				System.out.println(n+ " ==> is NOT a PRIME NUMBER");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+" ==> is a PRIME NUMBER");
			}
		}

	}
}
