package D_Bornigracia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_Bornigraci_Firefox {

	public static void main(String[] args) {

		// WebDriverManager.firefoxdriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.stage-medicare.uhc.com/retiree");
		System.out.println("Title Of the Page is :" + driver.getTitle());
		driver.close();

	}

}
