package N_ActionClasses_Mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_With_Mouse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));

		// This is the SequenceOf Performing Drag & Drop
		Actions action = new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(targetElement).build().perform();

	}

}
