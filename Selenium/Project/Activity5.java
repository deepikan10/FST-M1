package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Activity5 {
	WebDriver driver;
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  driver= new FirefoxDriver();
		  driver.get("http://alchemy.hguy.co/crm");
	  }
	  @Test
	  public void f() {
		  driver.findElement(By.id("user_name")).sendKeys("admin");
		  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  String menucolor= driver.findElement(By.className("desktop-toolbar")).getCssValue("color");
		  System.out.println("the color of the navigation menu is " +menucolor);
	  }
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
  }

}
