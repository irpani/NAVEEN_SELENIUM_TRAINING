package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class E_IE_Launch {

	public static void main(String[] args) {

		// System.setProperty("webdriver.ie.driver",
		// "D:\\Softwares\\library\\drivers\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		driver.manage().window().maximize();
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
