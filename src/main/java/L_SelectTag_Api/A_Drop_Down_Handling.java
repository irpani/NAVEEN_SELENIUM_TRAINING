package L_SelectTag_Api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_Drop_Down_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();

		// driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("shaik");
		driver.findElement(By.name("lastname")).sendKeys("Ayaan");
		driver.findElement(By.name("reg_email__")).sendKeys("9963650976");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Optum786$");
		// Thread.sleep(5000);

		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));

		Select select1 = new Select(day);
		select1.selectByVisibleText("1");

		Select select2 = new Select(month);
		select2.selectByVisibleText("Jan");

		Select select3 = new Select(year);
		select3.selectByVisibleText("1986");

		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

		// ________Case (1) Not the Right Approch to Handle the DropDown_____

		/*
		 * what is the Problem with this Approch I have 3 Drop Downs I created 3 Select
		 * Classes If I have 1000 Drop Downs 1000 Select classes will Create It is
		 * Verbose Right
		 */

	}

}
