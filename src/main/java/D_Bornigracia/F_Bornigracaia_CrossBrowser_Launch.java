package D_Bornigracia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_Bornigracaia_CrossBrowser_Launch {

	public static void main(String[] args) {

		String str = "ie";
		if (str.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver.getTitle());
		} else if (str.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver.getTitle());
		}

		else if (str.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.stage-medicare.uhc.com/retiree");
			System.out.println(driver.getTitle());
		}

	}

}
