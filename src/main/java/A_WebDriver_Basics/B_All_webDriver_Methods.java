package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_All_webDriver_Methods {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		// Web_Driver :This One used to launch the Driver in Local Machine
		// Remote Web_Driver:This One used to launch the Driver in Remote Machine

		// Automation:
		// with this Line Selenium interating with Browser with Some Session_Id through
		// out the Program

		WebDriver driver = new FirefoxDriver();// This Line Creates One Session
												// Ex:Session_Id: 68dba2d8a0b149a1d3afac56fa74648032bcf46b
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		String str = driver.getTitle();
		System.out.println(str);

		String str2 = driver.getCurrentUrl();
		System.out.println(str2);

		// driver.getPageSource();

		// __________Automation Testing_________
		if (str.equals("Google")) {
			System.out.println("Matched");
		} else {

			System.out.println("Not matched");
		}

	}

}
