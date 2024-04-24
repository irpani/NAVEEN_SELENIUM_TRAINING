package E_Locators_Part_1_FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_LinkText {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");

		By emailID = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By register = By.linkText("Register");
		By linksList = By.tagName("a");
		By headerList = By.tagName("h2");

		driver.findElement(emailID).sendKeys("irfan.shaik77@gmail.com");
		driver.findElement(password).sendKeys("Ayaan786$");
		driver.findElement(loginBtn).click();

		String actTitle = driver.getTitle();
		System.out.println(actTitle);

		System.out.println("--------------------");

		List<WebElement> headerlist = driver.findElements(headerList);
		// List<String> accHeadList = new ArrayList<String>();
		for (WebElement e : headerlist) {
			String text = e.getText();
			System.out.println(text);
		}

		System.out.println("--------------------");
		List<WebElement> acclinklist = driver.findElements(linksList);
		for (WebElement e : acclinklist) {
			String text = e.getText();
			if (!text.equals(null)) {

				System.out.println(text);
			}
		}

	}

}
