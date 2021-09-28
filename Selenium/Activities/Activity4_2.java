package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String Title=driver.getTitle();
		System.out.println("Page title is: " +Title);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Deepika");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajshte773@hdmc.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("7465365467");
		driver.findElement(By.xpath("//textarea")).sendKeys("form filled");
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
	}

}
