package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class G_Opera_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "D:\\Lib\\operadriver.exe");
		WebDriver driver = new OperaDriver();
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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
