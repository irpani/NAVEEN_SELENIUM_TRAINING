package E_Driver_Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Navigator_Commands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stage-uhcretiree.uhc.com/");
		System.out.println(driver.getTitle());
		// _____Navigate Commands_____
		// navigate().To(url) ->
		// navigate().forward(); -->
		// navigate().back(); <--
		// navigate().refresh();

		driver.navigate().to("https://staging.allcloud.in/acetestuat/home/Welcome");
		System.out.println("ACE Title ");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("UHC Retiree Title ");
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		// four main Differences Between driver.navigate() & driver.get()
		// Both are used to Launch the URL but the main 4 differences As follows

		// 1.Driver will be Busy Untill page load No other Action performed untill Page
		// got loaded Successfully
		// .Driver free not wait for to Load the Complete page Remaninig steps executed
		// Parallely

		// Able to Do with navigator Commands but
		// (2). driver.navigate().to(""); ->Navigate to another Page Successfully
		// (3). driver.navigate().back(); (or) driver.navigate().forward();
		// (4). driver.navigate().refresh(); ->Able to refresh the Page

	}

}
