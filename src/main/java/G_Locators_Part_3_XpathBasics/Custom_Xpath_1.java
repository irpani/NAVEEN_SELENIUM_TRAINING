
package G_Locators_Part_3_XpathBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		// _____________(1). Absolute Xpath [Address]________________
		// //html/body/div[1]/div[5]/div[2]/li/a
		// Problem with this Approch is See here div Is changed like below for the Same
		// WebElement
		// we cann't handles the WebElement with this Approch,It will break the Xpath
		// //html/body/div[1]/div[7]/div[4]/li/a

		// __________ (2).Relative Xpath ______________
		// (2).Relative Xpath
		// we Used the Cutom Xpath i.e I define My Own Xpath for any webElement->

		// Instead of writing Complete Xpath we write Relative Xpath with Some
		// Properties
		// Ex:1 a[@id='test']
		// Ex:2 div//a[@id='test']
		// Ex:3 div//li//a[@id='test']

		// Relative Xpath goal:
		// --------------------
		// If you are interacting with 1 Element target to find unique Element
		// You can press Ctrl+f in Dom enter the //input or //a or //img it means
		// your engine directly Strat from there particular tag
		// here for input tag there are 3 elements Shown
		// your target always Should be 1 of 1
		// If you are interacting with One Element your target Should be unique Element
		// __________Input Tag ____________
		// Identify reltive Xpath for Hub Spot login
		// (1).//input[@id='username'] --> Only with Id[There is input field having
		// id='username']
		// (2).//input[@id='username' and @type] --> with Id & Single Property with-out
		// Value
		// input[@id='username' and @type='email'] --> with Id & Single Property
		// with-Value

		// (3).//input[@id and @type ='email'] -> Identify username unique way
		// input[@id and @type ='password']-> Identify password unique way
		// input[@id and @type ='checkbox']-> Identify checkbox unique way

		// (4).//with out property value ->3 locators are Available so Properties are
		// also Imp
		// input[@id and @type ]
		// __________Anchor Tag ____________

	}

}
