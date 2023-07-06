package D_Bornigracia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class E_Bornigracia_Safari_Driver {

	public static void main(String[] args) {
		// webdriverManager.getInstance.(SafariDriverclass).setup();
		WebDriver driver = new SafariDriver();
		driver.get("https://www.stage-medicare.uhc.com/retiree");
		System.out.println(driver.getTitle());

	}

}
