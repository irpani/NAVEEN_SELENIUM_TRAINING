package N_ActionClasses_Mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"));

		do_Move_To_Element(driver, menu);
		// Q:Difference Between Selec Class & Actions Class

		// ___Select Class_____
		// Select Class expect webElement as Argument
		// Select select1 = new Select(day);

		// ___Actions Class_____
		// Actions Class Expect driver as an argument
		// like click() & sendkeys() we have build().perform();
		// Build your Action with build ().perform() then perform Your Action
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(element).build().perform();
		 * driver.findElement(By.xpath("//a[@href='http://mrbool.com/course']")).click()
		 * ;
		 */
		// driver.close();

	}

	public static void do_Move_To_Element(WebDriver driver, WebElement element) {
		// Y I am passing driver here because Actions Class expect driver
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='http://mrbool.com/course']")).click();

	}

}
