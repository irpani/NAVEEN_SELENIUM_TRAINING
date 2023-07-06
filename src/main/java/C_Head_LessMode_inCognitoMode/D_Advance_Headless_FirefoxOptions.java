package C_Head_LessMode_inCognitoMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class D_Advance_Headless_FirefoxOptions {

	public static void main(String[] args) {

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");

		System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
