package N_ActionClasses_Mouse_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");

	}

}
