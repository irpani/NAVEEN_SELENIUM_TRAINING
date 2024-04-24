package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J_Cross_Browser_Swith_Case {
	// WebDriver driver;

	public static void main(String[] args) {

		String str = "firefox";

		switch (str) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.stage-uhcretiree.uhc.com/");
			driver.manage().window().maximize();
			driver.close();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			driver1.get("https://www.google.com/");
			driver1.manage().window().maximize();
			System.out.println(driver1.getTitle());
			driver1.close();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
			WebDriver driver2 = new InternetExplorerDriver();
			driver2.get("https://www.stage-uhcretiree.uhc.com/");
			driver2.manage().window().maximize();
			driver2.close();
			break;

		default:
			System.out.println("No Browser Got Matched");
			break;
		}

	}

}
