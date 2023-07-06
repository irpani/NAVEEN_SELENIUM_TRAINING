package A_WebDriver_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasics {

	public static void main(String[] args) {

		// Point (1)
		// Manual Step : In general Google Search First I click On Browser Icon On
		// Desktop It will Opened,RIGHT ?
		// I Installed Browser in My System they provide .exe file given Short cut Icon
		// for me ,but in
		// In Automation Step :How Browser Laucnhed?

		System.setProperty("wedriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // while Creating Object Constructor will be Called
		// Point (2)
		// ChromeDriver() Constructor -> Creates a new ChromeDriver using the default
		// server configuration.
		// But how it will Create Server Configurations ????

		// for each Browser they Provide
		// -------- ------------------
		// Browser Driver Executables [Acts A Servers took Req from User code give
		// Response]
		// ------- ------------------
		// Chrome chromedriver.exe
		// firefox gecko driver.exe
		// IE InternetExplorerdriver.exe
		// Opera Operadriver.exe
		// Safari Safaridriver.exe
		//

		// These Driver Executables acts as [Serevers] Intermidiary from our code to
		// Browser
		// Now Server took req from Our code Launch the Browser

		// forDriver Executables we need to Set up SERVER ?
		// Q:How will Set up a Server ?
		// A :Set up will be in Environment Variables ..
		// either you go to Environment Variables Set up the Environment or we can do it
		// Programatically also
		// firt we download the Server i.e .exe file must be Downloaded
		// Till Selenium 2 Selenium will responsible for these driver executables
		// Due to Compatible Issues from Selenium 3
		// y selenium stoppes because 2 reasons
		// (1).Compatiable Issues Google frequnetly Changing the Browser Versions Based
		// On that
		// Selenium Guys need to upgrade the .exe files so they left from Selenium 3
		// they are good at selenium not focus On Browsers that is Google firefox
		// their work
		// -------------0------------
		// Google Provides for Chrome driver .exe files[server] for Selenium Guys
		// Firefox Provides for geckodriver .exe filess[server] for Selenium Guys
		// Safari Provides for safaririver .exe files[server] for Selenium Guys
		// InternetExplorer Provides for IE Driver .exe files[server] for Selenium Guys
		// Opera Provides for Operadiriver .exe files[server] for Selenium Guys

	}

}
