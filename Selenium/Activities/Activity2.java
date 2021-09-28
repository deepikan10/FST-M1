package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net");
		String Title=driver.getTitle();
		System.out.println("Page title is: " +Title);
		WebElement idlocator=driver.findElement(By.id("about-link"));
		System.out.println("Test in element is "+ idlocator.getText());
		WebElement classnamelocator=driver.findElement(By.className("green"));
		System.out.println("Test in element is "+ classnamelocator.getText());
		WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());
        driver.close();

	}

}
