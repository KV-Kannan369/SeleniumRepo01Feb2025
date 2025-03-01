package week3.day2.homeassignment;

public class TestData {
	
	public void enterCredentials() {
		
		System.out.println("Enter Credentials-Parent");
	}
	public void navigateToHomePage() {
		System.out.println("Navigate To Home Page-Parent");
	}
	
	public static void main(String[] args) {
		
		TestData testData = new TestData();
		testData.enterCredentials();
		testData.navigateToHomePage();
		
	}

}
