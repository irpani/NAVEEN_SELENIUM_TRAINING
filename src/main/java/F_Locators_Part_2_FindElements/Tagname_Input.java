package F_Locators_Part_2_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Input {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("input"));
		int Totlalinks = linksList.size();
		System.out.println("Total input Links" + Totlalinks);

		for (int i = 0; i < Totlalinks; i++) {

			String text = linksList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}
			String str = linksList.get(i).getAttribute("id");
			System.out.println(i + "" + str);

		}

	}
}