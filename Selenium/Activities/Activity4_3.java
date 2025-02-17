package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String Title=driver.getTitle();
		System.out.println("Page title is: " +Title);
		String Thirdelement= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("The Third Header is : "+Thirdelement);
		String FifthElement=driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("The Fifth Header color is: "+ FifthElement);
		String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violetButtonClasses);
        String GreyButton= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + GreyButton);
        
        //Close the browser
        driver.close();

	}

}
