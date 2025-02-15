package week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsCreateLeadUsingBasicLocators {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Click company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		//Click Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kannan");
		//Click Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vel");
		//Click souceID-DD
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(element);
		//select.selectByIndex(4);
		//select.selectByValue("LEAD_EMPLOYEE");
		select.selectByVisibleText("Existing Customer");
		//Click Marketing Campaign
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selectMarketing = new Select(marketing);
		selectMarketing.selectByIndex(2);
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kannan");
		//Enter last name
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vel");
		//Enter Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		//Enter Dept.name
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		//Enter DOB
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/2025");
		//Enter Annual Revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		//Select Industry from DD
		WebElement industryEle = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySelect = new Select(industryEle);
		industrySelect.selectByValue("IND_SOFTWARE");
		//Enter No.of Employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
		//Select Ownership DD
		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownSelect = new Select(own);
		ownSelect.selectByVisibleText("Public Corporation");
		//Enter SIC Code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("abcd");
		//Enter ticker symbol
		driver.findElement(By.name("tickerSymbol")).sendKeys("abcd");
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc");
		//Enter important note
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Imp.Note");
		//Enter Country Code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+1");
		//Enter area code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		//Enter Phonenumber
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		//Enter Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("99");
		//Enter person to ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Kannan");
		//Enter email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
		//Enter web url
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.gmail.com");
		//Enter to name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kannan");
		//Enter Attn name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kannan");
		//Enter Addr1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("M.R.Radha Road,Chennai");
		//Enter Addr2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chengalpet District");
		//Enter City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		//Enter State/Province
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Georgia");
		//Enter Postal Code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6000000");
		//Enter extn code
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("009");
		//Click create lead button
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		driver.close();		 
		
		
		
	}

}
