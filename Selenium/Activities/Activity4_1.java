package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net");
		String Title=driver.getTitle();
		System.out.println("Page title is: " +Title);
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		System.out.println("Heading is: " + driver.getTitle());
		driver.close();

	}

}
