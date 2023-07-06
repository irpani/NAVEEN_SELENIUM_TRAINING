package C_Head_LessMode_inCognitoMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class E_Headless_IEOptions {

	public static void main(String[] args) {

		// io.addCommandSwitches("--headless");
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
