package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Chrome_Lauch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

	}
}