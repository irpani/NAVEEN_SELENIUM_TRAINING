package D_Bornigracia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Bornigracia_Chrome {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver Launched..");
		driver.get("https://www.stage-medicare.uhc.com");
		driver.manage().window().maximize();
		System.out.println("The Title Of the PAGE is:----->" + driver.getTitle());
		System.out.println("current URL of the site is:--->" + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
	}

}
