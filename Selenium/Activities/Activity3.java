package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String Title=driver.getTitle();
		System.out.println(Title);
		WebElement Firstname= driver.findElement(By.id("firstName"));
		WebElement Lastname= driver.findElement(By.id("lastName"));
		Firstname.sendKeys("Deepika");
		Lastname.sendKeys("N");
		driver.findElement(By.id("email")).sendKeys("test@example.com");
		driver.findElement(By.id("number")).sendKeys("7358746337");
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		//driver.findElement(By.name("submit")).click();
		
		Thread.sleep(1000);
        driver.close();
		

	}

}
