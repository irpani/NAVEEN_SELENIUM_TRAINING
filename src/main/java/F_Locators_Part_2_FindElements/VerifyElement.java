package F_Locators_Part_2_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		// WebElement provider = driver.findElement(By.linkText("Look up a provider
		// now"));
		// Case:(1) Element Visible Or Not

		// System.out.println("Element Visible On the WebPage -> " +
		// provider.isDisplayed());

		// Case:(2) Element Visible Or Not with driver.findElements()
		// On webPage we validate any element Present Or not like this ...
		// driver.findElements("") is also used to Validate the Element Present(or) not
		List<WebElement> provder = driver.findElements(By.tagName("a"));
		int list = provder.size();
		if (list > 0) {
			System.out.println("Element Visible");
		} else {
			System.out.println("Element not Visible");
		}

		// Case (3)
		// driver.findelements() we will discuss more when we discussing Select-> Class

		driver.close();

	}
}
