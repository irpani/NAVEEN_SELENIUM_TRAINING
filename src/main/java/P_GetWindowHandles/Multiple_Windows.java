package P_GetWindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("popup3")).click();

		// _________________Case (1)_______________
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String Parent_win = it.next();
		System.out.println("Parent Window is :" + Parent_win);

		String child_win = it.next();
		System.out.println("Parent Window is :" + child_win);

		driver.switchTo().window(child_win);
		System.out.println(driver.getTitle());

		driver.close();
		driver.switchTo().window(Parent_win);
		System.out.println(driver.getTitle());

		// ________________Case (2)_______________

	}
}