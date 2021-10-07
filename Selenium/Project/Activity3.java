package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity3 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
  }
  @Test
  public void f() {
	  WebElement copyrighttest1= driver.findElement(By.xpath("//a[@id='admin_options']"));
	  System.out.println("The 1st copyright text is" +copyrighttest1);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
