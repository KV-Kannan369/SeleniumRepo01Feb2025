package week3.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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

		// Click CRM/SFA // Partial text base xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// Click on Leads - Text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click on Create Lead - Text based xpath
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		// Click Firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kannan");
		// Click Lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vel");
		// Click souceID-DD
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select select = new Select(element);
		// select.selectByIndex(4); //
		select.selectByValue("LEAD_EMPLOYEE");
		// select.selectByVisibleText("Existing Customer");
		// Click Marketing Campaign
		WebElement marketing = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select selectMarketing = new Select(marketing);
		selectMarketing.selectByIndex(2);
		// Enter first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kannan");
		// Enter last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Vel");
		// Enter Salutation
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Mr.");
		// Enter Title
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Mr.");
		// Enter Dept.name
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		// Enter DOB
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("01/01/2025");
		// Enter Annual Revenue
		driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("200000");
		// Select Industry from DD
		WebElement industryEle = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select industrySelect = new Select(industryEle);
		industrySelect.selectByValue("IND_SOFTWARE");
		// Enter No.of Employees
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("1000");
		// Select Ownership DD
		WebElement own = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ownSelect = new Select(own);
		ownSelect.selectByVisibleText("Public Corporation");
		// Enter SIC Code
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("abcd");
		// Enter ticker symbol
		driver.findElement(By.xpath("//input[@name='tickerSymbol']")).sendKeys("abcd");
		// Enter Description
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Desc");
		// Enter important note
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("Imp.Note");
		// Enter Country Code
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("+1");
		// Enter area code
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("123");
		// Enter Phonenumber
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234567890");
		// Enter Extension
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("99");
		// Enter person to ask for
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("Kannan");
		// Enter email
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abcd@gmail.com");
		// Enter web url
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("www.gmail.com");
		// Enter to name
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Kannan");
		// Enter Attn name
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("Kannan");
		// Enter Addr1
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("M.R.Radha Road,Chennai");
		// Enter Addr2
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("Chengalpet District");
		// Enter City
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Chennai");
		// Enter State/Province
		driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")).sendKeys("Georgia");
		// Enter Postal Code
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("6000000");
		// Enter extn code
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("009");
		// Click create lead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(5000);
		//Click Edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("NOTE UPDATED");
		//Enter update button
		driver.findElement(By.xpath("//input[@name='submitButton' and @type='submit' and @class='smallSubmit' and @value='Update']")).click();
		//Get title
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
		Thread.sleep(5000);
		driver.close();

	}

}
