package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_Opera_Launch {

	public static void main(String[] args) {
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://www.google.com");
		String str = driver.getTitle();
		System.out.println(str);
		driver.close();

	}

}
