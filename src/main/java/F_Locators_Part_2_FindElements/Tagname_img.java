package F_Locators_Part_2_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname_img {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("img"));
		int Totlalinks = linksList.size();
		System.out.println("image Links" + Totlalinks);

		for (int i = 0; i < Totlalinks; i++) {

			String text = linksList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}

			String str = linksList.get(i).getAttribute("src");
			System.out.println(str);
		}

	}

}
