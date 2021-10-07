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

public class Activity9 {
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
	  driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	  //System.out.println(rows.size());
	  Thread.sleep(5000);
	  for(int i=1; i<=10; i++) {
		    WebElement row3 = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[@class=' inlineEdit']"));
		    WebElement row8 = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[@class='hidden-xs hidden-sm inlineEdit']"));
		    System.out.println("Row " + i + ": " +row3.getText()  +row8.getText());
		}
	  //List<WebElement> columnList = driver.findElements(By.xpath("//table[@class='list view table-responsive']/thead/tr/th[3]"));
	//Looping through the list
	  //for(WebElement column : columnList) {
	    //System.out.println(column.getText());
	}
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
