package com.shoaib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * @Author:- Shoaib Hannure
 * 
 */
public class SendKeysCharSequence {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.id("username"));
		// 1. String
		// email.sendKeys("shoaib@gmail.com");

		// 2. StringBuilder-- is a mutuable class
		/*
		 * StringBuilder username = new StringBuilder() .append("shoaib")
		 * .append("_") .append("hannure") .append("@") .append("bcci")
		 * .append(".") .append("com");
		 * 
		 * email.sendKeys(username );
		 */

		// 3. StringBuffer-- is a mutuable class
		/*
		 * StringBuffer username=new StringBuffer() .append("shoaib")
		 * .append("_") .append("hannure") .append("@") .append("bcci")
		 * .append(".") .append("com"); email.sendKeys(username );
		 */

		// 4. StringBuffer, StringBuilder, String, Keys
		StringBuilder username = new StringBuilder().append("shoaib").append("_").append("hannure").append("@")
				.append("bcci").append(".").append("com");

		String space = "";

		StringBuffer userInfo = new StringBuffer().append("sachin").append("_").append("tendulkar").append("@")
				.append("bcci").append(".").append("com");

		String author = "Shoaib Hannure";
		email.sendKeys(username, space, userInfo, space, author, Keys.TAB);
	}

}
