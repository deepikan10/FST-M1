package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
  }
  @Test
  public void f() {
	  String header= driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
	  System.out.println("The url of the header image is " +header);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
