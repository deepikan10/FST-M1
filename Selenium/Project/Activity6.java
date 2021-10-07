package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity6 {
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
	  boolean Activities= driver.findElement(By.xpath("//a[@id='grouptab_3']")).isDisplayed();
	  System.out.println("The Activities option is displayed: "+Activities);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
