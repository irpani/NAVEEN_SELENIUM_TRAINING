package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_Cross_Browser_Launch_If_else {
	public static void main(String[] args) {

		String str = "firefox";

		if (str.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.stage-uhcretiree.uhc.com/");
			driver.manage().window().maximize();
			driver.close();
		} else if (str.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			String str1 = driver.getTitle();
			System.out.println(str1);
			driver.close();

		}

		else if (str.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.stage-uhcretiree.uhc.com/");
			driver.close();

		}

		else {
			System.out.println("Browser Not Matching ....");
		}

	}
}
