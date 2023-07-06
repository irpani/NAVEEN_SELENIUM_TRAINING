package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_All_webDriver_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		// Web_Driver :This One used to launch the Driver in Local Machine
		// Remote Web_Driver:This One used to launch the Driver in Remote Machine

		// Automation:
		// with this Line Selenium interating with Browser with Some Session_Id through
		// out the Program

		WebDriver driver = new ChromeDriver();// This Line Creates One Session
												// Ex:Session_Id: 68dba2d8a0b149a1d3afac56fa74648032bcf46b
		driver.get("https://stage-medicare.uhc.com/");
		driver.manage().window().maximize();
		driver.getTitle();

		driver.close();
		String str = driver.getTitle();
		System.out.println(str);

		String str2 = driver.getCurrentUrl();
		System.out.println(str2);

		// driver.getPageSource();

		// __________Automation Testing_________
		if (str.equals("UnitedHealthcare Medicare Member Sign In")) {
			System.out.println("Matched");
		} else {

			System.out.println("Not matched");
		}
		driver.close(); // org.openqa.selenium.NoSuchSessionException: invalid session id
		// driver.quit(); // Session ID is null. Using WebDriver after calling quit()?
		// WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.google.com");
		// String str1 = driver1.getTitle();
		// System.out.println(str1);

		// driver.get("https://www.stage-medicare.uhc.com/");
		// driver.getTitle();
		// driver.getCurrentUrl();
		//

	}

}
