package E_Locators_Part_1_FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_All_Locator_Basics {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com");
		Thread.sleep(6000);
		System.out.println(driver.getTitle());

		// ________________Locator - 8 Types______________

		// In this Class we discuss about 1-7 Types Of Locator's

		// (1).---------ID [https://app.hubspot.com/login]-----------

		// Case :(1) Single line [Worst Approch]
		// Identify webElement & perform Action At a time ... Not a good Approch

		driver.findElement(By.id("username")).sendKeys("aaaaa");
		driver.findElement(By.id("password")).sendKeys("bbbb");
		driver.findElement(By.id("loginBtn")).click();

		// ID
		// Case:(2) Best Approch
		// Create webElemnet Seperately then ->when ever I reuired webElements
		// I will use it & Perform Actions

		// Seperated webElemnets
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("loginBtn"));

		// Performing Ations
		emailid.sendKeys("aaaaaa");
		password.sendKeys("bbbb");
		login.click();

		// (2).______________name [ https://classic.freecrm.com/ ]_______________
		// Identify webElement & perform Action At a time ... Not a good Approch
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("")).click();

		// Seperated webElemnets
		WebElement usename = driver.findElement(By.name("username"));
		WebElement pasword = driver.findElement(By.name("password"));
		WebElement loginn = driver.findElement(By.name(""));

		// Performing Ations
		usename.sendKeys("xxxxxx");
		pasword.sendKeys("bbbbb");
		loginn.click();

		// (3).___________Class Name :_______________
		// [https://app.hubspot.com/login] usename password both have class names
		// [ https://classic.freecrm.com/ ] usename password & login all having class
		// names

		// With X_path We Can use all these 3 classes but with class name we can use
		// ether Of them Not All

		// form-control private-form__control login-email
		// By.xpath("form-control private-form__control login-email") --> Vaid
		// By.classname("form-control") --> Valid
		// By.classname("form-control private-form__control login-email") --> In-Valid

		// (4).________________ Xpath________________
		// Q:What is Xpath ??
		// A:It is the Address Of the webElement inside the DOM It is not the Property
		// Of the webElement
		// Ex:-<html> <div> <div> <div> <div> input="username"
		// that's y u cann't find it in the Dom like xpath ="username"
		// Ex: id ,name & Type ... and so on all these are properties
		// How will you find the X-path ???
		// Simple Right Click On the <input > tag Copy the Xpath
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		// _____________________CSS_______________
		// (5).CSS Selector ->It is the Locator but not the Element Property
		// It is an
		driver.findElement(By.cssSelector("##loginForm > div > input:nth-child(1)")).sendKeys("batchautomation");
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys("password");
		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();

		// _________________ Linktext _______________
		// (6).Link Text :It Should be Only for Links
		// html tag Should be <a> ....
		driver.findElement(By.linkText("Sign up")).click();
		// Ex: Covid Vacination Tool It displayd the Links with Text

		// _________________ Partial Linktext _______________

		// (7).Partial Link Text : Only for Links,you can pass partial link Of the Text
		// html tag Should be <a> ....
		driver.findElement(By.partialLinkText("Sign ")).click();

		// @Partial link Text In this Case If we use Sign in Selenium will Confuse which
		// one to Execute
		// So mostly Avoid it Partial link Text
		// Sign-up
		// Sign-in
		// _________________ tagname _______________

		// (8).tagname ->tagname related to html Family we will discuss in next Class

		// Rankings: for all Locator's

		// (1).Id I
		// (2).name I ,II
		// (3).XPATH III
		// (4).CSS III
		// (5).Link-Text No Rank Partial link Text No Rank

		// Note:-
		// Id link test which one you will prefer Id because text It may be Duplicate
		// ...Always prefer Id
		// 90 % Of the Cases for link text href means ->Hyperlink Reference with some
		// Text there is no Id
		// It is very rare Combination hardly we see ...

	}

}
