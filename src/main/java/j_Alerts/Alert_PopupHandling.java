package j_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopupHandling {

	public static void main(String[] args) throws InterruptedException {

		// Different Types Of Alerts ae present
		// (1).JavaScript Alert - popup : Reddiff Mail --> https://www.rediff.com/
		// (2).
		// (3).Fileupload Pop-up

		// (1).JavaScript Alert - popup : Reddiff Mail --> https://www.rediff.com/
		// we cann't Identified Pop-up alerts with locator's ....
		// alert('Hi naveen') ->This Alert thrown because we have alert() method in Java
		// Script
		// Q:How cn we handle this ???
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		if (text.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Correct mesage....");
		} else {
			System.out.println("Shown Wrong message");
		}
		alert.accept();
		alert.dismiss();// It's work like Escape the Alert/just Dismiss the Alert

	}

}
