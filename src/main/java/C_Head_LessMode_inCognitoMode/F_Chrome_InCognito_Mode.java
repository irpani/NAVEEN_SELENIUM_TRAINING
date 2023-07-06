package C_Head_LessMode_inCognitoMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class F_Chrome_InCognito_Mode {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");

		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.stage-medicare.uhc.com/retiree");

		System.out.println(driver.getCurrentUrl());
	}

}
