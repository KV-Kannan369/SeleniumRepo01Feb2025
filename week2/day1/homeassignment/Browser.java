package week2.day1.homeassignment;

public class Browser {

	
	public String launchBrowser(String browserName) {
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser browserOptions = new Browser();
		String str = browserOptions.launchBrowser("Browser launched successfully");
		System.out.println(str);
		browserOptions.loadUrl();
	}

}
