package k_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Handling {

	public static void main(String[] args) {
		// frame is also part Of DOM[Document ObjetModel] ..
		// frame is also behave like a webelement it's having Property's ...like other
		// tags
		// <frame> src=" " name=" " scrolling margin width="" margin height=" "</frame >
		// Q:-In General How will Interact with webElements??
		// A:-with driver.findelement(By.id/name/class/xpath/css/linktext/partial
		// linktext/tagname))-> Either Of them to find the webElement

		// Interact with frame we will switch over to that Frame ...
		// Browser ----> Page --->Frame
		// frame ->window -> defaultContent

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		// Frame - index
		driver.switchTo().frame(0);
		// Frame -name
		driver.switchTo().frame("main");

		// Frame-webElement
		WebElement framename = driver.findElement(By.name("main"));
		driver.switchTo().frame(framename);

		String str = driver.findElement(By.xpath("//body//h2")).getText();
		System.out.println(str);
		driver.close();

	}

}
