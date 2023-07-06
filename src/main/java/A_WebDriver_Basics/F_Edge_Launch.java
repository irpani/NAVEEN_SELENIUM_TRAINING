package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class F_Edge_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "");
		WebDriver driver = new EdgeDriver();
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

			e.printStackTrace();
		}
		driver.close();

	}

}
