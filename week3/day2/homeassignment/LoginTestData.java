package week3.day2.homeassignment;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter User Name - Child class");
	}
	public void enterPassword() {
		System.out.println("Enter Password - Child class");
	}

	public static void main(String[] args) {
		LoginTestData loginTest = new LoginTestData();
		loginTest.enterUsername();
		loginTest.enterPassword();
		loginTest.enterCredentials();
		loginTest.navigateToHomePage();
		
		TestData testData2 = new TestData();
		testData2.enterCredentials();
		testData2.navigateToHomePage();
		
		
		
	}

}
