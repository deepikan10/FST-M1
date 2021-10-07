package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity7 {
	WebDriver driver;
	
	/*Wait wait = new FluentWait(driver)
		    .withTimeout(Duration.ofSeconds(45))
		    .pollingEvery(Duration.ofSeconds(5))
		    .ignoring(NoSuchElementException.class);*/
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
  }
  @Test
  public void f() throws NoSuchElementException, InterruptedException {
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
	  driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(@title, 'Additional Details')]")).click();
	  String Phonenumber= driver.findElement(By.className("phone")).getText();
	  System.out.println("The phone number in Addtional details is "+Phonenumber);	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
