package F_Locators_Part_2_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Anchor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// _____________________ 8.@Tagname ________________________
		// tagname --><html> ...... </html> Family ....
		// (8).tagname Conccept -> List<WebElement>

		// Case(1):-

		// List<WebElement> a = driver.findElements(By.tagName("a"));
		// List<WebElement> b = driver.findElements(By.tagName("img"));
		// List<WebElement> c = driver.findElements(By.tagName("input"));
		// List<WebElement> d = driver.findElements(By.tagName("button"));

		// (1).Count Total no Of Links On the Page
		// (2).get the text Of each Link
		// (3).get the href url property for each link

		// Case: (2):-
		// Validate the Element Present or not [Any Element we can validate with It]

		// Case (3):- we will discuss More On Select class with driver.findelements()

		// driver.get("https://classic.freecrm.com/");
		driver.get("https://www.amazon.com/");
		// _____ (1).Count Total no Of Links On the Page <a> tag with Href Property
		// _____
		// ____ (2).Count Total no Of images On the Page <img> with src property_____
		// _____ (3).How many text fields are there on the page <input>with id____
		// ____ (4).How many Check Boxes are there on the page <button> with btn_____

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		// ______ (2).get the text Of each Link_____
		int Totalinks = linksList.size();
		System.out.println("Total no of Links on this Page is.." + Totalinks);

		// ______(3).get the href url property for each link_____
		for (int i = 0; i < Totalinks; i++) {

			String text = linksList.get(i).getText();
			// this is the condition for removing Duplicates
			// If Constion is false then Only enter into the Loop
			if (!text.isEmpty()) {
				System.out.println(text);
				linksList.get(i).getAttribute("href");
				System.out.println(linksList.get(i).getAttribute("src"));
				// System.out.println(text1);
			}

		}
		// Observation :
		// In output I get all o/p's but Some Blanks reason because there in no text for
		// these Links..

		//

	}

}
