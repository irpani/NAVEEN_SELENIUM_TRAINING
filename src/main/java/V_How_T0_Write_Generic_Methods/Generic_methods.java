package V_How_T0_Write_Generic_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic_methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		driver.manage().window().maximize();

		// Locator's: Case.(1)
		// _________Identify webElement & Perform Action___________
		driver.findElement(By.id("username")).sendKeys("irfan.shaik77@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Allah786$");
		driver.findElement(By.id("login")).click();

		// Locator's: Case.(2)
		// _________ webElement Reusability ___________
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='']"));
		WebElement element2 = driver.findElement(By.id("password"));
		WebElement element3 = driver.findElement(By.id("login"));

		element1.sendKeys("irfan.shaik77@gmail.com");
		element2.sendKeys("Allah786$");
		element3.click();

		// Locator's: Case.(3)
		// _________ By Locator's ___________

		By elemnt1 = By.id("xxxx");
	}

}
