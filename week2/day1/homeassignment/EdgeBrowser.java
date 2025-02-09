package week2.day1.homeassignment;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		String str2 = browser.launchBrowser("Browser launched Successfully-2");
		System.out.println(str2);
		browser.loadUrl();

	}

}
