package ProjectActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity8 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
  }
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
	  driver.findElement(By.xpath("//a[@id='moduleTab_9_Accounts']")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  String Row1=driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[3]")).getText();
	  System.out.println(Row1);
	  String Row3=driver.findElement(By.xpath("//tr[3]/td[3]")).getText();
	  System.out.println(Row3);
	  String Row5=driver.findElement(By.xpath("//tr[5]/td[3]")).getText();
	  System.out.println(Row5);
	  String Row7=driver.findElement(By.xpath("//tr[7]/td[3]")).getText();
	  System.out.println(Row7);
	  String Row9=driver.findElement(By.xpath("//tr[9]/td[3]")).getText();
	  System.out.println(Row9);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
