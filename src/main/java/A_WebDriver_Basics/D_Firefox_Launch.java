package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_Firefox_Launch {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		String str = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		// System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());

		if (str.equalsIgnoreCase("UnitedHealthcare  Retiree - Home")) {
			System.out.println("Tilte Exactly Matched");
		} else {
			System.out.println("Tilte Not Matched");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
