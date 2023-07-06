package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
			System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.stage-uhcretiree.uhc.com/");
			driver.manage().window().maximize();
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
