package D_Bornigracia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_Bornigracia_CrossBrowser_SwithCase {

	public static void main(String[] args) {
		String str = "chrome";
		switch (str) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver.getTitle());
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			driver1.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver1.getTitle());
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			WebDriver driver2 = new InternetExplorerDriver();
			driver2.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver2.getTitle());

		default:
			break;
		}

	}

}
