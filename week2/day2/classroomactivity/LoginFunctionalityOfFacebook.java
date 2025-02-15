package week2.day2.classroomactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionalityOfFacebook {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//Enter the email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Click Login button
		driver.findElement(By.name("login")).click();
		//Click "Find your account and log in."
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//Close the browser
		
		//
		driver.close();
		
		
		
	}

}
