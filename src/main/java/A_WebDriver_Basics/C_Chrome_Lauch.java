package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class C_Chrome_Lauch {
	public WebDriver driver;

	@BeforeTest
	public void Beforelaunch() {
		WebDriverManager.firefoxdriver().setup();

	}

	@Test
	public void Stringlaunch() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String str = driver.getTitle();
		System.out.println(str);
		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getClass());
		Assert.assertEquals(str, "Google");
	}
}
