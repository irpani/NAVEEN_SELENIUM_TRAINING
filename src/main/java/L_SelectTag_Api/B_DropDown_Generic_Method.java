package L_SelectTag_Api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B_DropDown_Generic_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();

		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));

		driver.findElement(By.name("firstname")).sendKeys("shaik");
		driver.findElement(By.name("lastname")).sendKeys("Ayaan");
		driver.findElement(By.name("reg_email__")).sendKeys("9963650976");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Optum786$");

		select_By_Visible_Text(day, "14");
		select_By_Visible_Text(month, "Apr");
		select_By_Visible_Text(year, "1986");
		// ______Generic Approch -Conclusion_______
		// If your Entire UHG Project having 1000 Drop Down's we can Handle it ...

	}

	// _____DropDown Generic method______
	public static void select_By_Visible_Text(WebElement element, String str) {
		Select select1 = new Select(element);
		select1.selectByVisibleText(str);
	}

}
