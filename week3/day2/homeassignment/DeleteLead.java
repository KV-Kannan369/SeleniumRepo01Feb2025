package week3.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		// Chrome Browser Launch
		ChromeDriver driver = new ChromeDriver(options);
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		// Enter usernmae
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Click the "crm/sfa" link
				driver.findElement(By.partialLinkText("CRM/SFA")).click();

				// Click the "Leads" link
				driver.findElement(By.linkText("Leads")).click();

				// Click "Find leads"
				driver.findElement(By.linkText("Find Leads")).click();

				// Click on the "Phone" tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// To Avoid Stale Element Exception
				Thread.sleep(2000);
		//Capture the lead ID of the first resulting lead
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
				.getText();
		System.out.println("Lead ID is :" + leadID);
		// Click the first resulting lead
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

				// Click the "Delete" button
				driver.findElement(By.linkText("Delete")).click();

				// Click "Find leads" again
				driver.findElement(By.linkText("Find Leads")).click();

				// Enter the captured lead ID
				driver.findElement(By.name("id")).sendKeys(leadID);

				// Click the "Find leads" button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

				// Sleep for the find results to refresh
				Thread.sleep(2000);

				// Verify the presence of the message "No records to display" in the Lead List.
				// This message confirms the successful deletion.

				String text = driver.findElement(By.className("x-paging-info")).getText();
				if (text.equals("No records to display")) {
					System.out.println("Lead has been deleted successfully");
				} else {
					System.out.println("Lead has not been deleted- Pls Check");

				}

				// click on logout
				driver.findElement(By.linkText("Logout"));

				// Close the browser.
				driver.close();			
		
		
		

	}

}
